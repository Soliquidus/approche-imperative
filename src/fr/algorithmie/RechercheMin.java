package fr.algorithmie;

/**
 * Classe pour rechercher l'élément le plus petit d'un tableau
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 04/10/2021
 */
public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int valeurMin = array[0];

        for(int i : array){
            if (i < valeurMin){
                valeurMin = i;
            }
        }
        System.out.println("Elément le plus petit du tableau : " + valeurMin);
    }
}
