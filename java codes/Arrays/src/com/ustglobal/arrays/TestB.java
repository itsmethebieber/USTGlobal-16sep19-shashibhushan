package com.ustglobal.arrays;

public class TestB {
public static void main(String[] args) {
	int[] nums = {10,20,30,40};
	receive(nums);
	int[] values = getArray();
	for(int val : values) {
		System.out.println(val);
		
		
	}
	
	
}
 static int[] getArray() {
	int values[] = {10,11,12,13};
	return values;
}
static void receive(int[] numbers) {
	for(int num : numbers) {
		System.out.println(num);
	}
}


}
