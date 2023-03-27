
package nedelja05priprema1; 

import java.util.regex.Pattern;


public class Test { 
    
    String naziv; 
    String predmet; 
    String tacanOdgovor; 
    
    public double brojBodova(String studentskiOdgovor){
        double ukupnoPoena = 0; 
        int brojac = 0; 
        
        //abbcdda 
        
        for(int i = 0; i < tacanOdgovor.length(); i++){
            if(tacanOdgovor.charAt(i) == studentskiOdgovor.charAt(i)){
                ukupnoPoena += 10; 
                brojac++;
            
            }else {
                ukupnoPoena -= 2;
            }
        
        }
        
        if(brojac == tacanOdgovor.length()) {
            ukupnoPoena *= 1.1;
        } 
        System.out.println("Ukupno poena " + ukupnoPoena);
        return ukupnoPoena;
    } 
    
    public void proveriOdgovor(){
       /* if(tacanOdgovor.length() > 15){
            System.out.println("odgovor je predugacak, max je 15");
        } 
        for (int i = 0; i < tacanOdgovor.length(); i++) {
            if(Character.toLowerCase(tacanOdgovor.charAt(i))!= 'a' || )
        }*/
       
       if(Pattern.matches("[a-dA-D]{1,15}", tacanOdgovor)){
           System.out.println("Format je tacan");
       }
    
    }
    
}
