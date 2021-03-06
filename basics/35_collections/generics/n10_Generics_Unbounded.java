package com.basics.packageone;

import java.util.Arrays;
import java.util.List;

// upper bound means ..upper is bounded ..lower is free..free to choose from lower range
// lower bound means.. lower is bounded.. upper is free...free to choose from upper range

public class n10_Generics_Unbounded {

	public static void printAll(List<?> list) {
		for (Object item : list)
			System.out.println(item + " ");
	}

	public static void main(String args[]) {
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		printAll(integerList);
		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
		printAll(doubleList);
	}

}
