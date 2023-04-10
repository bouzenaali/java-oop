import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        char operation;
        try {
            System.out.println("Entrez le premier nombre: ");
            a = input.nextInt();
            System.out.println("Entrez le deuxième nombre: ");
            b = input.nextInt();
            System.out.println("Entrez l'opération à effectuer('+','-','*','/'): ");
            operation = input.next().charAt(0);
            
            switch (operation) {
                case '+':
                    System.out.println("Le résultat est: " + (a + b));
                    break;
                case '-':
                    System.out.println("Le résultat est: " + (a - b));
                    break;
                case '*':
                    System.out.println("Le résultat est: " + (a * b));
                    break;
                case '/':
                    if (b == 0 ){
                        throw new ArithmeticException("Division par zéro est impossible");
                    }
                    System.out.println("Le résultat est: " + (a / b));
                    break;
                default:
                    throw new Exception("Opération non supportée");
            }
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
