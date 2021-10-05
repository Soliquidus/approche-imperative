package fr.algorithmie;

/**
 * Classe pour comparer les éléments communs à deux tableaux
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 04/10/2021
 */
public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        int somme = -1;

        for (int i = 0; i <= array1.length-1; i++){
            int valeurArray1 = array1[i];
            for(int j = 0; j <= array2.length-1; j++){
                if(valeurArray1 == array2[j]){
                    somme++;
                }
            }
        }
        System.out.println("Nombre d'éléments communs: " + somme);
    }
}
