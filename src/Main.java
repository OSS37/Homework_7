public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int money = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month = month + 1;
            total = total + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + "рублей");
        }
        int year = month/12;
        int moths=month%12;
        System.out.println("Итого потребуется " + year +" лет "+ " и " + moths + " месяцев");


        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i+" ");
        }
        System.out.println();
        for (int j=10; j>=1; j--) {
            System.out.print(j+" ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int years = 0;
        while (years<10) {
            populationY=(populationY+populationY/1000*(fertility-mortality));
            years++;
            System.out.println("Год: " + years + ". Численность населения составляет: " + populationY);
        }
        System.out.println();

        int populationY2 = 12_000_000;
        int fertility2 = 17;
        int mortality2 = 8;
        for ( int year2 = 1;year2<=10; year2++) {
            populationY2=(populationY2+populationY2/1000*(fertility2-mortality2));
            System.out.println("Год: " + year2 + ". Численность населения составляет: " + populationY2);
        }

        System.out.println("Задача 4");
        int bankDeposit = 15_000;
        int monthDeposit = 0;
        int rate = 7;
        while (bankDeposit<12_000_000) {
            monthDeposit++;
            bankDeposit = bankDeposit + (bankDeposit*rate/100);
            System.out.println ("Месяц: " + monthDeposit + ", сумма накоплений равна: " + bankDeposit);
        }

        int yearDeposit = monthDeposit/12;
        int mothsDeposit=monthDeposit%12;
        System.out.println("Итого потребуется " + yearDeposit +" лет "+ " и " + mothsDeposit + " месяцев");

        System.out.println("Задача 5");
        int bankDeposit2 = 15_000;
        int monthDeposit2 = 0;
        int rate2 = 7;
        while (bankDeposit2<12_000_000) {
            monthDeposit2++;
            bankDeposit2 = bankDeposit2 + (bankDeposit2*rate2/100);
            if (monthDeposit2%6==0) {
                System.out.println("Месяц: " + monthDeposit2 + ", сумма накоплений равна: " + bankDeposit2);
            }
        }

        int yearDeposit2 = monthDeposit2/12;
        int mothsDeposit2=monthDeposit2%12;
        System.out.println("Итого потребуется " + yearDeposit2 +" лет "+ " и " + mothsDeposit2 + " месяцев");

        System.out.println("Задача 6");
        int contribution = 15_000;
        int monthV = 0;
        int bet = 7;
        while (monthV<108) {
            monthV++;
            contribution = contribution+(contribution*bet/100);
            if (monthV%6==0) {
                System.out.println("Месяц: " + monthV + ", сумма накоплений равна: " + contribution);
            }
        }

        System.out.println("Задача 7");
        int friday = 6;
        while (friday<31) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday=friday+7;
        }

        System.out.println("Задача 8");
        int nowYear=2023;
        int preYear=nowYear-200;
        int upYear=nowYear+100;
        while (preYear<upYear) {
            preYear++;
            if (preYear%79==0) {
                System.out.println(preYear);
            }
        }
    }
}