package cours.tableau;

import java.util.Scanner;

public class Tableau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue");
        System.out.print("Veuillez entrer le nom de l'apprenant 1 : ");
        String name1 = sc.nextLine();
        System.out.print("Veuillez entrer le note de " + name1 + " : ");
        float note1 = sc.nextFloat();
        System.out.print("Veuillez entrer le nom de l'apprenant 2 : ");
        String name2 = sc.nextLine();
        System.out.print("Veuillez entrer le note de " + name2 + " : ");
        float note2 = sc.nextFloat();

    }
}
