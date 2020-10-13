package calculadora;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@DisplayName("Testa a subtração de dois números")
	@Test
	public void testSubtracaoDoisNumeros() {
		int subtracao = calc.subtracao(10, 5);
		Assertions.assertNotEquals(50, subtracao);
		
	}
	
	
	@DisplayName("Testa a multiplicação de dois números")
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int multiplicacao = calc.multiplicacao(30, 10);
		Assertions.assertEquals(300, multiplicacao);
		
	}
	
	@DisplayName("Testa a divisao de dois números")
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@DisplayName("Divisão por zero")
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
	
	@DisplayName ("Testa se a somatoria tem o valor errado")
	@Test
	public void testSomatoriaValor() {
		int somatoria = calc.somatoria(5);
		Assertions.assertNotEquals(21, somatoria); //15
		
	}
	
	@DisplayName ("Testa se o valor é positivo")
	@Test
	public void testValorPositivo() {
		boolean valor = calc.ehPositivo(0);
		Assertions.assertTrue(valor == true );
			
	}
	
	@DisplayName ("Compara os numeros")
	@Test
	public void testMaiorNumero() {
		int comparacao = calc.compara(10, 5);
		Assertions.assertAll(
				() -> assertTrue(1 == comparacao),
				() -> assertFalse(-1 == comparacao)
				);
			
		}
		
}