import java.util.Scanner;

public class NumericalValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
            System.out.print("Entrez un nombre : ");
            String input = scanner.nextLine();
            try {
                float number = Float.parseFloat(input);
                System.out.println("Le nombre entré est : " + number);
            } catch (NumberFormatException e) {
                throw new TypeMismatchError("Erreur : entrée non numérique !");
            }
        }
    }


class TypeMismatchError extends RuntimeException {
    public TypeMismatchError(String errorMessage) {
        super(errorMessage);
    }
}
