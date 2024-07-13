package com.interviewprep.leetcode.easy.numberofsegmentsinstring;

public class SecondApproach {

	public static void main(String[] args) {


		String s = ", , , ,        a, eaefa";
		SecondApproach sa = new SecondApproach();
		int num = sa.countSegments(s);
		
		System.out.println(num);

	}

	public int countSegments(String s) {

		// return if string is empty
		if(s.equals("")) {
			return 0;
		}

		// initialize counter to zero - this will count no. of segments
		int count = 0;

		// split on " "
		String[] splitarray = s.split(" ");
		
		// in a loop count non-empty segments
		for(int i=0; i<splitarray.length; i++) {

			if(!splitarray[i].equals("")) {
				count++;
			}
		}

		return count;

	}
	
}
