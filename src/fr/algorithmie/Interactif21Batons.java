package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * Qui permet de jouer au jeu des 21 bâtons contre l'ordinateur, celui qui
 * doit prendre le dernier baton a perdu.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class Interactif21Batons {
    //Choisir le nombre de batons minimums et maximums que l'on peut prendre.
    private final static int choixMax = 3;
    private final static int choixMin = 1;
    public static void main(String[] args) {
        lancerJeu(21);
    }

    private static void lancerJeu(int batons){
        System.out.printf("Le jeu des %d batons\n", batons);

        Scanner sc = new Scanner(System.in);

        do {
            boolean saisieOk = false;
            int batonsJoueur = 0;
            while ( ! saisieOk ) {
                System.out.println("Combien de batons prenez-vous ?");
                int saisie = sc.nextInt();
                //Il y a le droit de prendre jusqu'à 3 batons
                try {
                    batonsJoueur = saisie;
                    if ( batonsJoueur >= 1 && batonsJoueur <= 3 ) {
                        saisieOk = true;
                    }
                    else {
                        System.out.println("Vous pouvez prendre jusqu'à 3 batons");
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Saisie incorrecte, utilisez la touche 1, 2 ou 3");
                }
            }

            //On met à jour le nombre de batons restants en soustrayant le choix du joueur.
            batons -= batonsJoueur;

            System.out.printf("Vous prenez %d baton%s.%n%d baton%s restants.%n%n", batonsJoueur, batonsJoueur > 1 ? "s" : "", batons, batons != 1 ? "s" : "");
            //S'il ne reste plus de batons, le joueur a perdu.
            if ( batons == 0 ) {
                System.out.println("Vous avez perdu !");
                break;
            }

            //Le random est utilisé afin de rendre les choix de l'orindateur non prévisible.
            if(batons == 1){
                int batonsOrdinateur = 1;
                batons -= batonsOrdinateur;
                System.out.printf("L'ordinateur prend %d baton.", batonsOrdinateur);
            } else {
                Random choixOrdinateur = new Random();
                int batonsOrdinateur = choixOrdinateur.nextInt(choixMax - choixMin + 1) + choixMin;
                batons -= batonsOrdinateur;
                System.out.printf("L'ordinateur prend %d baton%s.%n%d baton%s restants.%n%n", batonsOrdinateur, batonsOrdinateur != 1 ? "s" : "", batons, batons != 1 ? "s" : "");
            }

            if ( batons == 0 ) {
                System.out.println("L'ordinateur a perdu !");
            }

        } while (batons > 0);

        sc.close();
    }
}

