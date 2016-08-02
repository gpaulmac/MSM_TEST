package com.sample.util;

import com.sample.bean.Apple;

public class PeelerUtil {

	public static boolean canPeel(Apple a) {
		boolean canPeel = false;
		if (!a.hasWorm() && a.getTaste() > 3) {
			canPeel = true;
		}
		return canPeel;
	}
}
