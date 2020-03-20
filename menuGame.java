package MenuGame;

import java.util.Scanner;

public class menuGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Selection = -1;
        while (Selection != 0) {
            System.out.println("menu");
            System.out.println("1. Draw the triangle top left");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Draw the triangle BotTon-left");
            System.out.println("5. Draw the triangle BotTon-right");
            System.out.println("6. Draw the triangle top right");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            Selection = scanner.nextInt();

            switch (Selection) {
                case 1: {
                    System.out.println("Draw the triangle top left");
                    for (int i = 7; i > 0; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Draw the square");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");

                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Draw the triangle BotTon-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Draw the triangle BotTon-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print("   ");
                            } else {
                                System.out.print("*  ");

                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 6: {
                    System.out.println("Draw the triangle top right");
                    for (int i = 0; i <= 5; i++){
                        for(int j = 0; j <= i; j++){
                            System.out.print(" ");
                        }
                        for(int j = 0; j <= 5 - i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                }
                break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Enter lai di ban oi !!!");
            }
        }
    }
}