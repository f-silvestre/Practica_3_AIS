package es.codeurjc.ais;

public class RomanConverter {
    
    public String convert(int number){
        
        String[] letters = {"I", "X"};
        int[] values = {1, 10};

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
