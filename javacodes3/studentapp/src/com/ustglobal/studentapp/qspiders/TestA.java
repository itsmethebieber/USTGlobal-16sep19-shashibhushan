package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.*;
public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQTP();
		
		Selenium se = new Selenium();
		se.teachSelenium();
		
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
	}

}
