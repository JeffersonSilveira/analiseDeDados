
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProcessData {

	final static String DIRECTORYPATHIN = "directoryPathIn";
	final static String FILENAME        =  "\\arquivo.done.dat";
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ProcessData obj = new ProcessData();
		obj.run();
	}

	private static void writeToBinaryFile() throws FileNotFoundException, IOException {
		Configuration configuration = new Configuration();
		String layouts[] = { "001�1234567891234�Diego�50000", "001�3245678865434�Renato�40000.99",
							 "002�2345675434544345�Jose da Silva�Rural", "002�2345675433444345�Eduardo Pereira�Rural",
				             "003�10�[1-10-100,2-30-2.50,3-40-3.10]�Diego", "003�08�[1-34-10,2-33-1.50,3-40-0.10]�Renato" };
		
		FileOutputStream fstream = new FileOutputStream(DIRECTORYPATHIN+FILENAME);
		DataOutputStream outputFile = new DataOutputStream(fstream);

		System.out.println("inserting data into files");

		for (int i = 0; i < layouts.length; i++) {
			outputFile.writeUTF(layouts[i]);
		}

		System.out.println("*** Performed the insertion of sequences into a binary file.");
		outputFile.close();
	}

	public void run() throws IOException {
		ReportAcess reportAcess = new ReportAcess();
		reportAcess.readBinaryFile();

	}
}
