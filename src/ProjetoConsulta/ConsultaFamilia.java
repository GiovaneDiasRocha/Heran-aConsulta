package ProjetoConsulta;

public class ConsultaFamilia extends Consulta{
	public double getValorConsulta() {
		if(super.getNumeroDeDependentes() > 2) {
			return (super.getValorConsulta() - (super.getValorConsulta() * 50) / 100 );
		} else {
			return super.getValorConsulta();
		}	
	}
}
