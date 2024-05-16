package services;

import java.util.ArrayList;
import java.util.List;

import core.Services;
import entities.Professeur;

public class ProfesseurService implements Services<Professeur> {
    List<Professeur> professeurs = new ArrayList<>();

    @Override
    public boolean add(Professeur professeur) {
        return professeurs.add(professeur);
    }

    @Override
    public List<Professeur> show() {
        return professeurs;
    }

    @Override
    public Professeur getBy(String critere) {
        for (Professeur professeur : professeurs) {
            if (professeur.getNomComplet().compareToIgnoreCase(critere) == 0) {
                return professeur;
            }
        }
        return null;
    }

}
