package common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Configurations {

	String configFile;

	String configFieldName;

	String configValue;

	public Configurations(String inputConfigFile) {
		this.configFile = inputConfigFile;
//		this.configFieldName = inputFieldName;
	}

	public String getConfigValue(String inputconfigFieldName) {

		Properties prop = new Properties(); //Lớp Properties cung cấp các phương thức lấy dữ liệu từ các file .properties và lưu trữ dữ liệu vào file .properties. 

		try { //Add ngoại lệ
			InputStream input = new FileInputStream(configFile);
			prop.load(input);
			configValue = prop.getProperty(inputconfigFieldName);
		} catch (Exception e) {
			System.out.println("Config File is missing");
			e.printStackTrace();
		}

		return configValue;
	}
}
