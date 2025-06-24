import models.Horaire;
import models.ModuleInfo;
import models.Professeur;
import services.ServiceFormationMaitres;

public class App {

    public static final String[] NOMS_MODULES = { "G300", "187", "162", "123", "293", "117", "164", "216", "106", "231",
            "122", "431" };

    public static void main(String[] args) {

        Horaire horaire = new Horaire(); // !!!!!!!!!!!!!!!!!! A CONTROLER UMUT !!!!!!!!!!!!!!!!!!!!!!

        ModuleInfo[] modules1ere = new ModuleInfo[12];
        for (int i = 0; i < modules1ere.length; i++) {
            modules1ere[i] = new ModuleInfo(NOMS_MODULES[i]);
        }

        Professeur[] profs = new Professeur[5];

        profs[0] = new Professeur("WICK", "John");
        profs[1] = new Professeur("CROFT", "Lara");
        profs[2] = new Professeur("RICHARD", "Jean-Marc");
        profs[3] = new Professeur("SWIFT", "Taylor");
        profs[4] = new Professeur("SKYWALKER", "Anakin");

        //
        // !!!!!!!!!!!!!!!!!! A CONTROLER UMUT !!!!!!!!!!!!!!!!!!!!!!

        // trois manière de faire :

        // 1.
        boolean tousModulesSontCouverts = false;
        do {
            ServiceFormationMaitres.attribuerModules(profs, modules1ere);
            if (ServiceFormationMaitres.tousModulesCouverts(profs, modules1ere)) {
                tousModulesSontCouverts = true;
            }
        } while (!tousModulesSontCouverts);

        // 2.
        tousModulesSontCouverts = false;
        do {
            ServiceFormationMaitres.attribuerModules(profs, modules1ere);
            tousModulesSontCouverts = ServiceFormationMaitres.tousModulesCouverts(profs, modules1ere);
        } while (!tousModulesSontCouverts);

        // 3.
        do {
            ServiceFormationMaitres.attribuerModules(profs, modules1ere);
        } while (!ServiceFormationMaitres.tousModulesCouverts(profs, modules1ere));

        System.out.println("L'école a engagé les professeurs suivants");

        for (int i = 0; i < profs.length; i++) {

            System.out.println("- " + profs + " peut enseigner les modules : ");

            for (int j = 0; j < modules1ere.length; j++) {
                System.out.println(" " + module.getNom());// !!!!!!!!!!!!!!!!!! A CONTROLER UMUT !!!!!!!!!!!!!!!!!!!!!!

            }
            System.out.println("");
        }

        System.out.println("\n Il est temps de préparer l'horaire. \n");

        boolean succes = horaire.planifier(modules1ere, profs);

        if (succes) {
            System.out.println("Modules planifiés avec succès !");
            horaire.afficherHoraire();
        } else {
            System.out.println("Problème de planification !");
        }

    }

}
