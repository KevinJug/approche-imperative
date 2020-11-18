package exercice.fr.boucle;

import java.util.Scanner;

public class ExerciceBoucleBase {

    public static void main(String[] args) {

        System.out.println("Exercice 1 : \n");

        for (int i = 1; i < 11; i++) {
            System.out.println("Le numéro est " + i + ".");
        }

        System.out.println("\n************** \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Votre prénom : ");
        String prenom = sc.nextLine();
        System.out.print("Votre nom : ");
        String nom = sc.nextLine();

        for (int i = 0; i < 20; i++) {
            System.out.println(
                    prenom.substring(0, 1).toUpperCase() + prenom.substring(1, prenom.length()).toLowerCase()
                            + " "
                            + nom.toUpperCase());
        }

        System.out.println("\n************** \n");

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        System.out.println("\n************** \n");

        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }
}
