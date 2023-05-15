package study1;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
	
		int eng = 80;
		
		System.out.println((eng>=80)?"우수":"양호");
		String result1 = "";
		if ( eng >= 80 ) {
			result1 = "우수";
		} else {
			result1 = "양호";
		}
		/*switch( eng >= 80 ) {     //이클립스에서 switch 문은 true냐 false냐 형태로 사용안됨.
			case true : System.out.println("우수");
			break;
			case false : System.out.println("양호");
			break;
			default : System.out.println("답 없음");
		}*/
		System.out.println("-------------------");
		
		int apple = 88;
		String result = (apple>=80) ? "A등급": 
						(apple>=60) ? "B등급":"C등급";
		System.out.println("사과의 당도는 " + apple + "으로" + result + "입니다.");
		
		System.out.println("-------------------");
		
		int gender = 1;
		String gender1 = (gender==1)? "남자" : "여자";
		System.out.println("성별은 " + gender1 + "입니다.");
		
		System.out.println("-------------------");
		
		//양수 (또는 음수, 또는 0)입니다. 출력
		
		int number = 10;
		
		System.out.print("10은 ");
		System.out.print((number>0)?"양수":(number<0)?"음수":"0");
		System.out.println("입니다.");
		
		System.out.println("-------------------");
		
		//변수 값을 이용한 학점 출력
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력");
		int score = scn.nextInt();
		String level = (score>=90)?"A학점":
					   (score>=80)?"B학점":
					   (score>=70)?"C학점":
					   (score>=60)?"D학점":"F학점";
		System.out.println(score + "점은 " + level + "입니다.");
	}

}
