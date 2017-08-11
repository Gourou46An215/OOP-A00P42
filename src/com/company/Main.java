package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char charList[] = {'+', '-'};
        boolean flag = true;

        while (flag) {
            System.out.print("Please enter the height of the figure :");
            int n = reader.nextInt();
            System.out.print("\n");
            if (n % 2 != 1) {
                System.out.println("Please, enter a pair number !");
            }

            else {
                flag=false;
                for (int count = 0; count < n; count++) {
                    if (count < n / 2 + 1) {
                        for (int i = 0; i <= count; i++) {
                            System.out.print(charList[count % charList.length]);
                        }
                    } else {
                        for (int i = 0; i < (n / 2 + 1); i++) {
                            if (i < count - (n / 2)) {
                                System.out.print(" ");
                            } else {
                                System.out.print(charList[count % charList.length]);
                            }
                        }
                    }

                    System.out.print("\n");
                }
            }
        }
    }
}