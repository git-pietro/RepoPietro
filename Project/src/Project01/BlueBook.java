package Project01;
import static pr.MakeItSimple.*;
public class BlueBook {

	public static void main(String[] args) {
		
		print("Nenner: ");
		
		int nenner = readInt();
		
		print("Zähler: ");
		
		int zaeler = readInt();		
		
		println("Ergebnis: " + Math.pow(nenner, zaeler) );
		
		if (nenner ==0)
			println("Diese Aktion ist nicht möglich, bitte nicht die Null benutzen.");
		else println("Good:)");
	}

	
	}


