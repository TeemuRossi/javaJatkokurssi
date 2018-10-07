
import java.util.Scanner;

public class JuomaAutomatisoidaan {

	public static void main(String args[]) {

		// scanneri
		Scanner lukija = new Scanner(System.in);
		// luodaan juomis
		JuomaAutomaatti juomaKone = new JuomaAutomaatti();
		// looppia
		while (true) {
			// *-merkillä UI
			System.out.println("*******Juoma-Automaatti*******\n");
			System.out.println("1. Kahvi\n2. Tee\n3. Kaakao\n4. Lopeta tilaaminen\n\n******************************");

			int valinta = lukija.nextInt();
			if (juomaKone.onnistuuko() == true && valinta!=4) {
				if (valinta == 1) {
					juomaKone.valmistaKahvi();
					System.out.println(juomaKone);
				}

				else if (valinta == 2) {
					juomaKone.valmistaTee();
					System.out.println(juomaKone);
				} else if (valinta == 3) {
					juomaKone.valmistaKaakao();
					System.out.println(juomaKone);
				} else if (valinta == 4) {
					System.out.println("Kiitos ja näkemiin!");
					System.exit(0);
				}
			} else {
				System.out.println("Kiitos raheista, juomista et kyllä saa :)");
				System.exit(0);
			}
		}

	}
}
