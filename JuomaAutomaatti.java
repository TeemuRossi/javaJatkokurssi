
import java.util.Scanner;
import java.lang.Math;

public class JuomaAutomaatti {
	private int teetä;
	private int kahvia;
	private int kaakaota;

	public JuomaAutomaatti() {
		this.kaakaota = 50;
		this.teetä = 50;
		this.kahvia = 50;
	}

	// toStringi
	@Override
	public String toString() {
		return "|Kahvia jäljellä: " + this.kahvia + " | Teetä jäljellä: " + this.teetä + " | Kaakaota jäljellä: "
				+ this.kaakaota + "|\n";
	}
	
	
	// luodaan getterit ja setterit
	

	// jokaisessa alla olevassa methodissa tarkistetaan juoman määrä ja että
	// voidaanko tätä valmistaa, if-lauseen avulla
	
	// valmistetaan vähän kahvia
	public void valmistaKahvi() {

		if (this.kahvia >= 10) {
			System.out.println("Odota hetki, Kahvia tulossa.");
			this.kahvia -= 10;
		} else {

			System.out.println("Kahvia ei ole enää jäljellä! Täytä säiliö");
		}
	}

	// valmistetaan vähän teetä
	public void valmistaTee() {

		if (this.teetä >= 10) {
			System.out.println("Odota hetki, Teetä tulossa. ");
			this.teetä -= 10;
		} else {

			System.out.println("Teetä ei ole enää jäljellä! Täytä säiliö");
		}
	}

	// making the kaakaos
	public void valmistaKaakao() {

		if (this.kaakaota >= 10) {
			System.out.println("Odota hetki, Kaakaota tulossa.");
			this.kaakaota -= 10;
		} else {

			System.out.println("Kaakaota ei ole enää jäljellä! Täytä säiliö");
		}
	}

	// täytyyhän koneesta löytyä mahdollisuus rahan katoamiselle :)
	// eli luotu math.rand ja katsotaan että onko saatu luku pienempi kuin 25 vai
	// suurempi ja palautetaan joko true tai false. Sitten tästä riippuen juoma joko
	// valmistuu tai kone syö käyttäjän rahat
	public boolean onnistuuko() {
		int luku = (int) (Math.random() * 100 + 1);
		if (luku < 25) {
			return false;
		} else {
			return true;
		}
	}

}
