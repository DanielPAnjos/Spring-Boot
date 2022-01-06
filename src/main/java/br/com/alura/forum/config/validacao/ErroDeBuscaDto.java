package br.com.alura.forum.config.validacao;

public class ErroDeBuscaDto {

	private String mensagem;

	public ErroDeBuscaDto(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
		
}
