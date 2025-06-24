package models;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

import javax.swing.text.DateFormatter;

public class Bloc {

    // Attributs

    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;
    private String nom;
    private ModuleInfo[] modules;

    // Constructeur

    public Bloc(String nom) {
        this.nom = nom;
        this.modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINE];
        modules[0] = new ModuleInfo("Matu");
        modules[1] = new ModuleInfo("Matu");
        modules[2] = new ModuleInfo("Matu");
        modules[3] = new ModuleInfo("Matu");
    }

    // Méthodes

    public boolean planifierModule(ModuleInfo module) {
        boolean modulePlanifier = false;

        return modulePlanifier;
    }

    public void afficherHoraire() {
        DateFormatter dfs = new DateFormatter(dd / MM / yyyy / h / m);

    }

    public boolean estTotalementPlanifie() {
        boolean planifie = true;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                planifie = false;
                break;
            }
        }
        return planifie;

    }

    public boolean contientModule(ModuleInfo module) {
        boolean estLa = false;

        for (int i = 0; i < modules.length; i++) {
            if (modules[i].equals(module)) {
                estLa = true;
                break;
            }
        }
        return estLa;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Bloc [nom=" + nom + "]";
    }

}
