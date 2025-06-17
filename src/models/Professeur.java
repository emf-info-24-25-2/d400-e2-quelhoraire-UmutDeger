package models;

import java.util.Arrays;

public class Professeur {

    // Attributs

    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    // Constructeur

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.modulesEnseignes = new ModuleInfo[0];
    }

    // Méthodes

    public boolean enseigneCeModule(String nomDuModule) {
        boolean moduleEnseigne = false;
        if (nomDuModule != null) {
            for (int i = 0; i < modulesEnseignes.length; i++) {
                if (modulesEnseignes[i].getNom() == nomDuModule) {
                    moduleEnseigne = true;
                }
            }

        }
        return moduleEnseigne;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {

        if (module != null) {

            ModuleInfo[] nouveauTableau = new ModuleInfo[modulesEnseignes.length + 1];

            for (int i = 0; i < modulesEnseignes.length; i++) {
                nouveauTableau[i] = modulesEnseignes[i];
            }
            nouveauTableau[modulesEnseignes.length] = module;

            modulesEnseignes = nouveauTableau;
        }
    }

    public void viderModules() {
        for (int i = 0; i < modulesEnseignes.length; i++) {
            modulesEnseignes[i] = null;

        }

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        return "Professeur prenom=" + nom + ", [nom=" + prenom.toUpperCase() + "]";
    }

}
