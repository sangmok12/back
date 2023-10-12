package codingtest;

public class Angle0 {

	public static void main(String[] args) {
		
		System.out.println(Angle0(140));
	}
		
		    public static int Angle0(int angle) {
		        int answer = 0;
		        
		        if (angle > 0 && angle < 90) {
		            answer = 1;
		        }
		        else if (angle == 90) {
		            answer = 2;
		        }
		        else if (angle > 90 && angle < 180) {
		            answer = 3;
		        }
		        else if (angle == 180) {
		            answer = 4;
		        }
		        
		        return answer;
		    }
}
