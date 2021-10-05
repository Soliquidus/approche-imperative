package fr.algorithmie;

/**
 * Classe pour faire une rotation vers la droite dans un tableau
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class Rotation {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int tempsRotation = 1;

        System.out.println("Tableau original: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Rotation du tableau par le temps de rotation donné vers la droite
        for(int i = 0; i < tempsRotation; i++){
            int j, dernierElement;
            //Stocker le dernier élément du tableau
            dernierElement = array[array.length-1];
            for (j = array.length-1; j > 0; j--){
                //Transformer les éléments un par un
                array[j] = array[j-1];
            }
            //Le dernier élément sera toujours ajouté au début du tableau
            array[0] = dernierElement;
        }

        System.out.println("Tableau après la rotation : ");
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
