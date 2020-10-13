module exercicio2 {
	exports fatura;
	exports processador;
	exports produto;
	exports basico;
	exports boleto;
	exports carrinho;
	exports calculadora;

	requires junit;
	requires org.hamcrest.core;
	requires org.junit.jupiter.api;
	requires org.opentest4j;
}