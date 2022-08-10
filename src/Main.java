public class Main {

    public static void task6() {
        System.out.println("Задача 6");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = result * (-1);
        System.out.println("Результат: " + result);
        System.out.println(" ");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int a = 5;
        int b = 7;
        a = b - a;
        b = b - a;
        a = b + a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(" ");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int a = 185;
        int b = a % 100 / 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        // Задача 1

        System.out.println("Задача 1");
        byte by = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        float fl = 1f;
        double dou = 1;
        char ch = '1';
        boolean bo = true;
        System.out.println("by = " + by);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("fl = " + fl);
        System.out.println("dou = " + dou);
        System.out.println("ch = " + ch);
        System.out.println("bo = " + bo);
        System.out.println(" ");

        // Задача 2

        System.out.println("Задача 2");
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float sumWeight = weight1 + weight2;
        System.out.println("Общий вес двух бойцов - " + sumWeight + " кг");
        float differenceWeight = weight2 - weight1;
        System.out.println("Разница между весами бойцов - " + differenceWeight + " кг");
        System.out.println( );

        // Задача 3

        System.out.println("Задача 3");
        int massBanana = 80;
        int counterBanana = 5;
        float massMilk = 105f / 100f;
        int volumeMilk = 200;
        int massIceCream = 100;
        int counterIceCream = 2;
        int massEgg = 70;
        int counterEgg = 4;
        float finalMass = massBanana * counterBanana + massMilk * volumeMilk + massIceCream * counterIceCream + massEgg * counterEgg;
        System.out.println("Вес спорт-завтрака в граммах - " + finalMass);
        finalMass = finalMass / 1000;
        System.out.println("Вес спорт-завтрака в килограммах - " + finalMass);
        System.out.println(" ");

        //Задача 4

        System.out.println("Задача 4");
        int overWeight = 7*1000;
        int minWeightLoss = 250;
        int maxWeightLoss = 500;
        int time1 = overWeight / minWeightLoss;
        int time2 = overWeight / maxWeightLoss;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то он похудеет за " + time1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то он похудеет за " + time2 + " дней");
        int averageTime = (time1 + time2) / 2;
        System.out.println("Среднее количество дней на похудение: " + averageTime);
        System.out.println(" ");

        // Задача 5

        System.out.println("Задача 5");
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int CristineSalary = 76230;
        int MashaAnnualSalary = MashaSalary * 12;
        int DenisAnnualSalary = DenisSalary * 12;
        int CristineAnnualSalary = CristineSalary * 12;
        int MashaNewSalary = MashaSalary + MashaSalary/10;
        int DenisNewSalary = DenisSalary + DenisSalary/10;
        int CristineNewSalary = CristineSalary + CristineSalary/10;
        int MashaNewAnnualSalary = MashaNewSalary * 12;
        int DenisNewAnnualSalary = DenisNewSalary * 12;
        int CristineNewAnnualSalary = CristineNewSalary * 12;
        int MashaAnnualSalaryDifference = MashaNewAnnualSalary - MashaAnnualSalary;
        int DenisAnnualSalaryDifference = DenisNewAnnualSalary - DenisAnnualSalary;
        int CristineAnnualSalaryDifference = CristineNewAnnualSalary - CristineAnnualSalary;
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей. Годовой доход вырос на " + MashaAnnualSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей. Годовой доход вырос на " + DenisAnnualSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + CristineNewSalary + " рублей. Годовой доход вырос на " + CristineAnnualSalaryDifference + " рублей.");
        System.out.println(" ");

        task6();
        task7();
        task8();
    }
}