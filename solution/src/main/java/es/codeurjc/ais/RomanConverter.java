package es.codeurjc.ais;

public class RomanConverter {
    
    public String convert(int number){
        
        String[] letters = {"X", "I"};
        int[] values = {10, 1};

        String roman = "";

        int rest = number;

        for(int i = 0; i < values.length; i++){
            while(rest >= values[i]){
                roman += letters[i];
                rest -= values[i];
            }
        }

        return roman;
    }
}
