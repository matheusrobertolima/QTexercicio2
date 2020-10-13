package processador;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import boleto.Boleto;
import fatura.Fatura;

public class ProcessadorTest {
	
	@Test
	public void testProcessador () {
		
		Fatura fatura = new Fatura ("998877665", "Matheus", 2000);
		Boleto boleto1 = new Boleto ("123456789", "01/01/2020", 500.00);
		Boleto boleto2 = new Boleto ("987654321", "02/01/2020", 400.00);

		
		Processador processador = new Processador();
		processador.setDataPagamento("07/01/2020");
		processador.addFatura(fatura);
		processador.addBoleto(boleto1);
		processador.addBoleto(boleto2);
		processador.getValorTotal();
		
		double somaBoletos = processador.getValorTotal();
		
		processador.comparacaoValor(somaBoletos, fatura.getValorFatura());
		
		Assertions.assertEquals(somaBoletos, fatura.getValorFatura());
		
		
	}
}
