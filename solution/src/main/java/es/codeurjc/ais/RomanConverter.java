package es.codeurjc.ais;

public class RomanConverter {
    
    public String convert(int number){
        String roman = "";

        int rest = number;

        while(rest >= 10){
            roman += "X";
            rest -= 10;
        }

        while(rest >= 1){
            roman += "I";
            rest -= 1;
        }

        return roman;
    }
}
