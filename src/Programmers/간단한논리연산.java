package programmers;

public class 간단한논리연산 {

	public static void main(String[] args) {
		boolean x1 = false;
		boolean x2 = true;
		boolean x3 = true;
		boolean x4 = true;
		
		boolean x1vx2 = true;
		boolean x3vx4 = true;
		boolean answer = false;
		
		if(x1 == false && x2 == false) {
			x1vx2 = false;
		}
		if(x3 == false && x4 == false) {
			x3vx4 = false;
		}
		
		if(x1vx2 == true && x3vx4 == true) {
			answer = true;
		}
		
		System.out.println(answer);
		
//		∨ 과 ∧ 의 진리표
//		x	y	x ∨ y	x ∧ y
//		T	T	  T	      T
//		T	F	  T	  	  F
//		F	T	  T	  	  F
//		F	F	  F	  	  F
	}
	
	//다른사람 답변
//	public static void main(String[] args) {
//		boolean x1 = false;
//		boolean x2 = true;
//		boolean x3 = true;
//		boolean x4 = true;
//		
//		boolean answer = (x1||x2)&&(x3||x4);
//	
//		System.out.println(answer);	
//	}

}
