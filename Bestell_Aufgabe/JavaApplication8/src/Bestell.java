import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bestell {
    
    
    public static void main(String[] args) throws IOException
    {
        
        int bestellwert;
        double ergebniss;
	String str;
	BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Berechnung des Rechnungsbetrages");
        System.out.print("Bestellwert in Euro: " );
	str=eingabe.readLine();
	bestellwert=Integer.parseInt(str); 
        if (bestellwert >= 200)
        {  
            ergebniss=bestellwert;          
            System.out.println("Rechnungsbetrag: "+ergebniss);
            System.out.println("Programmende Bestell");    
        }
        else
        {
            ergebniss=bestellwert+7;          
            System.out.println("Rechnungsbetrag: "+ergebniss);
            System.out.println("Programmende Bestell"); 
            
        }
      
    }//main
        
}//class
