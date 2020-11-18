package exercice.fr.classe.essais;

import exercice.fr.classe.entities.AdressePostale;

public class TestAdressePostale {

    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale();
        adresse1.numero = 5;
        adresse1.rue = "rue de la patate";
        adresse1.codePostal = "44444";
        adresse1.ville = "par chez moi";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numero = 25;
        adresse2.rue = "rue du chocolat";
        adresse2.codePostal = "66666";
        adresse2.ville = "je ne sais pas";

//        AdressePostale adresse1 = new AdressePostale(5,"rue de la patate","44444","par chez moi");
//        AdressePostale adresse2 = new AdressePostale(25,"rue du chocolat","66666","je ne sais pas");

    }
}
