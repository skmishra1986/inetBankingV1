package com.inetbanking.Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
public ReadConfig()
{
	File src = new File("C:\\Users\\skmis\\eclipse-workspace\\inetBankingV1\\Configration\\config.properties");
	try
	{
		FileInputStream fis= new FileInputStream(src);
		pro= new Properties();
		pro.load(fis);
		
	}
	catch(Exception e)
	{
		System.out.println("Exception is "+e.getMessage());
	}
}
public String getApplicationURL()
{
	String url = pro.getProperty("BaseURL");
	return url;
}

public String getUsreName()
{
	String username = pro.getProperty("UserName");
	return username;
}

public String getPassword()
{
	String password = pro.getProperty("Password");
	return password;
}
public String getChromePath()
{
String chromepath=pro.getProperty("Chromepath");
return chromepath;
}
public String getFirefoxPath()
{
String firefoxpath=pro.getProperty("firefoxpath");
return firefoxpath;
}
public String getEdgePath()
{
String edgepath=pro.getProperty("Edgepath");
return edgepath;
}
}
