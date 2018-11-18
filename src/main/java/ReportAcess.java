import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReportAcess {
	final static String FILENAME        =  "\\arquivo.done.dat";
	final static String DIRECTORYPATHIN = "directoryPathIn";
	final static String DIRECTORYPATHOUT = "directoryPathOut";

	public void ReportAcess() throws IOException {
		Report report = new Report();
		String[] ret = new String[10];

		ret[2] = report.ireportCustomerQuantity(DIRECTORYPATHIN+FILENAME);
		ret[3] = report.mostExpensiveSale(DIRECTORYPATHIN+FILENAME);
		ret[1] = report.WorstSeller(DIRECTORYPATHIN+FILENAME);
		ret[0] = report.QuantityOfSeller(DIRECTORYPATHIN+FILENAME);
		insertToBinaryFile(ret);
	}

	private static void insertToBinaryFile(String[] ret) throws FileNotFoundException, IOException {

		FileOutputStream fstream = new FileOutputStream(DIRECTORYPATHIN+FILENAME);
		DataOutputStream outputFile = new DataOutputStream(fstream);

		System.out.println("inserting data into files");

		for (int i = 0; i < ret.length; i++)
			outputFile.writeUTF(ret[i]);

		System.out.println("*** Performed the insertion of sequences into a binary file.");
		outputFile.close();
	}

	public static void readBinaryFile() throws FileNotFoundException, IOException {
		String name;
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream(DIRECTORYPATHOUT+FILENAME);
		DataInputStream inputFile = new DataInputStream(fstream);

		System.out.println("Reading the names from the file:");
		while (!endOfFile) {
			try {
				name = inputFile.readUTF();
				System.out.print(name + "\n ");
			} catch (EOFException e) {
				endOfFile = true;
			}
		}

		inputFile.close();
	}

}
