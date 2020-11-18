package exercice.fr.classe.essais;

import exercice.fr.classe.entities.AdressePostale;
import exercice.fr.classe.entities.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        Personne personne1 = new Personne();
        personne1.nom = "Juguin";
        personne1.prenom = "Kévin";
        personne1.adresse = new AdressePostale();
        personne1.adresse.numero = 5;
        personne1.adresse.rue = "rue de la patate";
        personne1.adresse.codePostal = "44444";
        personne1.adresse.ville = "par chez moi";

        Personne personne2 = new Personne();
        personne2.nom = "Robert";
        personne2.prenom = "Riri";
        personne2.adresse = new AdressePostale();
        personne2.adresse.numero = 25;
        personne2.adresse.rue = "rue du chocolat";
        personne2.adresse.codePostal = "66666";
        personne2.adresse.ville = "je ne sais pas";

        //    Personne personne1 = new Personne(
//            "Juguin",
//            "Kévin",
//            new AdressePostale(5,"rue de la patate","44444","par chez moi")
//    );
//    Personne personne2 = new Personne(
//            "Robert",
//            "Riri",
//            new AdressePostale(25,"rue du chocolat","66666","je ne sais pas")
//    );

    }
}
