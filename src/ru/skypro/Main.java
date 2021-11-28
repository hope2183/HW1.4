package ru.skypro;

public class Main {

    public static <string> void main(String[] args) {
	// TASK 1
        int start = 1;
        while (start<=10){
            System.out.print(start+" ");
            start++;
        }
        System.out.println();

        for (start=10; start>0; start--) {
            System.out.print(start+" ");
        }
        System.out.println();

    //TASK 2

        for(int firstFriday = 6; firstFriday<=31;firstFriday+=7) {
            System.out.println("Пятница, " + firstFriday + " число! Сдать отчет!!!");
        }

    //TASK 3

        int currentYear = 2021;
        int startYear = currentYear-200;
        int endYear = currentYear+100;

        for(currentYear=startYear; currentYear<=endYear; currentYear++){

            if (currentYear%79==0){
                System.out.println(currentYear);
            }

        }

    }
}
