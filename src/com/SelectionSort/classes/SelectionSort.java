package com.SelectionSort.classes;

public class SelectionSort {
	
	
	public static void select(int[] num){
		for (int i=0;i <num.length-1;i++){
			int var = i;
		for(int j =i+1;j<num.length;j++){
			if(num[j]<num[var]){
				var =j;
			}
		}
				int temp = num[i];
				num[i] = num[var];
				num[var] = temp;
		}
		
	for(int i= 0;i<num.length;i++){
		System.out.print(num[i]+", ");
	}	
	System.out.println();
	}
	public static void main(String[] args) {
		
		select(new int[] {12,3,75,87,98,105,520});
		
	}
	}
