package fr.algorithmie;

/**
 * Classe pour rechercher l'élément le plus grand d'un tableau
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 04/10/2021
 */
public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int valeurMax = array[0];

        for(int i : array){
            if (i > valeurMax){
                valeurMax = i;
            }
        }
        System.out.println("Elément le plus grand du tableau : " + valeurMax);
    }
}
