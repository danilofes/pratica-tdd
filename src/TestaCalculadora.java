import org.junit.Assert;
import org.junit.Test;

public class TestaCalculadora {

	// Essa anota��o indica ao JUnit que esse m�todo � um caso de teste. Para executar
	// os testes da classe basta clicar com o bot�o direito na mesma e escolher:
	// "Run As" > "JUnit Test"
	@Test
	public void testaComStringVazia() {
		Calculadora c = new Calculadora();
		
		int saida = c.soma("");
		// � esperado que sa�da seja 0. Portanto, verifica se a sa�da � a esperada
		// usando a biblioteca JUnit:
		Assert.assertEquals(0, saida);
		
		// Uma outra maneira de fazer a mesma coisa seria:
//		if (saida != 0) {
//			Assert.fail("A sa�da deveria ser 0, mas � " + saida);
//		}
	}
	
}
