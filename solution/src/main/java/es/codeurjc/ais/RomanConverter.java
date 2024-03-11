package es.codeurjc.ais;

public class RomanConverter {

    private static String[] LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    private static int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    public String convert(int number){

        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than zero");
        }else if (number >= 4000) {
            throw new IllegalArgumentException("Number must be less than 4000");
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
