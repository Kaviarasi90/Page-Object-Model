package com.leaftaps.ui.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
public static void main(String[] args) throws IOException {
	Properties prop = new Properties();
	FileInputStream file = new FileInputStream("./config/AppConfig.properties");
	prop.load(file);
	String property = prop.getProperty("URL");
	System.out.println(property);
}
}
