package exercice.fr.boucle;

public class ExerciceTableauEntier {

    public static void main(String[] args) {
        System.out.println("Exercice 2 : \n");

        int[] tableauEntier = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Premier élément : ");
        System.out.println(tableauEntier[0]);

        System.out.print("Taille du tableau : ");
        System.out.println(tableauEntier.length);

        System.out.print("Dernier élément : ");
        System.out.println(tableauEntier[tableauEntier.length -1]);

        System.out.print("Elemtn d'index 4 : ");
        tableauEntier[4] = 8;
        System.out.println(tableauEntier[4]);

    }
}
