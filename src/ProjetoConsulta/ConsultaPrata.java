package ProjetoConsulta;



public class ConsultaPrata extends Consulta{

	public double getValorConsulta() {	
		return super.getValorConsulta() - super.getValorConsulta() *20/100;
	}
	
}
