import java.util.Scanner;

public class NumericalValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
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
