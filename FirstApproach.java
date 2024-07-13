package com.interviewprep.leetcode.easy.numberofsegmentsinstring;

import java.util.StringTokenizer;

public class FirstApproach {

	public static void main(String[] args) {
		
		String s = ", , , ,        a, eaefa";
		
		FirstApproach fa = new FirstApproach();
		int num = fa.countSegments(s);
		
		System.out.println(num);

	}
	
	
	public int countSegments(String s) {
		
		// return 0 if empty string
		 if(s.equals("")) {
			 return 0;
		 }
		 
		 StringTokenizer st = new StringTokenizer(s);
		 return st.countTokens();
	}
	 
}
