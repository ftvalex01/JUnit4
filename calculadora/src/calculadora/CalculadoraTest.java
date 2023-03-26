package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void TestSuma() {
		Calculadora calc = new Calculadora(20,10);
		int resultado = calc.suma();
		assertEquals(30,resultado,"Error en la suma");
	}
	@Test
	public void TestResta() {
	        Calculadora calc = new Calculadora(20, 10);
	        int resultado = calc.resta();
	        assertEquals(10, resultado, "Error en la resta");
	    }

	 @Test
	 public void TestMultiplicacion() {
	        Calculadora calc = new Calculadora(20, 10);
	        int resultado = calc.multiplicacion();
	        assertEquals(200, resultado, "Error en la multiplicación");
	    }

	  @Test
	  public void TestDivision() {
	        Calculadora calc = new Calculadora(20, 10);
	        int resultado = calc.division();
	        assertEquals(2, resultado, "Error en la división");
	    }	

}
