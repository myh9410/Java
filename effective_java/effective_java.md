## 이펙티브 자바 내용 정리
- 필요한 내용만 정리하였음
### 1. 매개변수가 많은 생성자의 경우, 빌더패턴을 고려하라
```java
NutritionFacts cocaCola = new NutritionFacts();
cocaCola.setServingSize(240);
cocaCola.setServings(8);
cocaCola.setCalories(100);
cocaCola.setSodium(35);
cocaCola.setCarbohydrate(27);

/**TO-BE**/
NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
        .calories(100).sodium(35).carbohydrate(27).build();
```
파라미터에 대한 유효성 검사는 생성자에서 불변식을 검사한다. -> 잘못된 경우, IllegalArgumentException

### 2. 불필요한 객체 생성을 피하라
```java
String s1 = new String("bikini");
//s1은 String 인스턴스가 호출될때마다 생성된다.
String s2 = "bikini";
//s2는 하나의 String 인스턴스만 사용하여 객체의 재사용성이 보장된다.
```
아래와 같이 캐싱을 통한 성능 향상을 기대할 수 있다.
```java
class Numeric {
    //matches 내부의 패턴 인스턴스는 한번 사용하고 버려져, gc의 대상이 된다.
    static boolean isDigit(String s) {
        return s.matches("^[0-9]$");
    }
}

/**TO-BE**/
class Numeric {
    //패턴 인스턴스를 캐싱해두고, isDigit 메서드 호출 시 마다 재사용한다.
    private static final String pattern = "^[0-9]$";
    
    static boolean isDigit(String s) {
        return s.matches(pattern);
    }
}
```

### 3. try-finally 보다는 try-with-resources를 사용하라 (java7 이상 - AutoCloseable 이슈)
- 자원회수의 이슈로 인하여 try-with-resource 사용을 권장하는 내용같음
```java
BufferedReader br = new BufferedReader(new FileReader(path));
try {
    br.readLine();
} finally {
    br.close();
}

/**TO-BE**/
try(BufferedReader br = new BufferedReader(new FileReader(path))) {
    return br.readLine();
}
//try-with-resource 구조에서 catch는 아래처럼 try 구문에 이어서 추가 가능
catch (IOException ex){
    return ex.getMessage();
}
```

### 4. 클래스와 멤버의 접근 권한을 최소화하라
1. 모든 클래스와 멤버의 접근성을 가능한 한 좁힌다
   - public 클래스의 인스턴스 필드는 되도록 public이 아니어야 한다.
     - public 가변 필드를 갖는 클래스는 일반적으로 thread safe하지 않다.
     - private 인스턴스를 만들고, 이에 접근할 수 있는 Getter, Setter를 만든다. (다만, Getter가 있다고 무조건 Setter를 만드는 것은 지양한다.)
2. 변경 가능성을 최소화하라
     - 모든 필드를 private final로 지정한다.
     - 자기 클래스 외에는 가변 컴포넌트에 접근할 수 없도록 한다.
     - 불변 객체는 thread safe하여 안심하고 공유할 수 있다.  

불변인 클래스를 보장하는 방법
- 자신을 상속하지 못하도록, 생성자를 private이나 package-private하게 만들고, public 정적 생성자를 제공한다.
```java
public class Size {
    private final double width;
    private final double length;
    
    private Size(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public static Size valueOf(double width, double length) {
        return new Size(width, length);
    }
}
```

### 5. Generic
1. Raw Type은 사용하지 않는다
    - 컴파일 과정에서 에러를 발견하기 어렵다
    ```java
        private final Collection stamps = ...; //안좋은 코드
        stamps.add(new Coin(...)); //"unchecked call" 경고만 나옴
    
        private final Collection<Stamp> stamps = ...; // 다음과 같이 명시하자.
    ```
    - ```List```와 ```List<Object>```의 차이
        - ```List```는 Raw Type
        - ```List<Object>```는 모든 타입을 허용한다는 것을 명시
    - ```instanceof``` 연산자에 한하여 Raw Type 사용은 괜찮다
    ```java
        if (o instanceof Set) {
            Set<?> s = (Set<?>) o;
        }
    ```
    - ```@SuppressWarnings("unchecked")``` 어노테이션으로 경고를 숨길때는 항상 이유를 주석으로 달자
2. 배열과 리스트
    - 런타임 시 에러가 발생
      ```java
      Object[] objectArray = new Long[];
      objectArray[0]; // ArrayStoreException 발생
      ```
    - 컴파일 시 에러가 발생
      ```java
      List<Object> ol = new ArrayList<Long>();
      ol.add("문자열"); // 컴파일 에러 발생
      ```

### 6. 열거 타입(Enum)과 어노테이션(@)
1. int 상수 대신 열거 타입을 사용하라
    - JAVA의 열거타입은 클래스, 상수 하나당 인스턴스를 만들어 public static final 필드로 공개한다
    - 외부에서 접근가능한 생성자가 없으므로 외부에서의 생성, 삭제에 대한 우려가 없다
    - 열거 타입 내에서 메서드를 가질 수 있다
    - ```java
         public enum Planet {
            MERCURY(3.302e+23, 2.439e6),
            VENUS(4.869e+24, 6.052e6),
            ...
      
            private final double mass;
            private final double surfaceGravity;
      
            public double surfaceWeight(double mass) {
               return mass * surfaceGravity;
            }
         }
      ```
2. ordinal 메서드 대신 인스턴스 필드를 사용하라
    - ordinal의 경우, 상수 선언 순서를 바꾸는 순간 오류가 발생할 수 있다
    - 중간 값을 비워둘 수 없다
    - ```java
         public enum Ensemble {
            SOLO(1), DUET(2), OCTET(8), ...
      
            private final int numberOfMusicians;
            public int numberOfMusicians() { return numberOfMusicians; }
            Ensemble(int size) { this.numberOfMusicians = size; }
         }
      ```
3. 열거한 값들이 집합으로 사용되는 경우, EnumSet을 사용하라
```java
public class Text {
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}
   
   public void applyStyles(Set<Style> styles) { ... }
}

text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
```
4. 인터페이스를 사용하여 열거타입을 확장할 수 있다

```java
public interface Operation {
    double apply(double x, double y);
}

public enum BasicOperation implements Operation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x-y;
        }
    }
    ...
}
```
### 7. 람다와 스트림