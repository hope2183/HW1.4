package ru.skypro;

public class Main {

    public static <string> void main(String[] args) {
        // TASK 1
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println();

        for (start = 10; start > 0; start--) {
            System.out.print(start + " ");
        }
        System.out.println();

        //TASK 2

        for (int firstFriday = 6; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Пятница, " + firstFriday + " число! Сдать отчет!!!");
        }

        //TASK 3

        int currentYear = 2021;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (currentYear = startYear; currentYear <= endYear; currentYear++) {

            if (currentYear % 79 == 0) {
                System.out.println(currentYear);
            }

        }
        //STAR TASK 4

        for (start = 1; start <= 30; start++) {
//
            if (start % 3 == 0 && start % 5 == 0) {
                System.out.println(start + ": ping pong");
            }else if (start%3==0){
                System.out.println(start+": ping");
            }else if (start%5==0){
                System.out.println(start+": pong");
            } else
                System.out.println(start + ": ");
        }

        //START TASK 5 // погуглила, чуть изменила

        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for (int i=3; i <=10; i++) {
           int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();







    }
}
