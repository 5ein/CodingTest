package goorm;

import java.io.*;
import java.util.*;

public class 방배정하기 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		br.close();
		
        int answer = 0;
        
        for(int i=0; i<=50; i++)
            for(int j=0; j<=50; j++)
                for(int k=0; k<=50; k++)
                    if((a*i) + (b*j) + (c*k) == n)
                    	answer = 1;
		
		
		System.out.println(answer);
	}
}
