package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void menuMedarbejder() {
        while (true) {
            try {
                System.out.println("\n|Medarbejder menu|");
                System.out.println("------------------------------");
                System.out.println("|1.Vis                       |");
                System.out.println("------------------------------");
                System.out.println("|0.Slut program              |");
                System.out.println("------------------------------");

                Scanner scan = new Scanner(System.in);

                System.out.print("\nTast et nummer: ");
                int input = scan.nextInt();

                if (input == 1) {
                    Menu.menuVis();
                }

                if (input == 0) {
                    System.out.println("\nProgrammet lukker. På gensyn.");
                    System.exit(0);
                }
                if (input > 1 || input < 0) {
                    System.out.println("Det indtastede tal er for højt eller for lavt. Skriv et tal mellem 0-1.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Menuen tager kun imod heltal. Prøv igen.");
            }
        }
    }

    public static void menuVis() {

        System.out.println("\n|Vis menu|");
        System.out.println("----------------------------------");
        System.out.println("|1.Vis Medarbejdere              |");
        System.out.println("|2.Vis Medlemmer                 |");
        System.out.println("|3.Vis Medarbejdere og medlemmer |");
        System.out.println("----------------------------------");
        System.out.println("|4.Tilbage til hovedmenu         |");
        System.out.println("----------------------------------");
        System.out.println("|0.Slut program                  |");
        System.out.println("----------------------------------");

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("\nTast et nummer: ");
            int number = scan.nextInt();
            if (number == 1) {
                Vis.visMedarbejdere();
                menuVis();
            }
            if (number == 2) {
                Vis.visMedlemmer();
                menuVis();
            }
            if (number == 3) {
                Vis.visMedarbejderOgMedlemmer();
                menuVis();
            }
            if (number == 4) {
                StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
                for (StackTraceElement stackTraceElement : stacktrace) {
                    if (stackTraceElement.getMethodName().equals("menuMedarbejder")) {
                        menuMedarbejder();
                    }
                }
            }
            if (number == 0) {
                System.exit(0);
            }
            if (number > 4 || number < 0) {
                System.out.println("\nDet indtastede tal er for højt eller for lavt. Skriv et tal mellem 0-6.");
                menuVis();
            }
        } catch (InputMismatchException e) {
            System.out.println("\nForkert input. Skriv et tal mellem 0-5.");
            menuVis();
        }
    }
}
