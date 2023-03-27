
package nedelja05priprema1;

public class Nedelja05Priprema1 {

    public static void main(String[] args) { 
        Nalog nalog  = new Nalog("Aleksa", "Lozinkaa1", "23.3", 100000, true); 
        nalog.print(); 
        nalog.plati(500); 
        nalog.print();
    }
    
}
