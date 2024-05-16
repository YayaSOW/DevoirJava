package entities;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private String nomComplet;
    private List<Cours> cours = new ArrayList<>();
    public Professeur(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public Professeur() {
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public List<Cours> getCours() {
        return cours;
    }
    public void add(Cours cour) {
        this.cours.add(cour);
    }
    @Override
    public String toString() {
        return "Professeur [nomComplet=" + nomComplet + "]";
    }
}
