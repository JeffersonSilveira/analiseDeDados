
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	public void generatingConfigurationFile() throws IOException {
		Properties properties = new Properties();
		properties.setProperty("directoryPathIn", "\\data\\in");
		properties.setProperty("directoryPathOut", "\\data\\out");
		FileWriter writer = new FileWriter("conf.properties");
		properties.store(writer, "Author:Jefferson");
		writer.close();

	}

	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("conf.properties");
		props.load(file);
		return props;

	}

	public String configurationFile(String caminho) throws IOException {
		Properties prop = getProp();
		String properties = prop.getProperty(caminho);
		String path = System.getProperty("user.home");
		System.out.println(path+properties);
		return path + properties;
	}

}
