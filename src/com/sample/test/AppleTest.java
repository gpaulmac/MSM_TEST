package com.sample.test;

import com.sample.bean.Apple;
import com.sample.util.PeelerUtil;

public class AppleTest extends TestSetup {

	public static void main(String args[]) {
		testIsAppleValidWeightPos();
		testIsAppleValidWeightNeg();

		testAppleValidTastePos();
		testAppleValidTasteNeg();

		// testIsAppleValidColorPos(appleValidColor);
		// testIsAppleValidColorNeg(appleInValidColor);

		testAppleEatPos(canEat);
		testAppleEatNeg(cantEat);
		testAppleEatNeg(cantEat2);

	}

	private static void testAppleValidTasteNeg() {
		try {
			Apple appleInValidTaste = new Apple("green", 5, true, 23);
			System.out.println("FAILED >> testAppleValidTasteNeg >>  "
					+ appleInValidTaste.getTaste());
		} catch (IllegalArgumentException e) {
			System.out.println("SUCESS >> testAppleValidTasteNeg >>  ");
		}
	}

	private static void testAppleValidTastePos() {
		try {
			Apple appleValidTaste = new Apple("green", 4, true, 20);
			System.out.println("SUCESS >> testAppleValidTastePos >>  "
					+ appleValidTaste.getTaste());
		} catch (IllegalArgumentException e) {
			System.out.println("FAILED >> testAppleValidTastePos >> ");
		}
	}

	private static void testIsAppleValidWeightNeg() {
		try {
			Apple appleInValidTaste = new Apple("green", 3, true, 120);
			System.out.println("FAILED >> testIsAppleValidWeightNeg >>  "
					+ appleInValidTaste.getWeight());
		} catch (IllegalArgumentException e) {
			System.out.println("SUCESS >> testAppleValidTasteNeg >>  ");
		}
	}

	private static void testIsAppleValidWeightPos() {
		try {
			Apple appleValidTaste = new Apple("green", 4, true, 20);
			System.out.println("SUCESS >> testIsAppleValidWeightPos >>  "
					+ appleValidTaste.getWeight());
		} catch (IllegalArgumentException e) {
			System.out.println("FAILED >> testIsAppleValidWeightPos >> ");
		}
	}

	private static void testAppleEatNeg(Apple apple) {
		if (PeelerUtil.canPeel(apple)) {
			System.out.println("FAILED >> testAppleEatNeg >>  "
					+ apple.toString());
		} else {
			System.out.println("SUCCESS >> testAppleEatNeg >>  "
					+ apple.toString());
		}

	}

	private static void testAppleEatPos(Apple apple) {
		if (!PeelerUtil.canPeel(apple)) {
			System.out.println("FAILED >> testAppleEatPos >>  "
					+ apple.toString());
		} else {
			System.out.println("SUCCESS >> testAppleEatPos >>  "
					+ apple.toString());
		}
	}

}
