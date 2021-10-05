package fr.algorithmie;

/**
 * Classe pour afficher différentes suites
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 04/10/2021
 */
public class AffichageSuite {
    public static void main(String[] args) {

        //Utiliser une boucle for pour afficher tous les nombres de 1 à 10.
        System.out.println("Tous les nombres de 1 à 10 : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus.
        System.out.println("Tous les nombres pairs entre 0 et 10 inclus : ");
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        //Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus.
        System.out.println("Tous les nombres impairs entre 0 et 9 inclus : ");
        for (int i = 0; i <= 9; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        //Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus.
        int i = 0;
        System.out.println("Boucle while pour afficher les nombres de 1 à 10");
        while(i < 10) {
            i++;
            System.out.println(i);
        }

        //Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus.
        i = -1;
        System.out.println("Boucle while pour les nombres pairs entre 0 et 10 inclus");
        while (i < 10) {
            i++;
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        //Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus.
        i = -1;
        System.out.println("Boucle while pour les nombres impairs entre 0 et 9 inclus");
        while (i < 9) {
            i++;
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
