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
////		String texto= "001Á1234567891234ÁDiegoÁ50000,001Á3245678865434ÁRenatoÁ40000.99,002Á2345675434544345ÁJose da SilvaÁRural,002Á2345675433444345ÁEduardo PereiraÁRural,003Á10Á[1-10-100,2-30-2.50,3-40-3.10]ÁDiego,003Á08Á[1-34-10,2-33-1.50,3-40-0.10]ÁRenato";
////		String frutas[] = texto.split(",");
////		for (int i = 0; i < frutas.length; i++) {
////
////			System.out.println(frutas[i]); //imprime banana
////		
////		}
////		LayoutTreatment tratamentoLayout = new LayoutTreatment();
////		tratamentoLayout.treatmentSpecificLayout("003Á08Á[1-34-10,2-33-1.50,3-40-0.10]ÁRenato");
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
		System.out.println("A soma È " + soma);
	}

}
