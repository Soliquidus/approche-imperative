package fr.algorithmie;

import java.util.Scanner;

/**
 * Classe pour faire deviner à l'utilisateur un chiffre entre 1 et 100, à chaque tentative
 * le programme lui dit si il se rapproche ou s'éloigne ainsi que le nombre d'essais à la fin.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class InteractifPlusMoins {
    private final static int chiffreMax = 100;
    public static void main(String[] args) {
        int chiffreSaisi, nbEssais = 0;
        int chiffreAleatoire = (int) (Math.random() * chiffreMax) + 1;
        boolean recommencer = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un nombre entre 1 et " + chiffreMax + " pour deviner le chiffre:");
        do {
            try {
                chiffreSaisi = sc.nextInt();
                nbEssais++;
                if(chiffreSaisi < chiffreAleatoire){
                    System.out.println("Plus grand !");
                } else if(chiffreSaisi > chiffreAleatoire){
                    System.out.println("Plus petit !");
                }
                } catch (java.util.InputMismatchException e) {
                System.out.print("Vous devez obligatoirement taper un nombre !");
                break;
            }
        } while (chiffreSaisi != chiffreAleatoire);
        System.out.println("Bravo ! C'est bien " + chiffreAleatoire + " ! Il vous aura fallu " +
                + nbEssais + " tentatives.");
    }
}
