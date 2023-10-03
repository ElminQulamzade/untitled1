package Lesson_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked {
    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.println(first / second);}
        catch (ArithmeticException  e){
            System.out.println(e.getMessage());
        }
        }
    }
