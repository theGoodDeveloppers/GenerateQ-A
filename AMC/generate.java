package AMC;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class generate { 
    public static void main(String[] args) {
        System.out.println("# AMC-TXT source \n");
        
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("questions.txt");
            writer.write("# AMC-TXT source \n");
             writer.write("Lang: FR \n");
            System.out.print("Entrez le titre du questionnaire : ");
            String titre = scanner.nextLine();
            writer.write("Title: " + titre + "\n\n");

           
           

            while (true) {
                System.out.print("Entrez la question (ou 'exit' pour quitter) : ");
                String question = scanner.nextLine();

                if (question.equals("exit")) {
                    break;
                }

                writer.write("* " + question + "\n");

                while (true) {
                    System.out.print("Entrez une réponse (ou 'done' pour finir) : ");
                    String reponse = scanner.nextLine();

                    if (reponse.equals("done")) {
                        break;
                    }

                    System.out.print("Est-ce la réponse correcte ? (oui/non) : ");
                    String isCorrect = scanner.nextLine();
                    if (isCorrect.equalsIgnoreCase("oui")) {
                        writer.write("+ " + reponse + "\n");
                        
                    } else {
                        writer.write("- " + reponse + "\n");
                      
                    }
                   
                }
            }
            
            writer.close();

            System.out.println("Les questions ont été enregistrées dans 'questions.txt'.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

        
