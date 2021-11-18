package PageClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public abstract class PropertyClass {
	
	Properties prop;
	String path="C:\\Users\\balgu\\eclipse-workspace\\NewMavenProject\\src\\main\\java\\PageClasses\\Data";
	FileInputStream fis;
	
	PropertyClass() throws FileNotFoundException{
		
		prop=new Properties();
		fis=new FileInputStream(path);
	}

}
