package fr.boucles;

public class ExerciceBouclageBase {
	public static void main(String[] args) {
		
		/**
		 * Boucles de base
		 **/

		// Affichez tous les nombres de 1 à 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// Affichez 20 fois votre nom et prénom
		String nomPrenom = ".PFEIFER Tibo";
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + nomPrenom);
		}

		// Affichez les élèments pairs de 2 à 100
		int nMax = 100;
		System.out.println("Les nombres pairs de 1 à " + nMax + " sont : ");
		for (int i = 2; i <= nMax; i++) {
			if(i % 2 == 0)  {
				System.out.println(i);
			}
		}
		
		// Affichez les élèments impairs de 1 à 99
		nMax = 99;
		System.out.println("Les nombres impairs de 1 à " + nMax + " sont : ");
		for (int i = 1; i <= nMax; i++) {
			if(i % 2 != 0)  {
				System.out.println(i);
			}
		}
	}
}
