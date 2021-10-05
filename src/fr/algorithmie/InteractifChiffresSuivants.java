package fr.algorithmie;

import java.util.Scanner;

/**
 * Classe pour demander à un utilisateur un chiffre, le programme va ensuite lui afficher
 * les dix nombres suivants.
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        int chiffreSaisi;
        boolean recommencer = true;
        Scanner sc = new Scanner(System.in);

        while (recommencer) {
            System.out.println("Saisissez un nombre :");
            try {
                chiffreSaisi = sc.nextInt();
                for(int i = chiffreSaisi+1; i <= chiffreSaisi+10; i++){
                    System.out.print(i + " ");
                }
                recommencer = false;
            } catch (java.util.InputMismatchException e) {
                System.out.print("Vous devez obligatoirement taper un nombre !");
                break;
            }
        }
    }
}
