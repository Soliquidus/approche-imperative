package fr.algorithmie;

/**
 * Classe qui affiche seulement les données partielles d'un tableau pour une
 * condition donnée.
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 04/10/2021
 */
public class AffichagePartiel {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher seulement les entiers supérieurs à 3
        System.out.println("Entiers supérieurs à 3 : ");
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
        }

        //Afficher seulement les entiers pairs
        System.out.println("Entiers pairs : ");
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        //Afficher les entiers aux index pairs
        System.out.println("Entiers aux index pairs : ");
        for (int i = 0; i <= array.length-1; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        //Afficher seulement les entiers impairs
        System.out.println("Entiers impairs : ");
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
