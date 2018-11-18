package analiseDeDados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProcessarDados {

	public static void main(String[] args) {

		ProcessarDados obj = new ProcessarDados();
		obj.run();
	}

	public void run() {

		String arquivoCSV = "C:\\Users\\Daniela\\data\\in\\arquivo.csv";
		BufferedReader br = null;
		String linha = "";
		String csvDivisor = ";";
		try {

			br = new BufferedReader(new FileReader(arquivoCSV));
			while ((linha = br.readLine()) != null) {

				String[] pais = linha.split(csvDivisor);
				

				System.out.println(pais[pais.length-4]);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
