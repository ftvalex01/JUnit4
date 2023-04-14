package testfuncionales;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class personaTest {

	@Test
	void test3() {
		Persona p = new Persona(0);
		assertFalse(p.isMayorDeEdad());
	}
	@Test
	void test4() {
		Persona p = new Persona(17);
		assertFalse(p.isMayorDeEdad());
	}
	@Test
	void test5() {
		Persona p = new Persona(18);
		assertTrue(p.isMayorDeEdad());
	}
	@Test
	void test6() {
		Persona p = new Persona(100);
		assertTrue(p.isMayorDeEdad());
	}

}
