package fr.algorithmie;

import java.util.Scanner;

/**
 * Classe pour demander à un utilisateur un chiffre entre 1 et 10, le programme lui redemande
 * si le chiffre saisi n'est pas bon
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class InteractifTantQue {
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
                    System.out.println("Le chiffre saisi est : " + chiffreSaisi);
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
