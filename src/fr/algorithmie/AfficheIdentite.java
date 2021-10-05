package fr.algorithmie;

/**
 * Classe qui permet d'afficher son identité.
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 04/10/2021
 */
public class AfficheIdentite {

    public static void main(String[] args) {
        String identite = "Tibo Pfeifer";

        //Utiliser une boucle for pour afficher dix fois votre identité
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + identite);
        }
    }
}
