package Bankomat;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * start
 */

public class start {

    public static void main(String[] args) {
        auther auther = new auther();
        auther.CheckCard();
        auther.CheckPin();
        Select();

    }

    static void Select() {
        try {
            addcash addcash = new addcash();
            Scanner scanner = new Scanner(System.in);
            System.out.println(menu());
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    addcash.AddMoney();
                    break;
                case 2:
                    addcash.Getmoney();
                    break;
                case 3:
                    addcash.display();
                    break;
                default:
                    System.out.println("Неправильное значение!");
                    Select();
                    break;
            }
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Неправильное значение! Попробуйте заново!");
            Select();
        } catch (NoSuchElementException e) {
            System.out.println("Вы ничего не выбрали! Попробуйте заново!");
            Select();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }

    static String menu() {
        String manu = "Выберите действие: \n1. Пополнить баланс\n" +
                "2. Снять наличные\n3. Посмотреть счёт";
        return manu;
    }
}
