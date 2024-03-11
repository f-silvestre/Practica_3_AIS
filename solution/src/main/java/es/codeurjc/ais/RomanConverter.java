package es.codeurjc.ais;

public class RomanConverter {
    
    public String convert(int number){
        String roman = "";

        if(number >= 10){
            for(int i = 0; i < number/10; i++){
                roman += "X";
            }
        }else{
            for(int i = 0; i < number; i++){
                roman += "I";
            }
        }

        return roman;
    }
}
