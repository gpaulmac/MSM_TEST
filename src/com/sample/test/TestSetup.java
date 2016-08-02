package com.sample.test;

import com.sample.bean.Apple;

public class TestSetup {
	static Apple canEat = new Apple("green", 4, false, 20);
	static Apple cantEat = new Apple("green", 2, false, 20);
	static Apple cantEat2 = new Apple("green", 4, true, 20);

	static String colorGreen = "green";
	static String colorRed = "red";
	static String colorBlue = "blue";
	static String colorPurple = "purple";
}
