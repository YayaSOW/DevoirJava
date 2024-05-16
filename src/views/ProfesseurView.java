package views;

import entities.Professeur;

public class ProfesseurView extends ViewImp<Professeur> {

    @Override
    public Professeur saisi() {
        Professeur professeur = new Professeur();
        System.out.println("Entrer le nomComplet du prof:");
        professeur.setNomComplet(scanner.nextLine());
        return professeur;
    }
    
}
