package models;

public class ModuleInfo {

    // Attributs

    private String nom;
    private Professeur professeur;

    // Constructeur
    public ModuleInfo(String nom) {
        this.nom = nom;
        this.professeur = professeur;
    }

    // Méthodes

    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        if (professeur != null) {
            return "ModuleInfo [nom=" + nom + ", getProfesseur()=" + getProfesseur().getNom() + "]";
        } else {
            return "ModuleInfo [nom=" + nom;
        }

    }

}
