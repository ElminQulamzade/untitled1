package Lesson_17;


 import java.util.Scanner;

    public class QuizGame {
        public static void main(String[] args) {
            String[] questions = {
                    "Sual 1",
                    "Sual 2",
                    "Sual 3"
            };

            Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    System.out.print("Cavablamaq istediyiniz sualin nomresin secin (0 to " + (questions.length - 1) + "): ");
                    int questionNumber = Integer.parseInt(scanner.nextLine());

                    if (questionNumber < 0 || questionNumber >= questions.length) {
                        throw new ArrayIndexOutOfBoundsException();
                    }

                    System.out.println("Sual: " + questions[questionNumber]);
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: daxil etdiyiniz eded araliginda sual yoxdu");
                } catch (NumberFormatException e) {
                    System.out.println("Error: zehmet olmasa eded daxil edin");
                }
            }

            scanner.close();
        }
    }

