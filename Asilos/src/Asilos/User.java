package Asilos;

class User {
	private String nomeResponsavel;
	private String nomeIdoso;
	private String mail;
	private int telefone;
	
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	
	public void setNomeIdoso(String nomeIdoso) {
		this.nomeIdoso = nomeIdoso;
	}
	
	public String getNomeIdoso() {
		return nomeIdoso;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getTelefone() {
		return telefone;
	}
}
