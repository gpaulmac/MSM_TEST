
package com.sample.test;

import com.sample.bean.Apple;
import com.sample.util.PeelerUtil;

public class AppleTest{
	static Apple canEat = new Apple("green",4, false, 20 );
	static Apple cantEat = new Apple("green",2, false, 20 );
	static Apple cantEat2 = new Apple("green",4, true, 20 );
	
	public static void main(String args[]){
		testAppleEatPos(canEat);
		testAppleEatNeg(cantEat);
		testAppleEatNeg(cantEat2);
		
	}

	private static void testAppleEatNeg(Apple apple) {
		if(PeelerUtil.canPeel(apple)){
		System.out.println("FAILED >> testAppleEatNeg >>  "+apple.toString());
		}else{
		System.out.println("SUCCESS >> testAppleEatNeg >>  "+apple.toString());	
		}
		
	}

	private static void testAppleEatPos(Apple apple) {
		if(!PeelerUtil.canPeel(apple)){
		System.out.println("FAILED >> testAppleEatPos >>  "+apple.toString());
		}else{
		System.out.println("SUCCESS >> testAppleEatPos >>  "+apple.toString());	
		}
	}

}
