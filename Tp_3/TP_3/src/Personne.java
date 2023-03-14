public abstract class Personne /*implements Comparable<Personne>, Iterable<Personne>*/ {

//attribues
    String nom,prenom;
    int age;

//constructeur
    public Personne(String pNom,String pPrenom, int pAge){
        this.nom = pNom;
        this.prenom = pPrenom;
        this.age = pAge;
    }

//methodes
    public void afficher(){
        System.out.println("name " + nom);
        System.out.println("prenom " + prenom);
        System.out.println("age " + age);
    }

    public abstract void afficherType();


    public static void main(String[] args) {
        // Personne p = new Personne("ali", "bouzena", 10);
        // p.afficher();
    }
    
}

