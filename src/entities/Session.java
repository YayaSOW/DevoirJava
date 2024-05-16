package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Session {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String salle;

    private static int nbSession;
        //Attribut navigable
    //ManyToOne (Seance => Cour)
    private Cours cours;
    public Session(LocalTime heureDebut, LocalTime heureFin) {
        this.id = ++nbSession;
        this.date = LocalDate.now();
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public Session() {
        id = ++nbSession;
        this.date = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Seance [id=" + id + ", date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin
                +", cours=" + cours + "]";
    }

}
