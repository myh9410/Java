package daoex;
/*
 운영(control) : 각 동작에 따른
 		메서드들의 집합소
 	데이터 저장소 ArrayList를 만들어 놓고
 	사용자의 요구(삽입/삭제/수정/출력)가
 	있을때마다 해당 메서드를 호출할 수있도록
 	정의해 놓자!
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

import modelex.StudentDTO;

public class StudentDAO {
	private ArrayList<StudentDTO> list = 
			new ArrayList<>();

	public StudentDAO() {
		StudentDTO s1 = new StudentDTO("김철수", 10, 11, 13);
		StudentDTO s2 = new StudentDTO("김철민", 10, 15, 19);
		StudentDTO s3 = new StudentDTO("김민수", 11, 16, 17);
		StudentDTO s4 = new StudentDTO("김수민", 12, 17, 14);
		StudentDTO s5 = new StudentDTO("김민국", 13, 18, 13);
		StudentDTO s6 = new StudentDTO("김민호", 14, 19, 12);
		StudentDTO s7 = new StudentDTO("김철수", 99, 99, 99);
		StudentDTO s8 = new StudentDTO("김철수", 30, 30, 30);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
	}
	
	
	public void print(){
		System.out.println("\t=========학생 정보 출력=========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		if(list.size()==0){
			System.out.println("\n------------------------------------------");
			System.out.println("  ☞ 출력할 학생 정보가 없어요");
			System.out.println("------------------------------------------\n");
		}else{
			for(StudentDTO tmp : list){
				System.out.println(tmp);
			}
		}
	}
	public void insert(){
		System.out.println("\t=========학생 정보 입력=========");
		String name=JOptionPane.showInputDialog("이름 입력");
		int kor= Integer.parseInt(JOptionPane.showInputDialog("국어 입력"));
		int eng= Integer.parseInt(JOptionPane.showInputDialog("영어 입력"));
		int math= Integer.parseInt(JOptionPane.showInputDialog("수학 입력"));
		
		//list.add(name, kor, eng, math);
		
		
		list.add( new StudentDTO(name, kor, eng, math)  );

	}
	public void update(){
		System.out.println("\t=========학생 정보 수정 중=========");
		print();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("수정할 학생 이름 입력 : ");
			String schName = sc.nextLine();
	
			
			ArrayList<String> listName = new ArrayList<String>();
			for(StudentDTO dto : list){
				listName.add(dto.getName());
			}
			if(listName.contains(schName)){
				//국어, 영어, 수학점수를 수정하도록 하자
				for(StudentDTO dto : list){
					if(dto.getName().equals(schName)){
						System.out.println("\n--------------------------------");
						System.out.println(dto);
						System.out.println("--------------------------------\n");
						
						
						System.out.print("학생 정보가 맞습니까?  1.예  2.계속검색  3. 취소 >>> ");
						int sBun = sc.nextInt();
						
						
						//과목점수를 수정할때  밖으로 나가지말고.   수정이 끝날때까지 반복하다가 종료해서 나가자!
						if(sBun == 1){
							System.out.print(" 어떤 정보 수정? 1. 국어 2.영어 3.수학 4.취소 >>> ");
							int item=sc.nextInt();
							if(item==1){ 
								System.out.print(dto.getKor()+"점인데 수정할 점수를 입력하세요 : ");
								int score = sc.nextInt();
								dto.setKor(score);
							}else if(item==2){ 
								System.out.print(dto.getEng()+"점인데 수정할 점수를 입력하세요 : ");
								int score = sc.nextInt();
								dto.setEng(score);
							}else if(item==3){ 
								System.out.print(dto.getMath()+"점인데 수정할 점수를 입력하세요 : ");
								int score = sc.nextInt();
								dto.setMath(score);
							} //수정할 항목 입력 완료!!!
							
							//print();
							System.out.println("\n-------------수정 종료---------------");
							System.out.println(dto);
							System.out.println("--------------------------------\n");
							break;
							
						}else if(sBun == 2){
							// 그 이후 반복을 계속 실행해야한다.
							continue;
						
						}else if(sBun == 3){
							//그냥 빠져나간다.
							break;
						}
					}
				}

				break;
			}else{
				System.out.println("없다!");
				//계속 검사할지 유무를 물어보자!
			}
		}
		//System.out.println("\t=========학생 정보 수정 종료=========");
	}
	public void delete(){
		System.out.println("\t=========학생 정보 삭제=========");
		

	}
}
