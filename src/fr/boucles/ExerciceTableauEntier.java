package fr.boucles;

public class ExerciceTableauEntier {
	public static void main(String[] args) {
		/**
		 * Parcours d'un tableau d'entiers
		 */
		
		//Tableau d'entiers contenant tous les entiers de 1 à 9
		int [] tableauEntiers = {1,2,3,4,5,6,7,8,9,10};
		
		//Premier élément d'un tableau
		System.out.println(tableauEntiers[0]);
		
		//Longueur d'un tableau
		System.out.println(tableauEntiers.length);
		
		//Dernier élément d'un tableau en utilisant length
		System.out.println(tableauEntiers.length-1);
		
		//Modifiez l'élément d'index 4 d'un tableau et modifiez sa valeur
		tableauEntiers[4] = 8;
		System.out.println(tableauEntiers[4]);
	}
}
