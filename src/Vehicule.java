public class Vehicule {
    int NivCarb;
    boolean MechPan;

    public void Demarrer(){
        if (NivCarb > 0 && MechPan == false){
            System.out.println("Le véhicule démarre");
        }
        else{
            if (NivCarb == 0){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Niveau carburant est insufisant");
                }
            }
            else{
                throw new MecanicalException("Le véhicule a un problème mécanique");
            }   
        }
    }
    public static void main(String[] args) {
       
    }
}

class MecanicalException extends RuntimeException {
    public MecanicalException(String errorMessage) {
        super(errorMessage);
    }
}