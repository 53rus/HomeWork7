public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int total = 0;
        int pay = 15000;
        int i = 0;
        while (total < 2459000){
            i++;
            total = total + total / 100;
            total = total + pay;
            System.out.println("Месяц " + i + " накопления " + total);
        }
        System.out.println("Что бы накопить " + total + " потребует " + i + " месяцев");
        System.out.println("Task2");
        i = 0;
        while (i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a-- ){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Task3");
        int population = 12000000;
        int birthRate =  17;
        int deathRate =  8;
        int grownPopulation = birthRate - deathRate;
        for (int year = 0; year <= 10; year++){
            population = population / 1000 * grownPopulation + population;
            System.out.println("Год "+ year + ", численность населения составляет " + population + " человек");
        }
        System.out.println("Task4");
        int sumContribution = 15000;
        int percentages = 7;
        int mounth = 0;
        while (sumContribution < 12000000) {
            mounth = mounth + 1;
            sumContribution = sumContribution + sumContribution * 7 / 100;
            System.out.println("Месяц " + mounth + " накоплено " + sumContribution);
        }
        System.out.println("Task5");
        sumContribution = 15000;
        percentages = 7;
        mounth = 0;
        while (sumContribution < 12000000) {
            mounth = mounth + 1;
            sumContribution = sumContribution + sumContribution * 7 / 100;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " накоплено " + sumContribution);
            }
        }
        System.out.println("Task6");
        sumContribution = 15000;
        percentages = 7;
        mounth = 0;
        for (int a = 0; a <= 108; a++){
            mounth = mounth + 1;
            sumContribution = sumContribution + sumContribution * 7 / 100;
            if (mounth % 6 == 0 && mounth <=108) {
                System.out.println("Месяц " + mounth + " накоплено " + sumContribution);
            }
        }
        System.out.println("Task7");
        int dateFriday = 1;
        System.out.println("Сегодня пятница, " + dateFriday + " -е число. Необходимо подготовить отчет.");
        for (int dayNumer = 1; dayNumer <31; dayNumer++){
            dateFriday = dateFriday + 1;
            if (dateFriday <  31 && dayNumer % 7 == 0) {
                System.out.println("Сегодня пятница, " + dateFriday + " -е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println("Task8");
        int currentYear = 2023;
        for (int q = 0; q < currentYear + 100; q =q + 79) {
            if (q > currentYear - 200) {
                System.out.println(q);
            }
        }
    }
}