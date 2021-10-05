package fr.algorithmie;

import java.sql.Array;

/**
 * Classe pour valider avec un booléen si le premier ou dernier élément
 * d'un tableau vaut une somme donnée.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class FirstLast6 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
        boolean firstLast;
        int valeurRecherche = 6;

        if(array != null){
            if(array[0] == valeurRecherche || array[array.length-1] == valeurRecherche) {
                firstLast = true;
                System.out.println("Le tableau n'est pas null et contient la valeur " + valeurRecherche +" " +
                        "comme premier ou dernier élément du tableau : " + firstLast);
            }
            else {
                firstLast = false;
                System.out.println("La valeur " + valeurRecherche + " n'existe pas comme " +
                        "premier ou dernier élement dans le tableau. Booléen : " + firstLast);
            }
        }
        else {
            firstLast = false;
            System.out.println("Le tableau est vide ! Booléen : " + firstLast);
        }

    }
}
