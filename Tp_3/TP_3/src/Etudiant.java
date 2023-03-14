public class Etudiant extends Personne {

    int Matricule;
    int[] notes;
    float moyenne;
    


    public Etudiant(String pNom, String pPrenom, int pAge, int pMatricule, int[] pNotes, float pMoyenne) {
        super(pNom, pPrenom, pAge);
        this.Matricule = pMatricule;
        this.notes = pNotes;
        this.moyenne = pMoyenne;
        
    }

    public double calculateAverage(int[] notes) {
        int sum = 0;

        for (int i = 0; i < notes.length; i++) {
            sum += notes[i];
        }

        double average = (double) sum / notes.length;
        
        return average;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println(Matricule);
        System.out.println(notes);
        System.out.println(moyenne);
    }

    public void afficherType() {
        System.out.println("Etudiant");
    }


    public static void main(String[] args) {
        int[] n={12,13,14,15,15};

        Etudiant e = new Etudiant("ali", "bouzena", 14, 1351, n, 12);
        double moy = e.calculateAverage(n);
        System.out.println(moy);
    }

    
}
