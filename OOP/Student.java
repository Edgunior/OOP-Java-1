
package nedelja05priprema1;

public class Student {
    
    private String ime; 
    private String prezime; 
    private int godinaRodjenja; 

    public Student(String ime, String prezime, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
    }
    
    
    public String getIme() {return this.ime;} 
    public String getPrezime() {return this.prezime;} 
    public int getGodinaRodjenja() {return this.godinaRodjenja;} 
    
    public void setIme(String ime) {this.ime = ime;}
    public void setPrezime(String prezime) {this.prezime = prezime;} 

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    
    
    
    
}
