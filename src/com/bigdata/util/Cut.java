package com.bigdata.util;

public class Cut {
	public static final String filterStr(String dir) {
		String[] lastdir = dir.split("[\\~!]+");
		String path = lastdir[lastdir.length - 1];
		return path;
	}
}
