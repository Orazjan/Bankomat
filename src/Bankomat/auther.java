package Bankomat;

import java.util.Scanner;

public class auther extends cards {
    Scanner scan = new Scanner(System.in);

    public void CheckCard() {
        System.out.print("Введите номер карты: ");
        int nomercard = scan.nextInt();
        cart(nomercard);
        if (getNumbercard() == 0) {
            System.out.println("Карта не найдена!");
            CheckCard();
        }
    }

    public void CheckPin() {
        System.out.print("Введите ПИН-КОД ");
        int pin = scan.nextInt();
        Pincode(pin);
        if (getPincode() == 0) {
            System.out.println("Не правмльный пароль! Повторите попытку: ");
            CheckPin();
        }
    }
}
