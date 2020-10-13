package boleto;

public class Boleto {

		private String codBoleto;
		private String dataBoleto;
		private double valorBoleto;
		
		
	public Boleto (String codBoleto, String dataBoleto, double valorBoleto) {
		
		this.codBoleto = codBoleto;
		this.dataBoleto = dataBoleto;
		this.valorBoleto = valorBoleto;
	}
	
	public String getCodBoleto () {
		return codBoleto;
	}
	
	public String getDataBoleto () {
		return dataBoleto;
	}
	
	public double getValorBoleto () {
		return valorBoleto;
	}
	
	public void setCodBoleto (String codBoleto) {
		this.codBoleto = codBoleto;
	}
	
	public void setDataBoleto (String dataBoleto) {
		this.dataBoleto = dataBoleto;
	}
	
	public void setValorBoleto (double valorBoleto) {
		this.valorBoleto = valorBoleto;	
	}
	
}
