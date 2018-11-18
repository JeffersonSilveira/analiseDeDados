

public enum Layout {

	UM("001"), DOIS("002"), TRES("003");

	private String descricao;

	Layout(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
