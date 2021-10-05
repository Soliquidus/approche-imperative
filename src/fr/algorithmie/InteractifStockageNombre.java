package fr.algorithmie;

import java.util.Scanner;

/**
 * Classe pour stocker le chiffres saisis par l'utilisateur dans un tableau, il pourra également
 * afficher les nombres existants et le tableau pourra également s'agrandir si besoin.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class InteractifStockageNombre {
    public static void main(String[] args) {
        int chiffreSaisi, taille;
        int [] arrayValeurs = {};
        Scanner sc = new Scanner(System.in);

        do {
            taille = arrayValeurs.length;
            System.out.println("Que voulez vous faire ?");
            System.out.println("1 -> Ajouter un nombre");
            System.out.println("2 -> Afficher les nombres rentrés");
            System.out.println("3 -> Quitter le programme");
            try {
                chiffreSaisi = sc.nextInt();
                switch (chiffreSaisi) {
                    case 1:
                        System.out.println("Saisissez le chiffre que vous voulez ajouter :");
                        int valeurSaisie = sc.nextInt();
                        arrayValeurs = addValeurSaisie(taille, arrayValeurs, valeurSaisie);
                        break;
                    case 2:
                        System.out.println("Chiffres ajoutés :");
                        for (int valeur : arrayValeurs) {
                            System.out.print(valeur + " | ");
                        }
                        System.out.println();
                }
            } catch (java.util.InputMismatchException e) {
                System.out.print("Vous devez obligatoirement taper un nombre !");
                break;
            }
        } while (chiffreSaisi != 3);
    }

    //Methode pour créer un nouveau tableau recevant les valeurs de l'ancien
    public static int[] addValeurSaisie(int taille, int[] oldArray, int valeurSaisie) {
        int i;
        //Copie de tableau
        int[] newArray = new int[taille + 1];

        //Ajout des éléments de l'ancien tableau vers le nouveau
        for (i = 0; i < taille; i++)
            newArray[i] = oldArray[i];
        newArray[taille] = valeurSaisie;

        return newArray;
    }
}
