package cours.variable;

import java.util.Scanner;

public class Variable {

    public static void main(String[] args){

        System.out.println("Bienvenue dans mon application");
        String name;
        System.out.println("Entrez votre nom : ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        sc.close();
        System.out.println("Coucou "+name);

        for(String s : args) {
            System.out.println(s);
        }
    }
}
