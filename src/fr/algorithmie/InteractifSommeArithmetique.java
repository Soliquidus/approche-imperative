package fr.algorithmie;

import java.util.Scanner;

/**
 * Classe pour demander à un utilisateur un chiffre, le programme va ensuite lui afficher
 * la somme entre tous les entiers et ce chiffre
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        int chiffreSaisi;
        boolean recommencer = true;
        Scanner sc = new Scanner(System.in);

        while (recommencer) {
            System.out.println("Saisissez un nombre :");
            try {
                chiffreSaisi = sc.nextInt();
                int somme = 0;
                int i = 1;
                while(i <= chiffreSaisi){
                    somme = somme + i;
                    i = i + 1;
                }

                System.out.println("Somme de tous les entiers entre 1 et " + chiffreSaisi +" : " + somme);
                recommencer = false;
            } catch (java.util.InputMismatchException e) {
                System.out.print("Vous devez obligatoirement taper un nombre !");
                break;
            }
        }
    }
}
