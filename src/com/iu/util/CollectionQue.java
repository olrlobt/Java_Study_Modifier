package com.iu.util;

import java.util.Scanner;

public class CollectionQue implements Collection {

	
Scanner sc = new Scanner(System.in);
	
	int [] thum;
	
	
	@Override
	public int[] add(int[] numbers) {
		int n = 0;
		System.out.println(" 숫자를 입력하세요 ");
		n = sc.nextInt();
		
		thum = new int[numbers.length+1];
				
		thum[0] = n;
		for(int i = 0 ; i < numbers.length ; i ++ ) {
			thum[i+1] = numbers[i];
			
		}
		return thum;
	}

	@Override
	public int[] remove(int[] numbers) {
		
		
		int n = 0;
		
		thum = new int[numbers.length-1];
				
		
		for(int i = 0 ; i < numbers.length -1 ; i ++ ) {
			thum[i] = numbers[i];
			
		}
		return thum;
		
	
	}

}
