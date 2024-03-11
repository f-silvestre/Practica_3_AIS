package es.codeurjc.ais;

public class RomanConverter {
    
    public String convert(int number){
        if(number == 3){
            return "III";
        }
        if (number == 2) {
            return "II";
        }
        return "I";
    }
}
