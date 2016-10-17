package com.bgj.util;

public class StrateFilePath {
	private String rootPath = "C:\\Users\\Administrator\\git\\KLineService\\src\\main\\webapp";

	public String getRootPath() {
		return rootPath;
	}

	public void setRootPath(String rootPath) {
//		this.rootPath = rootPath;
	}

	private StrateFilePath() {
	}

	private static StrateFilePath instance = new StrateFilePath();

	public static StrateFilePath getInstance() {
		return instance;
	}

}
