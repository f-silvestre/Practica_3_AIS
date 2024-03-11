package es.codeurjc.ais;

public class RomanConverter {

    private static String[] LETTERS = {"X", "I"};
    private static int[] VALUES = { 10, 1 };
    
    public String convert(int number){

        if(number==9){
            return "IX";
        }
        
        String roman = "";

        int rest = number;

        for(int i = 0; i < LETTERS.length; i++){
            while(rest >= VALUES[i]){
                roman += LETTERS[i];
                rest -= VALUES[i];
            }
        }

        return roman;
    }
}
