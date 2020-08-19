package ProjetoConsulta;

public class ConsultaDiamante extends Consulta{

	public double getValorConsulta() {
		return (super.getValorConsulta() - (super.getValorConsulta() * 40) /100); 
	}
}
