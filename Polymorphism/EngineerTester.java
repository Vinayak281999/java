package com.xworkz.polymorphismapp;

import com.xworkz.polymorphism.CsEngineers;
import com.xworkz.polymorphism.Engineer;
import com.xworkz.polymorphism.Mech;

public class EngineerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engineer mech=new Mech();
		mech.solvePromblems();
		
		Engineer Cs=new CsEngineers();
		Cs.solvePromblems();
	}

}
