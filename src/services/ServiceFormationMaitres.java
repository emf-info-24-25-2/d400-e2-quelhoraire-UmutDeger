package services;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {

    // Méthodes

    public static void attribuerModules(Professeur[] professeurs, ModuleInfo[] modules) {

        int min = 0;
        int max = modules.length - 1;
        if (professeurs != null && modules != null) {
            for (int i = 0; i < professeurs.length; i++) {
                int indexModuleTire = (int) (Math.random() * (max - min + 1) + min);
                if (professeurs[i].enseigneCeModule(modules[indexModuleTire].getNom())) {
                    professeurs[i].ajouterModuleEnseigne(modules[indexModuleTire]);
                }
            }

        }
    }

    public static boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] modules) {
        boolean tousCouverts = false;
        if (profs != null && modules != null) {
            for (int i = 0; i < profs.length; i++) {
                for (int j = 0; j < modules.length; j++) {
                    if (profs[i].enseigneCeModule(modules[j].getNom())) {
                        break;

                    }
                }

            }
            tousCouverts = true;
        }
        return tousCouverts;
    }

}
