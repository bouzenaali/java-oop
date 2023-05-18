// Exo 1
import java.util.ArrayList;

public class Malady {
    private String name;
    private ArrayList<String> symptoms;

    public Malady(String name) {
        this.name = name;
        this.symptoms = new ArrayList<String>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getSymptoms() {
        return this.symptoms;
    }

    public void addSymptom(String symptom) {
        this.symptoms.add(symptom);
    }

    public void removeSymptom(String symptom){
        this.symptoms.remove(symptom);
    }


    public static class BasicTreatment{
        private static final String[] basicTreatment = {"rest", "drink water", "take medicine"};

        public static String[] getBasicTreatment(){
            return basicTreatment;
        }
    }

    public class PersonelizedTreatment{
        private String[] treatments;

        public PersonelizedTreatment(String[] treatments){
            this.treatments = treatments;
        }

        public String[] getTreatments(){
            return this.treatments;
        }
    }

    
    public static void main(String[] args) throws Exception {
        Malady flu = new Malady("flu");
        flu.addSymptom("cough");
        flu.addSymptom("fever");
        flu.addSymptom("headache");
        flu.addSymptom("sore throat");

        // methode 1
        ArrayList<String> Symptoms = flu.getSymptoms();
        System.out.println("malady: " + flu.getName());
        for (String symptom : Symptoms){
            System.out.println("    Symptom: " + symptom);
        }

        // methode 2 (chatGPT)
        // flu.getSymptoms().forEach((symptom) -> {
        //     System.out.println(symptom);
        // });

        String[] treatment = new String[]{"rest", "drink water", "take medicine"};
        Malady.BasicTreatment Btreatement = new Malady.BasicTreatment();
        Malady.PersonelizedTreatment Ptreatement = flu.new PersonelizedTreatment(treatment);

        Malady.BasicTreatment.getBasicTreatment();
        Ptreatement.getTreatments();
    }
}
