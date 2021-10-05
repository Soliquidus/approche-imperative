package fr.algorithmie;

import java.util.Scanner;

/**
 * Classe pour demander à un utilisateur dix chiffres et ensuite lui afficher celui qui est
 * le plus grand d'entre eux.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class InteractifPlusGrand {
    public static void main(String[] args) {
        int chiffreSaisi;
        boolean recommencer = true;
        Scanner sc = new Scanner(System.in);

        while (recommencer) {
            System.out.println("Saisissez dix nombres :");
            try {
                int [] chiffres = new int[10];
                chiffreSaisi = sc.nextInt();
                chiffres[0] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[1] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[2] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[3] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[4] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[5] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[6] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[7] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[8] = chiffreSaisi;
                chiffreSaisi = sc.nextInt();
                chiffres[9] = chiffreSaisi;
                int valeurMax = chiffres[0];
                for (int chiffre : chiffres) {
                    if (chiffre > valeurMax) {
                        valeurMax = chiffre;
                    }
                }
                System.out.println("La valeur la plus grande saisie est : " + valeurMax);


                recommencer = false;
                } catch (java.util.InputMismatchException e) {
                System.out.print("Vous devez obligatoirement taper un nombre !");
                break;
            }
        }
    }
}
