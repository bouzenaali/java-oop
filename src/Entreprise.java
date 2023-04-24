public class Entreprise {
    String nom;
    int nbr_employer;

    Employer[] tabEmployers = null;

    Entreprise(String nom, int nbr_employer){
        this.nom = nom;
        this.tabEmployers = new Employer[nbr_employer];
    }
    
    // afficher tout les employees
    void afficher(){
        System.out.println("les employees: ");
        for (int i=0; i < tabEmployers.length ; i++){
            if (tabEmployers[i] != null) {
                System.out.println("              " + tabEmployers[i].nom);
            }
        }
    }

    // suprimer un employe
    void suprimer(Employer j){
        for (int i=0 ; i < tabEmployers.length ; i++)
            if (tabEmployers[i] == j){
                tabEmployers[i] = null;
            }
    }

    // ajouter un employe
    void ajouter(Employer j){
        for (int i=0; i< tabEmployers.length ; i++){
            if (tabEmployers[i] == null){
                tabEmployers[i] = j;
                break;
            }
        }
        
    }

    // chercher un employe par id 
    void chercher(int id){
        for (int i=0 ; i < tabEmployers.length ; i++){
            if (tabEmployers[i] != null){
                if (tabEmployers[i].id == id){
                    System.out.println("vous chercher: " + tabEmployers[i].nom);
                }
        }}
    }



    public static void main(String[] args) throws Exception {

        // Test 
        Employer a = new Employer("ali",0);
        Employer b = new Employer("celia",1);
        Employer c = new Employer("meriem",2);
        Employer d = new Employer("liticia",3);

        Entreprise inc = new Entreprise("ali",10);
        

        inc.ajouter(a);
        inc.ajouter(b);
        inc.ajouter(c);
        inc.ajouter(d);

        inc.afficher();
        System.out.println("---------------------------------");
        inc.chercher(3);
        System.out.println("---------------------------------");
        inc.suprimer(b);
        inc.afficher();
    }
}
