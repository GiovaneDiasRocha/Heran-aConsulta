package ProjetoConsulta;

public class Consulta {
	private String nomeDoPaciente;
	private String matricula;
	private int numeroDeDependentes;
	private int anoInclusaoPlano;
	private double valorConsulta;
	
	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}
	
	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}
	
	public String getMatricula() {
			return this.matricula;
	}
		
	public void setMatricula(String matricula, int tamanhoMaximo) {
		if(matricula.length()<=tamanhoMaximo) {
			this.matricula = matricula;
		} else {
			this.matricula = matricula.substring(0, tamanhoMaximo);
		}
	}
	
	public int getNumeroDeDependentes() {
		return numeroDeDependentes;
	}
	
	public void setNumeroDeDependentes(int numeroDeDependentes) {
		this.numeroDeDependentes = numeroDeDependentes;
	}
	
	public int getAnoInclusaoPlano() {
		return anoInclusaoPlano;
	}
	
	public void setAnoInclusaoPlano(int anoInclusaoPlano) {
		this.anoInclusaoPlano = anoInclusaoPlano;
	}
	
	public double getValorConsulta() {
		return this.valorConsulta;
	}
	
	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
}
