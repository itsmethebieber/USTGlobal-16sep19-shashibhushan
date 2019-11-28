package com.ustglobal.Singleton;

public class TestA {
	public static void main(String[] args) {
		MySingleton ms = MySingleton.getDbConnection();
		ms.s ="hello";
		System.out.println(ms.hashCode());
		MySingleton mx = MySingleton.getDbConnection();
		mx.s=("hi");
		System.out.println(mx.hashCode());
	}

}
