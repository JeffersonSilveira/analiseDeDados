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
}
