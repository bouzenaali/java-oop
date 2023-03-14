public class Enseignant extends Personne {

    //attribues
    int nbHeuresCours;
    String module;


    //constructeur
    public Enseignant(String pNom, String pPrenom, int pAge, int pNbHeuresCours, String pModule ) {
        super(pNom, pPrenom, pAge);
        this.nbHeuresCours = pNbHeuresCours;
        this.module = pModule;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println(nbHeuresCours);
        System.out.println(module);
    }

    public void afficherType(){
        System.out.println("Enseignant");
    }



    public static void main(String[] args) {
        Enseignant a = new Enseignant("null", "null", 10, 13, "null");
       
    }
    
}
