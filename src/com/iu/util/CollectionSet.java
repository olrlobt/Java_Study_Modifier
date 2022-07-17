package com.iu.util;

import java.util.Scanner;

public class CollectionSet implements Collection {
	
	Scanner sc = new Scanner(System.in);
	int [] thum;
	
	@Override
	public int[] add(int[] numbers) {
		
		//일치하는 숫자 추가 x
		
		int n = 0;
		System.out.println(" 숫자를 입력하세요 ");
		n = sc.nextInt();
		
		thum = new int[numbers.length+1];
				
		
		
		for(int i = 0 ; i < numbers.length ; i ++ ) {
			if(numbers[i] == n) {
				
				System.out.println(" 중복된 숫자를 입력하셨습니다. ");
				break;
			}
		}
		
		
		
		
		
		thum[numbers.length] = n;
		for(int i = 0 ; i < numbers.length ; i ++ ) {
			thum[i] = numbers[i];
			
		}
		return thum;
	}

	@Override
	public int[] remove(int[] numbers) {
		
		// 일치하는 숫자 삭제
		
		int n = 0;
		
		thum = new int[numbers.length-1];
				
		
		for(int i = 1 ; i < numbers.length ; i ++ ) {
			thum[i-1] = numbers[i];
			
		}
		return thum;
		
	}

}
