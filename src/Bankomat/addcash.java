package Bankomat;

import java.util.Scanner;

public class addcash extends cash {
    Scanner scanner = new Scanner(System.in);
    private int a;

    public void AddMoney() {
        System.out.print("Введите сумму: ");
        a = scanner.nextInt();
        setSumma(getSumma() + a);
        display();
    }

    public void Getmoney() {
        System.out.print("Введите сумму: ");
        a = scanner.nextInt();
        if (getSumma() >= a) {
            setSumma(getSumma() - a);
            display();
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void display() {
        System.out.printf("Баланс карты: %d рублей.\n", getSumma());
    }
}
