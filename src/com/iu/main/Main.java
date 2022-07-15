package com.iu.main;

import com.iu.terran.Marine;
import com.iu.zerg.Hydra;

public class Main {

	public static void main(String[] args) {

		Marine m1 = new Marine();
		m1.setHp(30);
		m1.setColor(null);
		
		Hydra hydra = new Hydra();
		
		
		m1.info();
		m1.move();
		

	}

}
