package com.inventateq.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	private  Properties prop;
	public PropertyUtil()
	{
		try {
			loadProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getPropertyValue(String propKey)
	{
		String value = prop.getProperty(propKey);
		if(value!=null && !value.equalsIgnoreCase(""))
		{
			value = value.trim();
		}
		return value;
	}

	private void loadProperties() throws IOException
	{
		prop = new Properties();
		FileInputStream input = new FileInputStream("./resources/properties/OR.properties");
		prop.load(input);
		
	}
}
