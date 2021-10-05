package fr.algorithmie;

/**
 * Classe pour valider avec un booléen si le tableau contient au moins deux éléments
 * et que la première et dernière valeur ont la même valeur.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class FirstLast {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        boolean firstLast;

        if(array.length-1 >= 1){
            if(array[0] == array[array.length-1]) {
                firstLast = true;
                System.out.println("Le tableau content au moins deux éléments avec la valeur " + array[0] +
                        " comme premier et dernier élément du tableau. Boléen : " + firstLast);
            }
            else {
                firstLast = false;
                System.out.println("Le tableau content au moins deux éléments mais la valeur " + array[0] +
                        " n'est pas comme première et dernière valeur du tableau. Boléen : " + firstLast);
            }
        }
        else {
            firstLast = false;
            System.out.println("Le tableau ne contient pas assez d'élements ou est vide !" +
                    " Booléen : " + firstLast);
        }
    }
}
