package day6;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoProp {
	private Properties pro = new Properties();
	public static void main(String[] args) {
		DemoProp pd = new DemoProp();
		pd.loadPropertiesFile();
		pd.readProperties();
		
	}
	public void readProperties() {
		System.out.println("name "+pro.getProperty("name"));
		System.out.println("password "+pro.getProperty("password"));
		
	}
	public void loadPropertiesFile() {
		
		try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("my.properties");) {
			pro.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
