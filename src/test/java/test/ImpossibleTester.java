package test;

import org.junit.Test;

import logic.VeryVeryDummyVideochat;

public class ImpossibleTester {
	
	@Test
	public void test_sendMessageString() {
		VeryVeryDummyVideochat var = new VeryVeryDummyVideochat(false); //viene inizializzato con false perchè ho controllato il mio dispositivo e so di non avere la webcam
		var.sendMessageSTUB("My Homework is done", "Professor F.");
	}
}
