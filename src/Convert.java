import java.util.Scanner;

public class Convert {
    int num = 0;

    Convert(String str) {
        
        for (int i = 0; i < str.length(); i++) {

            while ( str.charAt(i) == ' ' ){
                i++;
            }

            try {
                if (!Character.isDigit(str.charAt(i))) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Erreur : entrée non numérique !");
                System.exit(0);
            }
            num = num * 10 + (str.charAt(i) - '0');
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre : ");
        String str = scanner.nextLine();


        Convert p = new Convert(str);
        System.out.println(p.num);
    }
}


