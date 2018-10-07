import java.util.Scanner;

import java.util.Scanner;

public class JuomaAutomatisoidaan {

	public static void main(String args[]) {

		// scanneri
		Scanner lukija = new Scanner(System.in);
		// luodaan juomis
		JuomaAutomaatti juomaKone = new JuomaAutomaatti();
		// looppia jossa ohjelma toimii, kunnes poistutaan (joko kone syö rahat tai
		// käyttäjä valitsee poistumisen)
		while (true) {
			// *-merkillä UI
			System.out.println("*******Juoma-Automaatti*******\n");
			System.out.println("1. Kahvi\n2. Tee\n3. Kaakao\n4. Lopeta tilaaminen\n\n******************************");

			int valinta = lukija.nextInt();
			// if lauseella katsotaan "onnistuuko" juoman tekeminen ja otetaan huomioon
			// valinta 4, jolloin
			// käyttäjä haluaa itse poistua, ettei tähän tule ilmoitusta syödystä rahasta

			// normaalisti tämän jälkeen valinnasta riippuen annetaan joko tee/kahvi/kaakao
			// kyseistä metodia kutsuen, lopuksi kutsutaan juomakone toStringiä, jolla
			// saadaan jäljellä olevat juomamäärät näkyviin
			if (juomaKone.onnistuuko() == true && valinta != 4) {
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
				}
			}
			// valinta 4 else if:nä erikseen, jos tämä olisi yläpuolella olevan if- lauseen
			// sisällä tulisi viimeisen elsen (onnistuuko methodi== false) tulostus
			else if (valinta == 4) {
				System.out.println("Kiitos ja näkemiin!");
				System.exit(0);
			} else {
				System.out.println("Kiitos raheista, juomista et kyllä saa :)");
				System.exit(0);
			}
		}

	}
}
