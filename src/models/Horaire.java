package models;

public class Horaire {

    // Attributs
    public static final int NBRE_DE_BLOCS = 6;
    private Bloc[] blocs;

    // Constructeur

    public Horaire() {
        this.blocs = new Bloc[NBRE_DE_BLOCS];

    }

    // Méthodes

    public boolean planifier(ModuleInfo[] modules, Professeur[] profs) {
        boolean planificationReussi = false;
        if (modules != null && profs != null) {
            for (int i = 0; i < modules.length; i++) {
                for (int j = 0; j < profs.length; j++) {
                    if (profs[j].enseigneCeModule(modules[i].getNom())) {

                    }
                }
            }
        }
        return planificationReussi;

    }

    public void afficherHoraire() {

    }

    public Bloc moduleDansQuelBloc(ModuleInfo[] module) {
        return;
    }

}
