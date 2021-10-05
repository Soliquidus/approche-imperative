package fr.algorithmie;

/**
 * Classe pour qui inverse les éléments d'un tableau donné.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 04/10/2021
 */
public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher le tableau d'entiers
        System.out.println("Le tableau d'entiers : ");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }

        //Afficher le tableau avec les éléments inversés
        int indexTotal = array.length;
        int[] arrayCopy = new int[indexTotal];
        int indexRecup = indexTotal;
        for (int i = 0; i < indexTotal; i++) {
            arrayCopy[indexRecup - 1] = array[i];
            indexRecup = indexRecup - 1;
        }
        System.out.println("Le tableau inversé : ");
        for (int j = 0; j < indexTotal; j++) {
            System.out.println(arrayCopy[j]);
        }
    }
}
