package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		
		byte exempleByte = 1;
		short exempleShort = 2500;
		int exempleInt = 3000000;
		long exempleLong = 45405454244054L;
		float exempleFloat = 4.754F;
		double exempleDouble = 3.58674D;
		char exempleChar = 'C';
		String exempleChaine = "Hello world!";
		boolean exempleBooleen = true;

		//Affichage de la valeur d'une variable
		System.out.println(exempleDouble + " et " + exempleByte);

		//Retour à la ligne d'une chaîne de charactère
		String randomString = "Voici le résultat d'un calcul :\n 1+5=6";
		System.out.println(randomString);
	}

}
