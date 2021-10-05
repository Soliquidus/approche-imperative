package fr.algorithmie;

import java.util.Scanner;

/**
 * Classe qui permet d'indiquer le rang auquel appartient une valeur donnée dans la
 * suite de Fibonacci (ou tous les rangs le précédent également).
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 05/10/2021
 */
public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sélectionnez un rang dans la suite de Fibonacci : ");
        int rang = sc.nextInt();

        //Parcourir les rangs jusqu'à la valeur indiquée
        for (int i = 1; i <= rang; i++)//commencer de n=1
            //Pour afficher tous les rangs jusqu'à la valeur indiquée
            //System.out.println("Rang " + i + " : " + fibonacci(i));
            //Afficher seulement le rang indiqué par l'utilisateur ainsi que sa valuer
            if (i == rang) {
                System.out.println("Nombre du rang " + rang + " : " + fibonacci(i));
            }
    }

    private static int fibonacci(int nombre) {
        if (nombre <= 1) return nombre;
        else return fibonacci(nombre - 1) + fibonacci(nombre - 2);
    }

}

