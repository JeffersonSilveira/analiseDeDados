package dataAnalysis;

public class LayoutTreatment {
	public Boolean retornoTratamento(String name) {
		Boolean valido = Boolean.FALSE;
		// Validando layout
		for (Layout layoutValido : Layout.values()) {
			if (layoutValido.getDescricao().equals(name.substring(0, 3))) {
				valido = Boolean.TRUE;
			}
		}

		return valido;
	}

	public String treatmentSpecificLayout(String layouts) {

		String layout[] = layouts.split("ç");
		for (int i = 0; i < layout.length; i++) {

			// System.out.println(layout[i]+"\n");
			if (layout[i].contains("003")) {
				String retorno = layout[2].substring(1, layout[2].length() - 1);
				String[] r = retorno.split(",");
				System.out.print(r[0] + "\n");
				System.out.print(r[1] + "\n");
				System.out.print(r[2] + "\n");
			}

		}
		return layouts;
	}
}
