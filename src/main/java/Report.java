
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Report {
	// Quantidade de clientes no arquivo de entrada
	public String ireportCustomerQuantity(String directorypathin) throws IOException {
		String retorno = null;
		String fileContent;
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream(directorypathin);
		DataInputStream inputFile = new DataInputStream(fstream);

		int soma = 0;
		while (!endOfFile) {
			try {
				fileContent = inputFile.readUTF();
				String layout[] = fileContent.split("ç");
				for (int i = 0; i < layout.length; i++) {
					if (layout[i].contains("002")) {
						soma = soma + 1;
					}
				}
			} catch (EOFException e) {
				endOfFile = true;
			}

		}
		retorno = "Quantidade de clientes no arquivo de entrada Total : " + soma;
		inputFile.close();
		return retorno;
	}

	// Quantidade de vendedor no arquivo de entrada
	public String QuantityOfSeller(String directorypathin) throws IOException {
		String retorno = null;
		String fileContent;
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream(directorypathin);
		DataInputStream inputFile = new DataInputStream(fstream);

		int soma = 0;
		while (!endOfFile) {
			try {
				fileContent = inputFile.readUTF();
				String layout[] = fileContent.split("ç");
				for (int i = 0; i < layout.length; i++) {
					if (layout[i].contains("001")) {
						soma = soma + 1;
					}
				}
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		retorno = "Quantidade de vendedor no arquivo de entrada : " + soma;
		inputFile.close();
		return retorno;
	}

	// ID da venda mais cara
	public String mostExpensiveSale(String directorypathin) throws IOException {
		String retorno = null;
		String fileContent;
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream(directorypathin);
		DataInputStream inputFile = new DataInputStream(fstream);
		int maior = 0;
		while (!endOfFile) {
			try {
				fileContent = inputFile.readUTF();
				String layout[] = fileContent.split("ç");
				for (int i = 0; i < layout.length; i++) {
					if (layout[i].contains("003")) {
						int retorn = Integer.parseInt(layout[1]);
						if (retorn > maior) {
							maior = retorn;
						}
					}
				}
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		retorno = "ID da venda mais cara : " + maior;
		inputFile.close();
		return retorno;
	}

	// Pior vendedor de todos os tempos
	public String WorstSeller(String directorypathin) throws IOException {
		String retorno = null;
		String fileContent;
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream(directorypathin);
		DataInputStream inputFile = new DataInputStream(fstream);
		float menor = 0;
		while (!endOfFile) {
			try {
				fileContent = inputFile.readUTF();
				String layout[] = fileContent.split("ç");
				for (int i = 0; i < layout.length; i++) {
					if (layout[i].contains("001")) {
						String ret = layout[3].replace(".", "");
						float retorn = Float.parseFloat(layout[3]);
						if (retorn < menor) {
							menor = retorn;
						}
					}
				}
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		retorno = "Pior vendedor de todos os tempos : " + menor;
		inputFile.close();
		return retorno;
	}
}
