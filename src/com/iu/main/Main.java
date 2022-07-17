package com.iu.main;

import java.util.Scanner;

import com.iu.util.CollectionQue;
import com.iu.util.CollectionSet;
import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		
		//1.com.iu.util.CollectionStack 
		//ㄴ add 랑 remove override.
		// add 호출시 입력받은 새로운 숫자를 추가하는데 무조건 0번 인덱스에 추가됨.
		// remove 호출시 0번 인덱스를 삭제
		//2.com.iu.util.CollectionQue
		// add 랑 remove override. 
		// add 호출시 입력받은 새로운 숫자를 추가하는데 무조건 0번 인덱스에 추가됨.
		// remove 호출시 마지막 값 삭제
		//3 . com.iu.util.CollectionSet
		//add - 새로운 숫자 추가 마지마겡 추가
		// 단, 중복되지 않으 숫자만 ㅇ추가
		// remove -  삭제할 숫자를 입력받아서 일치하는 숫자 삭제
		
		Scanner sc = new Scanner(System.in);
		
		int m = 0 ;
		int num [] = {1,2,3,4}  ;
		int result [] ;
		
		
		for(int i = 0 ; i < num.length ; i ++ ) {
			
			System.out.print("   num [" +i +"] =" + num[i]);
			
		}
		
		
		System.out.println(" \n호출할 메소드를 입력하세요 : 1.Stack 2.Que 3.Set ");
		m = sc.nextInt();
		
		
		
		
		
		CollectionStack stack = new CollectionStack();
		
		System.out.println(" \nStack Add ");
		result = new int[num.length+1];
		result = stack.add(num);
		
		
		for(int i = 0 ; i < result.length ; i ++ ) {
			
			System.out.print("   num [" +i +"] =" + result[i]);
			
		}
		
		
		System.out.println(" \nStack Remove ");
		result = new int[num.length-1];
		result = stack.remove(num);
		
		
		for(int i = 0 ; i < result.length ; i ++ ) {
			
			System.out.print("   num [" +i +"] =" + result[i]);
			
		}
		
		
		
		
		
		
		
		
		CollectionQue que = new CollectionQue();
		
		
		System.out.println(" \nQue Add ");
		result = new int[num.length+1];
		result = que.add(num);
		
		
		for(int i = 0 ; i < result.length ; i ++ ) {
			
			System.out.print("   num [" +i +"] =" + result[i]);
			
		}
		
		
		System.out.println(" \nQue Remove ");
		result = new int[num.length-1];
		result = que.remove(num);
		
		
		for(int i = 0 ; i < result.length ; i ++ ) {
			
			System.out.print("   num [" +i +"] =" + result[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		CollectionSet set = new CollectionSet();
		
		
		System.out.println(" \nSet Add ");
		result = new int[num.length+1];
		result = set.add(num);
		
		
		for(int i = 0 ; i < result.length ; i ++ ) {
			
			System.out.print("   num [" +i +"] =" + result[i]);
			
		}
		
		
		System.out.println(" \nSet Remove ");
		result = new int[num.length-1];
		result = set.remove(num);
		
		
		for(int i = 0 ; i < result.length ; i ++ ) {
			
			System.out.print("   num [" +i +"] =" + result[i]);
			
		}
		
		
		
	}

}
