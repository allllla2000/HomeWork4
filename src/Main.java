public class Main {
    public static void main(String[] args) {
        //задание 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int j = 10;
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        //задание 2
        int dayNumber = 5;
        for (; dayNumber <= 31; dayNumber += 7) {
            System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
        //задание 3
        int currentYear = 2022;
        int yearPast = currentYear - 200;
        int yearFuture = currentYear + 100;
        for (int year = yearPast; year <= yearFuture; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}


