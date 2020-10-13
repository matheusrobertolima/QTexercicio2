package fatura;

public class Fatura {
	
		private String dataFatura;
		private String nomeDoClienteFatura;
		private double valorFatura;


		public Fatura (String dataFatura, String nomeDoClienteFatura, double valorFatura) {
			this.dataFatura = dataFatura;
			this.nomeDoClienteFatura = nomeDoClienteFatura;
			this.valorFatura = valorFatura;
		}
		
		public String getDataFatura() {
			return dataFatura;
		}
		
		public String getNomeDoClienteFatura() {
			return nomeDoClienteFatura;			
		}
		
		public double getValorFatura() {
			return valorFatura;
		}
		
		public void setDataFatura(String dataFatura) {
			this.dataFatura = dataFatura;
		}
		
		public void setNomeDoClienteFatura(String nomeDoClienteFatura) {
			this.nomeDoClienteFatura = nomeDoClienteFatura;
		}
		
		public void setValorFatura (double valorFatura) {
			this.valorFatura = valorFatura;
		}
		
}