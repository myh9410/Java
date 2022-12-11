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