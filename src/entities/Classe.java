package entities;

import java.util.ArrayList;
import java.util.List;

public class Classe {
        private int id;
    private String nomClasse;
    private String filiere;
    private String niveau;
    private static int nbClasse;

    //Attribut navigable
    //ManyToMany (Classe => Cour)
    private List<Cours> cours = new ArrayList<>();

    public Classe(String nomClasse, String filiere, String niveau) {
        this.id = ++nbClasse;
        this.nomClasse = nomClasse;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    public Classe() {
        this.id = ++nbClasse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(Cours cour) {
        this.cours.add(cour);
    }

    @Override
    public String toString() {
        return "Classe [id=" + id + ", nomClasse=" + nomClasse + ", filiere=" + filiere + ", niveau=" + niveau
                + ", cours=" + cours + "]";
    }
}
