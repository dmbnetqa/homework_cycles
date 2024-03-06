package ru.netology.homework_cycles.services;

public class calcService {
    public int Calculate(int income, int expenses, int threshold) {

        int months = 0;
        int money = 0;
        int moneyVacation;
        for (int i = 1; i <= 12; i++) {
            if (money >= threshold) {

                System.out.println("Месяц " + i + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем еще -" + (money - expenses) / 3);
                money -= expenses;
                money /= 3;
                months++;

            } else {

                System.out.println("Месяц " + i + ". Денег " + money + ". Придется работать. Заработал +" + income + ", потратил -" + expenses);
                money -= expenses;
                money += income;


            }

        }
        System.out.println(" Количество нерабочих месяцев: " + months);
        return months;
    }
}
