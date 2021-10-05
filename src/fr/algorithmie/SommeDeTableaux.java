package fr.algorithmie;

/**
 * Classe pour calculer la somme de deux tableaux
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 04/10/2021
 */
public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        int sommeArray1 = 0;
        int sommeArray2 = 0;

        //Calcule de la somme du tableau 1
        for (int i = 0; i <= array1.length-1; i++){
            sommeArray1 += array1[i];
        }

        //Calcule de la somme du tableau 2
        for (int i = 0; i <= array2.length-1; i++){
            sommeArray2 += array2[i];
        }

        //Création d'un nouveau tableau contenant la somme des deux anciens
        int[] tableauSomme = {(sommeArray1+sommeArray2)};
        System.out.println("Somme globale des deux tableaux : " + tableauSomme[0]);
    }
}
