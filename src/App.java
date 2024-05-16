import java.util.Scanner;

import core.Services;
import entities.Classe;
import entities.Cours;
import entities.Professeur;
import entities.Session;
import services.CoursService;
import services.ProfesseurService;
import views.CoursView;
import views.ProfesseurView;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ProfesseurView professeurView = new ProfesseurView();
        CoursView coursView = new CoursView();
        Services<Professeur> professeurService = new ProfesseurService();
        Services<Cours> coursService = new CoursService();

        professeurView.setScanner(scanner);
        coursView.setScanner(scanner);
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1 -> {
                    Professeur professeur = professeurView.saisi();
                    professeurService.add(professeur);
                }
                case 2 -> {
                    professeurView.affiche(professeurService.show());
                }
                case 3 -> {
                    Cours cours = coursView.saisi();
                    String nom;
                    int rep;
                    do {
                        System.out.print("Quel est le Nom du Professeur du Cours?: ");
                        nom = scanner.nextLine();
                        Professeur professeur = professeurService.getBy(nom);
                        if (professeur == null) {
                            System.out.println("Professeur inexistant!!!");
                        } else {
                            // professeur => Cours
                            professeur.add(cours);
                            // Cours => Profeseur
                            cours.setProfesseur(professeur);
                        }
                        rep = continuer();
                    } while (rep != 2);
                    Session session = new Session();
                    System.out.println("Heure de Debut de la Seance [HH:mm] ?:");
                    session.setHeureDebut(CoursView.formatHeure(scanner.nextLine()));
                    System.out.println("Heure de Fin de la Seance [HH:mm] ?:");
                    session.setHeureFin(CoursView.formatHeure(scanner.nextLine()));
                    // Cours => Session
                    cours.add(session);
                    // Session => Cours
                    session.setCours(cours);
                    // Ajout du cours
                    coursService.add(cours);
                }
                case 4 -> {
                    coursView.affiche(coursService.show());
                }
                case 5 -> {
                    String nom;
                    System.out.print("Quel est le Nom du Professeur?: ");
                    nom = scanner.nextLine();
                    Professeur professeur = professeurService.getBy(nom);
                    if (professeur != null) {
                        for (Cours cours : professeur.getCours()) {
                            System.out.println("[Professeur = " + cours.getModule() + " " + cours.getSessions() +"]");
                        }
                    } else {
                        System.out.println("Professeur inexistant!!!");
                    }
                }
            }
        } while (choice != 6);

    }

    public static int menu() {
        int choix;
        System.out.println("1. Ajouter un Professeur");
        System.out.println("2. Lister les Professeurs");
        System.out.println("3. Créer un cours");
        System.out.println("4. Lister tous les cours");
        System.out.println("5. Lister les les cours d’un professeur");
        System.out.println("6. Quitter");
        System.out.print("Votre choix : ");
        choix = scanner.nextInt();
        scanner.nextLine();
        return choix;
    }

    public static int continuer() {
        int rep;
        do {
            System.out.println("1-Oui");
            System.out.println("2-Non");
            System.out.println("Voulez Ajoutez un autre Professeur ?: ");
            rep = scanner.nextInt();
        } while (rep != 1 && rep != 2);
        scanner.nextLine();
        return rep;
    }
}
