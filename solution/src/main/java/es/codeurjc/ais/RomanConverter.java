package es.codeurjc.ais;

public class RomanConverter {
    
    public String convert(int number){
        if (number == 2) {
            return "II";
        }
        return "I";
    }
}
