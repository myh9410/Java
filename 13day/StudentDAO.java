package daoex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

import modelex.StudentDTO;
import studentMain.StudnetMain;

/*
 	운영(control) : 각 동작에 따른 메서드들의 집합소
 	데이터 저장소 ArrayList를 만들어 놓고
 	사용자의 요구(삽입/삭제/수정/츨략)가 있을 때마다
 	해당 메서드를 호출할 수 있도록 정의해 놓자!
 */
public class StudentDAO {
	private ArrayList<StudentDTO> list = new ArrayList<>();

	public StudentDAO() {
		StudentDTO s1 = new StudentDTO("김철수", 10, 20, 30);
		StudentDTO s2 = new StudentDTO("김철민", 10, 23, 34);
		StudentDTO s3 = new StudentDTO("김민수", 11, 24, 36);
		StudentDTO s4 = new StudentDTO("김호수", 12, 25, 38);
		StudentDTO s5 = new StudentDTO("김민호", 13, 26, 32);
		StudentDTO s6 = new StudentDTO("김수철", 14, 27, 32);
		StudentDTO s7 = new StudentDTO("김철수", 80, 80, 81);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);

	}

	public void print() { // 학생정보 출력하는
		System.out.println("\t=========학생 정보 출력=========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		if (list.size() == 0) {
			System.out.println("\n-------------------------------------------------");
			System.out.println("☞ 출력할 학생 정보가 없어요");
			System.out.println("-------------------------------------------------\n");
		} else {
			for (StudentDTO tmp : list) {
				System.out.println(tmp); // tmp만 쓰면 .toString때문에 해쉬코드만 나옴
											// - DTO에서 .toString 재정의
			}
		}
	}

	public void insert() {
		System.out.println("\t=========학생 정보 입력=========");
		String name = JOptionPane.showInputDialog("이름 입력");
		int kor = Integer.parseInt(JOptionPane.showInputDialog("국어 입력"));
		int eng = Integer.parseInt(JOptionPane.showInputDialog("영어 입력"));
		int math = Integer.parseInt(JOptionPane.showInputDialog("수학 입력"));
		/*
		 * list.add(name, kor, eng, math); ->불가능 한 이유: 제네릭이 하나밖에 못들어감. String타입과
		 * int타입이 같이 있다.
		 */
		list.add(new StudentDTO(name, kor, eng, math));
		// 입력받은 정보를 학생 정보에 넣어주고 출력하면 포함해서 출력됨.
	}

	public void delete() {
		System.out.println("\t=========학생 정보 삭제=========");

	}

	public void update() {
		System.out.println("\t=========학생 정보 수정 중=========");
		// 1.수정 - 학생 정보를 한번 보여주고...
		print();
		Scanner sc = new Scanner(System.in);
		while (true) {
		// 2.수정할 내용을 선택..이름을 통해서 - 어떤 학생의 정보를 수정할지 정하게 함.
			System.out.println("수정할 학생 이름 입력 : ");
			String schName = sc.nextLine(); // schName : 서치 네임.
		// 3.학생 있는지 없는지 확인하고 - 학생 이름 겹치는 경우도 있으니까 맞는 학생인지 다른 학생인지..
			// for (int i=0;i<list.size();i++)
			// list.get(i).getName().contains(schName);
			/////////////////////////////////////////////////////////////////
			/*
			 * for (StudentDTO tmp : list){ tmp.getName().contains(schName); }
			 */
			/////////////////////////////////////////////////////////////////
			/*
			 * HashSet<String> setName = new HashSet<>(); for (StudentDTO tmp :
			 * list){ setName.add(tmp.getName()); }
			 */
			/////////////////////////////////////////////////////////////////
			ArrayList<String> listName = new ArrayList<String>();
			for (StudentDTO dto : list) {//listname만들어서 학생 이름 유무 확인
				listName.add(dto.getName());
			}
			if (listName.contains(schName)) {
				System.out.println("이름 있음");
				// 4.학생 맞으면 어떤 정보 수정할지. .국영수
				for(StudentDTO dto : list){
					if(dto.getName().equals(schName)){
						System.out.println("\n---------------------------------------");
						System.out.println(dto);	//학생정보 물어봄
						System.out.println("\n---------------------------------------");
						//listName으로 가져온 학생 정보가 맞나?1.예 2.아니오 - 계속검색 3.취소
						System.out.println("학생 정보가 맞습니까?1.예 2.아니오 - 계속검색 3.취소 >>> ");
						int sBun = sc.nextInt();	//1,2,3 받기위한 번호
						
						
						//과목 점수를 수정할 때 밖으로 나가지 말고... 수정이 끝날 때까지 반복하다가 종료해서 나가자!
						if (sBun == 1){	//학생정보 1.예
							//어떤 정보 수정? 1.국 2.영 3.수 4.취소
							System.out.print("어떤 정보 수정? 1.국 2.영 3.수 4.취소 >>>");
							int item = sc.nextInt();
							if (item==1){//국어 수정
								System.out.println(dto.getKor()+"점... 수정할 점수를 입력하세요 : ");
								int score = sc.nextInt();
								dto.setKor(score);
								//점수 수정하면 메인메뉴로 나가짐...									↑↑↑
							}else if (item==2){//영어 수정
								System.out.println(dto.getEng()+"점... 수정할 점수를 입력하세요 : ");
								int score = sc.nextInt();
								dto.setEng(score);
							}else if (item==3){//수학 수정
								System.out.println(dto.getMath()+"점... 수정할 점수를 입력하세요 : ");
								int score = sc.nextInt();
								dto.setMath(score);
							}//수정할 항목 입력 완료!! end
							//print
							System.out.println("\n-----------------수정 종료----------------");
							System.out.println(dto);	//학생정보 물어봄
							System.out.println("\n---------------------------------------");
							
							
						}else if (sBun == 2){//학생정보 2.아니오 - 계속검색
							//그 이후 반복을 계속 실행
							continue;
						}else if (sBun == 3){//학생정보 3.취소
							//빠져 나간다.
							break;
						}
					}
				}
				
				//1. 예
				//2.계속 검색 다시 for문으로 계속 검색
				//3. break;로 나가자.
				break;
			} else {
				System.out.println("이름 없음");
				//계속 검사할지 유무를 물어보자!
			}
		}
		// 5.수정하도록 하고, 수정하고나면 학생 정보 출력 시켜주고... 다시 메인 메뉴로
		System.out.println("\t=========학생 정보 수정 종료=========");
	}
}
