package carrinho;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.*;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Classe para teste do carrinho")
public class CarrinhoTest {

	private Carrinho carrinho;
	
	@BeforeEach
	public void inicializaCarrinho() {
		carrinho = new Carrinho ();
	}
	
	@DisplayName("Testa se o valor é igual ao inicial")
	@Test
	public void testValorIgual() {	
		Assertions.assertEquals(0.0, carrinho.getValorTotal());		
	}
	
	@DisplayName("Testa se a quantidade de objetos é igual ao esperado")
	@Test
	public void testObjectCarrinho() {
		Produto produto1 = new Produto("Fandangos", 2.50);
		Produto produto2 = new Produto("Fandangos", 3.50);
		carrinho.addItem(produto1);
		carrinho.addItem(produto2);
		
		Assertions.assertEquals(2, carrinho.getQtdeItems());
		}
	
	@DisplayName("Testa se a o carrinho foi limpo")
	@Test
	public void testLimparCarrinho() {
		Produto produto3 = new Produto("Ruffles", 4.50);
		Produto produto4 = new Produto("Doritos", 4.00);
		carrinho.addItem(produto3);
		carrinho.addItem(produto4);
		carrinho.esvazia();
		
		Assertions.assertTrue(carrinho.getQtdeItems() == 0);
		
	}
	
	@DisplayName("Testa se o objeto é não-nulo")
	@Test
	public void testObjetoNulo() {
		Produto produto5 = new Produto("Cebolitos", 4.25);
		Assertions.assertNotNull(produto5);
		
	}
	
	@DisplayName("Testa exception")
	@Test
	public void testExceptionCarrinho() throws ProdutoNaoEncontradoException {
		Produto produto6 = new Produto("CocaCola", 3.35);
		
		//carrinho.removeItem(produto6);
		Assertions.assertThrows(ProdutoNaoEncontradoException.class, 
				() -> carrinho.removeItem(produto6)	);
	}
	

}
			
	
	
