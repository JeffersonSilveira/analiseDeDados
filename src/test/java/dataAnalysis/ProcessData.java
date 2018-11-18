package dataAnalysis;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import dataAnalysis.LayoutTreatment;
import model.Cliente;

public class ProcessData {
    

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	   
	    Configuration configuration = new Configuration();
	    
	    //System.out.println(configuration.configurationFile());

		ProcessData obj = new ProcessData();
		obj.run();
	}

	private static void writeToBinaryFile() throws FileNotFoundException, IOException {
		String layouts[] = { "001Á1234567891234ÁDiegoÁ50000", "001Á3245678865434ÁRenatoÁ40000.99",
							 "002Á2345675434544345ÁJose da SilvaÁRural", "002Á2345675433444345ÁEduardo PereiraÁRural",
							 "003Á10Á[1-10-100,2-30-2.50,3-40-3.10]ÁDiego", "003Á08Á[1-34-10,2-33-1.50,3-40-0.10]ÁRenato" };

		FileOutputStream fstream = new FileOutputStream("C:\\Users\\Daniela\\Music\\arquivo.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);

		System.out.println("inserting data into files");

		for (int i = 0; i < layouts.length; i++)
			outputFile.writeUTF(layouts[i]);

		System.out.println("*** Performed the insertion of sequences into a binary file.");
		outputFile.close();
	}

	private static void readBinaryFile() throws FileNotFoundException, IOException {
		String fileContent;
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream("C:\\Users\\Daniela\\Music\\arquivo.dat");
		DataInputStream inputFile = new DataInputStream(fstream);
		
		System.out.println("Reading the names from the file:");
		
		while (!endOfFile) {
			try {
				fileContent = inputFile.readUTF();	
//				LayoutTreatment layoutTreatment = new LayoutTreatment();
//				layoutTreatment.retornoTratamento(fileContent);
			
				Report report = new Report();
				report.customerQuantity(fileContent);
				
				System.out.println(report.QuantityOfSeller(fileContent));	
				System.out.println(report.mostExpensiveSale(fileContent));
				System.out.println(report.WorstSeller(fileContent));
				
				

			} catch (EOFException e) {
				endOfFile = true;
			}			
		}
		inputFile.close();
	}

	public void run() {

		try {

			writeToBinaryFile();
			readBinaryFile();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
