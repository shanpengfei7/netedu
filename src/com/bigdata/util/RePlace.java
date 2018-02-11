package com.bigdata.util;

public class RePlace {
	public static final String filterStr(String str) {
		str = str.replaceAll("«Î—°‘Ò,", "");
		str = str.replaceAll("«Î—°‘Ò", "");
		str = str.replaceAll(",", "");
		str = str.replaceAll(" ", "");
		return str;
	}
}