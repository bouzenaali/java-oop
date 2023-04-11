import java.util.Scanner;

public class Calculatrice {

    float sum(float a, float b) {
        return a + b;
    }

    float substract(float a, float b) {
        return a - b;
    }

    float multiply(float a, float b) {
        return a * b;
    }

    float divide(float a, float b) {
            if (b == 0 )
                throw new ArithmeticException("Division par zéro est impossible");
            else
                 return a / b;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float a, b;
            char operation;
            try {
                System.out.println("Entrez le premier nombre: ");
                a = input.nextFloat();
                System.out.println("Entrez le deuxième nombre: ");
                b = input.nextFloat();
                System.out.println("Entrez l'opération à effectuer('+','-','*','/'): ");
                operation = input.next().charAt(0);
                
                Calculatrice calc = new Calculatrice();
                switch (operation) {
                    case '+':
                        System.out.println("Le résultat est: " + calc.sum(a, b));
                        break;
                    case '-':
                        System.out.println("Le résultat est: " + calc.substract(a, b));
                        break;
                    case '*':
                        System.out.println("Le résultat est: " + calc.multiply(a, b));
                        break;
                    case '/':
                        System.out.println("Le résultat est: " + calc.divide(a, b));
                        break;
                    default:
                        throw new Exception("Opération non supportée");
                }
            } catch (Exception e) {
                System.out.println("Erreur: " + e.getMessage());
            }
        }
    }
}

//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             int a, b;
//             char operation;
//             try {
//                 System.out.println("Entrez le premier nombre: ");
//                 a = input.nextInt();
//                 System.out.println("Entrez le deuxième nombre: ");
//                 b = input.nextInt();
//                 System.out.println("Entrez l'opération à effectuer('+','-','*','/'): ");
//                 operation = input.next().charAt(0);
                
//                 switch (operation) {
//                     case '+':
//                         System.out.println("Le résultat est: " + (a + b));
//                         break;
//                     case '-':
//                         System.out.println("Le résultat est: " + (a - b));
//                         break;
//                     case '*':
//                         System.out.println("Le résultat est: " + (a * b));
//                         break;
//                     case '/':
//                         if (b == 0 ){
//                             throw new ArithmeticException("Division par zéro est impossible");
//                         }
//                         System.out.println("Le résultat est: " + (a / b));
//                         break;
//                     default:
//                         throw new Exception("Opération non supportée");
//                 }
//             } catch (Exception e) {
//                 System.out.println("Erreur: " + e.getMessage());
//             }
//         }
//     }
// }
