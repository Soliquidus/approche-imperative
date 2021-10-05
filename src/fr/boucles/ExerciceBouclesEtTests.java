package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        /**
         * Boucles combinées avec des tests
         */

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher l'ensemble des éléments du tableau grâce à une boucle
        int i = 0;
        System.out.println("Un tableau d'entiers : ");
        while (i <= array.length - 1) {
            System.out.println(array[i]);
            i++;
        }

        //Afficher l'ensemble des éléments dans l'ordre inversé (sans tricher avec Collections)
        //Je récupère i car il a déjà la bonne valeur de la totalité du tableau
        inverserTableau(array, i);

        //Afficher seulement les entiers supérieurs à 3
        System.out.println("Entiers supérieurs à 3 : ");
        for (i = 0; i <= array.length-1; i++) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
        }

        //Afficher seulement les entiers pairs
        System.out.println("Entiers pairs : ");
        for (i = 0; i <= array.length-1; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        
        //Afficher les entiers aux index pairs
        System.out.println("Entiers aux index pairs : ");
        for (i = 0; i <= array.length-1; i++) {
        	if (i % 2 == 0) {
        		System.out.println(array[i]);
        	}
        }
        
        //Afficher seulement les entiers impairs
        System.out.println("Entiers impairs : ");
        for (i = 0; i <= array.length-1; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    //Fonction pour inverser les éléments d'un tableau
    public static void inverserTableau(int[] tableauOriginel, int indexTotal) {
        int[] tableauInverse = new int[indexTotal];
        int indexRecup = indexTotal;
        for(int i=0; i<indexTotal; i++)
        {
            tableauInverse[indexRecup - 1] = tableauOriginel[i];
            indexRecup = indexRecup - 1;
        }
        System.out.println("Le tableau inversé : ");
        for(int j=0; j<indexTotal; j++)
        {
            System.out.println(tableauInverse[j]);
        } 
     }
    
}
