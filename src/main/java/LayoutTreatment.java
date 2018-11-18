

public class LayoutTreatment {
	public Boolean retornoTratamento(String name) {
		Boolean valido = Boolean.FALSE;
		// Validando layout
		for (LayoutEnum layoutValido : LayoutEnum.values()) {
			if (layoutValido.getDescricao().equals(name.substring(0, 3))) {
				valido = Boolean.TRUE;
			}
		}

		return valido;
	}
}
