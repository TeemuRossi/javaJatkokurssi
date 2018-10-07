

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
	public boolean onnistuuko() {
		int luku = (int) (Math.random() * 100 + 1);
		if (luku < 25) {
			return false;
		} else {
			return true;
		}
	}

}
