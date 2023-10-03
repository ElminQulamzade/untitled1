package Lesson_13;

import java.util.Scanner;

public class AdventureGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName;

        System.out.println("Salam! Macera oyununa xoş geldiniz.");
        System.out.print("Zehmet olmasa oyuncu adınızı girin: ");
        playerName = scanner.nextLine();

        System.out.println(playerName + ", oyun başlayır!");
        System.out.println("Meşede itmisiniz, hansı terefe gedersiz? Şerq yoxsa qerb?");

        String choice;
        while (true) {
            System.out.print("Şerqe getmek üçün 'Ş', Qerbe getmek üçün 'Q' seçin: ");
            choice = scanner.nextLine();

            if (choice.equals("Ş")) {
                System.out.println("Şerqe teref gedirsiz.");
                System.out.println("Bir ayı ile qarşılaşdız: qaçarsızsa 'Qaçaram' yoxsa sakitcə yanından keçersize 'Yanından keçerem' seçin");
                String bearChoice = scanner.nextLine();
                if (bearChoice.equalsIgnoreCase("Qaçaram")) {
                    System.out.println("Ayı sizi qatalayıb öldürdü.");
                    break;
                } else if (bearChoice.equals("Yanından keçerem")) {
                    System.out.println("Ayı sizi görmədi və yolunuza davam etdiniz.");
                    break;
                } else {
                    System.out.println("Sehv secim etdiniz. Yeniden cehd edin.");
                }
            } else if (choice.equals("Q")) {
                System.out.println("Qerbe teref gedirsiz.");
                System.out.println("Bir ev gordünüz. İçərisinə girərsiniz? 'He' 'Yox' ");
                String comeChoice = scanner.nextLine();
                if (comeChoice.equals("He")) {
                    System.out.println("Içerideki insanlar sizi öldürdü");
                    break;
                } else if (comeChoice.equals("Yox")) {
                    System.out.println("Yolunuza davam edib oyunu bitirdiniz");
                    break;
                } else {
                    System.out.println("Sehv secim etdiniz. Yeniden cehd edin.");
                }

            } else {
                System.out.println("Sehv secim etdiniz. Yeniden cehd edin.");
            }
        }

        System.out.println("Oyunu tamamladınız. Teşekkür edirik, " + playerName + "!");
        scanner.close();
    }
}
