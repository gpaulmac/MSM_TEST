package com.sample.factory;

import com.sample.bean.CustomPeeler;
import com.sample.bean.ValyrianPeeler;
import com.sample.service.Peeler;

public class PeelerFactory {

	public static Peeler getPeeler(String color) {
		if (color.equalsIgnoreCase(FactoryConstant.BLUE))
			return new ValyrianPeeler();
		else if (color.equalsIgnoreCase(FactoryConstant.GREEN)
				|| color.equalsIgnoreCase(FactoryConstant.RED))
			return new CustomPeeler();
		return null;
	}

}
