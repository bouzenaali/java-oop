// Exo 3
import java.util.ArrayList;

public class TrainManagment {

    public static class Train {
        public static class Rame {
            private int id;
            private int cost;

            public Rame(int id, int cost) {
                this.id = id;
                this.cost = cost;
            }
        }

        ArrayList<Rame> rames;
        // Le nombre de rame ne peux pas dépasser une seuil max.
        private static int maxNbRames = 10;
        public Train(int nbRames) {
            if (nbRames > maxNbRames) {
                System.out.println("Error:" + nbRames + ">" + maxNbRames);
            } else{
                rames = new ArrayList<Rame>(nbRames);
            }
            
        }

        public void addRame(Rame rame) {
            this.rames.add(rame);
        }
        
        // On peut localiser l’endroit d’une rame.
        public int getLocalisation(Rame rame){
            return rames.indexOf(rame);
        }

        // On peut détacher une rame pour la maintenance.
        public void removeRame(int id) {
            for (Rame rame : rames){
                if (rame.id == id){
                    rames.remove(rame);
                } else {
                    System.out.println("Error: Rame not found");
                }
            }
            
        }

        // On peut insérer une rame dans une position spécifique.
        public void insertRame(Rame rame, int position) {
            rames.add(position, rame);
        }

        // On peut Combiner deux séquences de rames.
        public void combineRames(Train train) {
            rames.addAll(train.rames);
        }

        // Les rames doivent être trier selon leur valeur monétaire.
        public void sortRames() {
            rames.sort((Rame r1, Rame r2) -> r1.cost - r2.cost);
        }

        public void tostring(ArrayList<Rame> rames) {
            for (Rame rame : rames) {
                System.out.println("Rame:" + rame.id + " " + rame.cost + "$");
            }
        }
    }


    public static void main(String[] args) {
        Train train1 = new Train(3);
        Train train2 = new Train(3);
        Train.Rame rame1 = new Train.Rame(1, 700);
        Train.Rame rame2 = new Train.Rame(2, 500);
        Train.Rame rame3 = new Train.Rame(3, 100);

        Train.Rame rame4 = new Train.Rame(4, 400);
        Train.Rame rame5 = new Train.Rame(5, 300);
        Train.Rame rame6 = new Train.Rame(6, 300);
        Train.Rame rame7 = new Train.Rame(7, 900);
        


        train1.addRame(rame1);
        train1.addRame(rame2);
        train1.addRame(rame3);

        train2.addRame(rame4);
        train2.addRame(rame5);
        train2.addRame(rame6);

        train1.combineRames(train2);
        train1.tostring(train1.rames);
        System.out.println("    ");
        train1.sortRames();
        train1.tostring(train1.rames);
        System.out.println("    ");
        train1.insertRame(rame7, 0);
        train1.tostring(train1.rames);

        
    }
}
