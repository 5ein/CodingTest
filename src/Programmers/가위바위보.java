package programmers;

public class 가위바위보 {
	public static void main(String[] args) {
		String rsp = "205";
		String answer = "";
		
		String[] s = rsp.split("");
		for (String i : s) {
			if(i.equals("2")) answer += "0";
			else if(i.equals("0")) answer += "5";
			else if(i.equals("5")) answer += "2";
		}
		
		System.out.println(answer);
	}
}
