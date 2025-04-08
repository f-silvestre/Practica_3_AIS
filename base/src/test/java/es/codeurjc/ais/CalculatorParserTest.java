package es.codeurjc.ais;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class CalculatorParserTest{ 
	public CalculatorParser calculatorParser;
    
	@BeforeEach
	public void init(){
		calculatorParser= new CalculatorParser(); 
	}
	
	@Test
    public void receives_number_returns_same_number_ej_1(){
		assertEquals(1,calculatorParser.parser("1"));
	}
		
	@Test
    public void receives_number_returns_same_number_ej_2(){
		assertEquals(2,calculatorParser.parser("2"));
	}
	
	
	@Test
    public void receives_number_returns_same_number_ej_3(){
		assertEquals(3,calculatorParser.parser("3"));
	}
	
	@Test
	public void receives_two_equal_numbers_returns_addition(){
		assertEquals(2,calculatorParser.parser("1 + 1"));
	}
	/*
	@Test
	public void diferent_numbers_returns_addition(){
		
		assertEquals(5,calculatorParser.parser("2 + 3"));
	}
	
	
	@Test
	public void receives_three_numbers_returns_addition() {
		assertEquals(calculatorParser.parser("2 + 3 + 4"),9);
	}
	
	@Test
	public void receives_four_numbers_returns_addition(){
		assertEquals(calculatorParser.parser("1 + 2 + 3 + 4"),10);
	}
	
	@Test
	public void receives_letter_throws_exception() {
		assertThrows(IOException.class, () -> calculatorParser.parser("A"));
		assertThrows(IOException.class, () -> calculatorParser.parser("B"));
		assertThrows(IOException.class, () -> calculatorParser.parser("C"));
		assertThrows(IOException.class, () -> calculatorParser.parser("k"));
	}
	
	@Test
	public void recives_an_expression_returns_exception(){
		assertThrows(IOException.class, () -> calculatorParser.parser("1 + A"));
	}  
	
	@Test
	public void receives_two_numbers_returns_difference(){
		assertEquals(calculatorParser.parser("5 - 3"), 2);
		assertEquals(calculatorParser.parser("1 - 2"), -1);
	}
	
	@Test
	public void receives_three_numbers_returns_difference() {
		assertEquals(calculatorParser.parser("7 - 2 - 1"), 4);
	}
	
	@Test
	public void receives_four_numbers_returns_difference() {
		assertEquals(calculatorParser.parser("9 - 5 - 3 - 1"), 0);
	}
	
	
	@Test
	public void receives_three_numbers_returns_mixed_operation_expression_result() {
		assertEquals(calculatorParser.parser("7 + 1 - 5"), 3);
		assertEquals(calculatorParser.parser("9 - 5 + 4"), 8);

	}
	
	@Test
	public void receives_four_numbers_returns_mixed_operation_expression_result() {
		assertEquals(calculatorParser.parser("9 + 1 - 6 - 2"), 2);
	}
	
	
	@Test
	public void receives_two_numbers_with_first_being_negative_returns_operation_result() {
		assertEquals(calculatorParser.parser("-5 + 9"), 4);
	}
	
	*/
	
	
	  
}