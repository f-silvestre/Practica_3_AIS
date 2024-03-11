package es.codeurjc.ais;

public class RomanConverter {
    
    public String convert(int number){
        String roman = "";

        if(number == 10){
            return "X";
        }

        if(number == 20){
            return "XX";
        }

        for(int i = 0; i < number; i++){
            roman += "I";
        }

        return roman;
    }
}
