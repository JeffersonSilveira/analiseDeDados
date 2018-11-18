

public enum LayoutEnum {

	UM("001"), DOIS("002"), TRES("003");

	private String descricao;

	LayoutEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
