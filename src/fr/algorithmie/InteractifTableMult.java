package fr.algorithmie;

import java.util.Scanner;

/**
 * Classe pour demander à un utilisateur un chiffre entre 1 et 10, le programme va lui
 * proposer la table correspondante au chiffre.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class InteractifTableMult {
    public static void main(String[] args) {
        int chiffreMin = 1;
        int chiffreMax = 10;
        int chiffreSaisi;
        boolean recommencer = true;
        Scanner sc = new Scanner(System.in);

        while (recommencer) {
            System.out.println("Saisissez un nombre entre " + chiffreMin + " et " + chiffreMax + " :");
            try {
                chiffreSaisi = sc.nextInt();
                if (chiffreSaisi >= 0 && chiffreSaisi <= 10) {
                    System.out.println("Table de " + chiffreSaisi + " :");
                    System.out.println(chiffreSaisi + " * 1 = " + chiffreSaisi);
                    System.out.println(chiffreSaisi + " * 2 = " + (chiffreSaisi*2));
                    System.out.println(chiffreSaisi + " * 3 = " + (chiffreSaisi*3));
                    System.out.println(chiffreSaisi + " * 4 = " + (chiffreSaisi*4));
                    System.out.println(chiffreSaisi + " * 5 = " + (chiffreSaisi*5));
                    System.out.println(chiffreSaisi + " * 6 = " + (chiffreSaisi*6));
                    System.out.println(chiffreSaisi + " * 7 = " + (chiffreSaisi*7));
                    System.out.println(chiffreSaisi + " * 8 = " + (chiffreSaisi*8));
                    System.out.println(chiffreSaisi + " * 9 = " + (chiffreSaisi*9));
                    System.out.println(chiffreSaisi + " * 10 = " + (chiffreSaisi*10));
                    recommencer = false;
                } else {
                    System.out.println("Veuillez saisir un nombre entre " + chiffreMin + " et " + chiffreMax + " !");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.print("Vous devez obligatoirement taper un nombre !");
                break;
            }
        }
    }
}
