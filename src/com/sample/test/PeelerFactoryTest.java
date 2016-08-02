package com.sample.test;

import com.sample.bean.CustomPeeler;
import com.sample.bean.ValyrianPeeler;
import com.sample.factory.PeelerFactory;
import com.sample.service.Peeler;

public class PeelerFactoryTest extends TestSetup {

	public static void main(String args[]) {
		testFactoryPos(colorGreen);
		testFactoryPos1(colorBlue);
		testFactoryNeg(colorPurple);

	}

	private static void testFactoryPos1(String colorBlue) {
		Peeler peeler = PeelerFactory.getPeeler(colorBlue);
		if (peeler instanceof ValyrianPeeler) {
			System.out.println("SUCCESS >> testFactoryPos1 >>  "
					+ peeler.getClass().getName());
		} else {
			System.out.println("FAILED >> testFactoryPos1 >>  "
					+ peeler.getClass().getName());
		}
	}

	private static void testFactoryNeg(String colorPurple) {
		Peeler peeler = PeelerFactory.getPeeler(colorPurple);
		if (null == peeler) {
			System.out.println("SUCCESS >> testFactoryNeg >>  " + peeler);
		} else {
			System.out.println("FAILED >> testFactoryNeg >>  " + peeler);
		}
	}

	private static void testFactoryPos(String colorGreen) {
		Peeler peeler = PeelerFactory.getPeeler(colorGreen);
		if (peeler instanceof CustomPeeler) {
			System.out.println("SUCCESS >> testFactoryPos >>  "
					+ peeler.getClass().getName());
		} else {
			System.out.println("FAILED >> testFactoryPos >>  "
					+ peeler.getClass().getName());
		}
	}

}
