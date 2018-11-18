package dataAnalysis;

public class Report {
	// Quantidade de clientes no arquivo de entrada

	public int customerQuantity(String layouts) {
		int soma = 0;
		String layout[] = layouts.split("ç");
		for (int i = 0; i < layout.length; i++) {
			if (layout[i].contains("002")) {
				soma = soma + 1;
			}
		}
		return soma;
		
	}

	// Quantidade de vendedor no arquivo de entrada
	public int QuantityOfSeller(String layouts) {
		int soma = 0;
		String layout[] = layouts.split("ç");
		for (int i = 0; i < layout.length; i++) {
			if (layout[i].contains("001")) {
				soma = soma + 1;
			}
		}
		return soma;
	}

	// ID da venda mais cara
	public String mostExpensiveSale(String layouts) {
		  
		return layouts;
	}

	// Pior vendedor de todos os tempos
	public String WorstSeller(String layouts) {

		return layouts;
	}
}
