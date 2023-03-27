
package nedelja05priprema1;

import java.util.Scanner;


public class Nalog { 
    
    String ime, lozinka, datumRegistracije; 
    double stanje; 
    boolean valid; 
    
    public boolean proveriLozinku(String novaLozinka){
        if(novaLozinka.length() < 8){
            return false;
        } 
        
        int brojac = 0; 
        for(int i = 0; i < novaLozinka.length(); i++){
            if(Character.isDigit(novaLozinka.charAt(i))){
                brojac++;
            }
        } 
        
        if(brojac > 0) {
            return true;
        }else {
            return false;
        }
    
    } 

    public Nalog() {
    }

    public Nalog(String ime, String lozinka, String datumRegistracije, double stanje, boolean valid) {
        this.ime = ime;
        if(proveriLozinku(lozinka)){
            this.lozinka = lozinka; 
            this.valid = valid;
        }else {
            System.out.println("Lozinka nije validna prosledjuje se default vrednost"); 
            this.lozinka = "Lozinka1234"; 
            this.valid = false;
        }
        this.datumRegistracije = datumRegistracije;
        this.stanje = stanje;
       
    } 
    
    public void plati(double cena){
        System.out.println("Unesi lozinku"); 
        Scanner s = new Scanner(System.in); 
        String unesenaLozinka = s.nextLine(); 
        if(unesenaLozinka.equals(lozinka)){
            if(stanje >= cena && valid){
                stanje -= cena; 
                System.out.println("Transakcija uspesno izvrsena");
            } 
            if(!valid){
                System.out.println("Nalog nije validan");
            } 
            if(stanje < cena){
                System.out.println("Nemate dovoljno sredstava");
            }
        
        }else {
            System.out.println("Pogresna lozinka");
        
        } 
        
        
    
    } 
    
    @Override
    public String toString() {
       return "Nalog{ " + ime + " " + datumRegistracije + " " + stanje + " }";
    
    } 
    public void print(){
        System.out.println(this.toString());
    }
    
    
    
}
