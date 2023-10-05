package PracticePackage;

import java.util.ArrayList;
import java.util.List;

public class FibNumber {

	public static void main(String[] args) {
		System.out.println(printFibSeqNumber(20));

	}
	
	public static List<Integer> printFibSeqNumber(int end) {
		List<Integer> fibNumber = new ArrayList<Integer>();
		fibNumber.add(0);
		fibNumber.add(1);
		
		for(int i = 0; true; i++) {
			if(i >= end) {
				break;
			}
			fibNumber.add(fibNumber.get(fibNumber.size() -1) + fibNumber.get(fibNumber.size() -2));
		}
		return fibNumber;
	}

}
