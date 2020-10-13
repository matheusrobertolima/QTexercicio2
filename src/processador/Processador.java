package processador;

import java.util.ArrayList;
import java.util.Iterator;
import boleto.Boleto;
import fatura.Fatura;

public class Processador {

		private ArrayList<Boleto> boletos;
		private String dataPagamento;
		private Fatura fatura;
		boolean status;
		
		
		public Processador () {
			boletos = new ArrayList<Boleto>();
		}

		public double getValorTotal() {
			double valorTotal = 0.0;
			
			for (Iterator i = boletos.iterator(); i.hasNext();) {
				Boleto bol = (Boleto) i.next();
				valorTotal += bol.getValorBoleto();
			}
			
			return valorTotal;
		}
		
		public void addBoleto (Boleto bol) {
			boletos.add(bol);
		}
		
		public String getDataPagamento () {
			return dataPagamento;
		}
		
		public void setDataPagamento (String dataPagamento) {
			this.dataPagamento = dataPagamento;
		}
		
		public void addFatura (Fatura fatura) {
			this.fatura = fatura;
		}
		
		public double valorFatura () {
			return fatura.getValorFatura();
		}
		
		public void comparacaoValor (double getValorTotal, double valorFatura) {
			if(getValorTotal <= fatura.getValorFatura())
				status = true;
			else
				status = false;
			
			if(status == true)
				System.out.println("FATURA PAGA");
			else
				System.out.println("FATURA NÃO PAGA");
		}
		
		
		
}

