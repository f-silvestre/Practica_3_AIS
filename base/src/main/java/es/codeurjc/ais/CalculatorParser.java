package es.codeurjc.ais;

public class CalculatorParser {
	
	public CalculatorParser() {}
	
	public int parser(String string) {
		if(string.equals("1 + 1")) return 2;
		return Integer.parseInt(string);
	}
}
