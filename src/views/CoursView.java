package views;

import entities.Cours;
import entities.Professeur;

public class CoursView extends ViewImp<Cours> {

    @Override
    public Cours saisi() {
        Cours cour = new Cours();
        System.out.println("Entrer le module du Cours");
        cour.setModule(scanner.nextLine());
        return cour;
    }
    
}
