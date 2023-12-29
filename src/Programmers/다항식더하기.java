package programmers;

public class 다항식더하기 {

	public static void main(String[] args) {
		String polynomial = "3x + 7 + x";
		System.out.println(solution(polynomial));
	}
	
    public static String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int xNum = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
			if(arr[i].contains("x")) {
				xNum += arr[i].equals("x")? 1 : Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
			}else if(!arr[i].equals("+")){
				num += Integer.parseInt(arr[i]);
			}
		}
        
        if(xNum != 0) {
        	if(num == 0) {
        		if(xNum == 1) {
        			answer = "x";
        		}else { //xNum != 1
        			answer = xNum + "x";
        		}
        	} else { //num != 0
        		if(xNum == 1) {
        			answer = "x" + " + " + num;
        		}else { //xNum != 1
        			answer = xNum + "x" + " + " + num;
        		}
        	}
        }else { //xNum == 0
        	if(num != 0) {
        		answer = String.valueOf(num);
        	}
        }
        
        return answer;
    }
    
    //다른사람 풀이
//    public static String solution(String polynomial) {
//        int xCount = 0;
//        int num = 0;
//
//        for (String s : polynomial.split(" ")) {
//            if (s.contains("x")) {
//                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
//            } else if (!s.equals("+")) {
//                num += Integer.parseInt(s);
//            }
//        }
//        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
//    }
    
//    public static String solution(String polynomial) {
//        String[] strs = polynomial.split(" ");
//        int xCount = 0;
//        int yCount = 0;
//        for(int i=0; i<strs.length; i=i+2){
//            String sick = strs[i];
//            if(sick.indexOf("x") != -1){
//                if("x".equals(sick)) xCount += 1;
//                else xCount += Integer.parseInt(sick.replace("x", ""));
//            }
//            else{
//                yCount += Integer.parseInt(sick);
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        if(xCount > 0){
//            if(xCount == 1) sb.append("x");
//            else sb.append(String.format("%dx", xCount));
//        }
//        if(yCount > 0){
//            if(xCount > 0) sb.append(" + ");
//            sb.append(yCount);
//        }
//        return sb.toString();
//    }

}
