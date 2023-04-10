import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une date au format JJ/MM/AAAA : ");
        String input = scanner.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate date = LocalDate.parse(input, dateFormatter);
            System.out.println("La date entrée est : " + date);
        } catch (DateTimeException e) {
            System.out.println("Erreur : format de date invalide !");
        }
    }
}


