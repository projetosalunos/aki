package sistema.modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Usuario {
	@Id
	private String CPF;
	private String Email, Nome, TelefoneFixo, TelefoneMovel, Endere�o, RG, CREF, foto;
	private List<Equipe> Equipes;
	private List<Inscrito> Inscri��es;
	private List<Campeonato> Campeonatos;
	private Date DataNascimento;
	private enum Sexo {F,M;};
	private Sexo sexo;
	private enum Tipo {ADM, Juiz, Organizador, Jogador, T�cnico, Torcedor, Diretor;};
	private Tipo tipo;
	public Usuario() {}
	public Usuario(String email, String nome, String telefoneFixo, String telefoneMovel, String endere�o, String rG,
			String cPF, String cREF, String foto, List<Equipe> equipes, List<Inscrito> inscri��es,
			List<Campeonato> campeonatos, Date dataNascimento, Sexo sexo, Tipo tipo) {
		super();
		Email = email;
		Nome = nome;
		TelefoneFixo = telefoneFixo;
		TelefoneMovel = telefoneMovel;
		Endere�o = endere�o;
		RG = rG;
		CPF = cPF;
		CREF = cREF;
		this.foto = foto;
		Equipes = equipes;
		Inscri��es = inscri��es;
		Campeonatos = campeonatos;
		DataNascimento = dataNascimento;
		this.sexo = sexo;
		this.tipo = tipo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefoneFixo() {
		return TelefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		TelefoneFixo = telefoneFixo;
	}
	public String getTelefoneMovel() {
		return TelefoneMovel;
	}
	public void setTelefoneMovel(String telefoneMovel) {
		TelefoneMovel = telefoneMovel;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getCREF() {
		return CREF;
	}
	public void setCREF(String cREF) {
		CREF = cREF;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public List<Equipe> getEquipes() {
		return Equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		Equipes = equipes;
	}
	public List<Inscrito> getInscri��es() {
		return Inscri��es;
	}
	public void setInscri��es(List<Inscrito> inscri��es) {
		Inscri��es = inscri��es;
	}
	public List<Campeonato> getCampeonatos() {
		return Campeonatos;
	}
	public void setCampeonatos(List<Campeonato> campeonatos) {
		Campeonatos = campeonatos;
	}
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Usuario [Email=" + Email + ", Nome=" + Nome + ", TelefoneFixo=" + TelefoneFixo + ", TelefoneMovel="
				+ TelefoneMovel + ", Endere�o=" + Endere�o + ", RG=" + RG + ", CPF=" + CPF + ", CREF=" + CREF
				+ ", foto=" + foto + ", Equipes=" + Equipes + ", Inscri��es=" + Inscri��es + ", Campeonatos="
				+ Campeonatos + ", DataNascimento=" + DataNascimento + ", sexo=" + sexo + ", tipo=" + tipo + "]";
	}
	
	
}
