package dataAnalysis;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Teste {
	
	
	public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(
                "conf.properties");
        props.load(file);
        return props;
 
    }
//	public static void main(String[] args) throws IOException {
//		
//		Properties properties = new Properties();
//		properties.setProperty("directoryPath IN", "\\data\\in");
//		properties.setProperty("directoryPath OUT", "\\data\\out");
//		FileWriter writer = new FileWriter("conf.properties");
//		properties.store(writer,"Author:Jefferson");
//		writer.close();
//
//		    Properties prop = getProp();
//         
//	        String login = prop.getProperty("projeto");
//	   
//	         
//	        System.out.println("Login = " + login);
//	       
//		
////		String texto= "001�1234567891234�Diego�50000,001�3245678865434�Renato�40000.99,002�2345675434544345�Jose da Silva�Rural,002�2345675433444345�Eduardo Pereira�Rural,003�10�[1-10-100,2-30-2.50,3-40-3.10]�Diego,003�08�[1-34-10,2-33-1.50,3-40-0.10]�Renato";
////		String frutas[] = texto.split(",");
////		for (int i = 0; i < frutas.length; i++) {
////
////			System.out.println(frutas[i]); //imprime banana
////		
////		}
////		LayoutTreatment tratamentoLayout = new LayoutTreatment();
////		tratamentoLayout.treatmentSpecificLayout("003�08�[1-34-10,2-33-1.50,3-40-0.10]�Renato");
//		
//		
//		
	//}
	
	public static void main(String[] args)
	{
		int soma = 0;
		for(int i =0; i<=100; i=i+2)
		{
			soma = soma + i;
		}
		System.out.println("A soma � " + soma);
	}

}
