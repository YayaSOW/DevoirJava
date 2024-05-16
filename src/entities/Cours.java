package entities;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    private int id;
    private String module;
    private Professeur professeur;
    private static int nbCours;

    //Attribut navigable
    //OneToMany (Cour => Seance)
    private List<Session> sessions = new ArrayList<>();
    //ManyToMany (Cour => Classe)
    private List<Classe> classes = new ArrayList<>();
    public Cours(String module) {
        this.id = ++nbCours;
        this.module = module;
    }
    public Cours() {
        id = ++nbCours;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModule() {
        return module;
    }
    public void setModule(String module) {
        this.module = module;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    public List<Session> getSessions() {
        return sessions;
    }
    public void add(Session session) {
        this.sessions.add(session);
    }
    public List<Classe> getClasses() {
        return classes;
    }
    public void add(Classe classe) {
        this.classes.add(classe);
    }
    @Override
    public String toString() {
        return "Cours [id=" + id + ", module=" + module + ", professeur=" + professeur + "]";
    }
}
