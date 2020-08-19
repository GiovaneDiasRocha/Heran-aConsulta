package ProjetoConsulta;

public class ConsultaOuro extends Consulta{
	public double getValorConsulta() {			
			if(super.getAnoInclusaoPlano() <= 2000) {						
				return 0;
			} else {
				return super.getValorConsulta() - ((super.getValorConsulta() * 30) /100);
			}		 
	}
}
