package utils;

import java.io.File;

public class Constant {
	public static final String ProjectPath = System.getProperty("user.dir");
	static StringBuilder ProjectRootPath = new StringBuilder("src")
			.append(File.separator)
			.append("main")
			.append(File.separator)
			.append("java")
			.append(File.separator);
	public static final String DownloadPath = ProjectPath + "\\downloads\\";
}
