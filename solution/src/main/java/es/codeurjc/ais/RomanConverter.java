package es.codeurjc.ais;

public class RomanConverter {
    
    public String convert(int number){
        String roman = "";

        for(int i = 0; i < number; i++){
            roman += "I";
        }

        return roman;
    }
}
