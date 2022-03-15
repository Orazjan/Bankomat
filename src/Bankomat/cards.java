package Bankomat;

import java.util.ArrayList;

public class cards extends cash {
    int index;
    ArrayList<Integer> CardId = new ArrayList<Integer>();
    ArrayList<Integer> PasswordId = new ArrayList<Integer>();

    public cards() {
        CardId.add(12145);
        CardId.add(25854);
        CardId.add(65458);
        CardId.add(44444);
        PasswordId.add(0000);
        PasswordId.add(1234);
        PasswordId.add(6586);
        PasswordId.add(4444);
    }

    public void cart(int hren) {

        for (int i = 0; i < CardId.size(); i++) {
            if (CardId.get(i) == hren) {
                index = i;
                hren = CardId.get(i);
                setNumbercard(hren);
                Namecart(hren);
            }
        }
    }

    public void Pincode(int hrenishka) {

        if (PasswordId.get(index) == hrenishka) {
            hrenishka = PasswordId.get(index);
            setPincode(hrenishka);

            display();
        }
    }

    private void Namecart(int check) {
        if (check < 40000) {
            setViewCard(CardName.Visa.toString());
        } else {
            setViewCard(CardName.MasterCard.toString());
        }
    }

    private void display() {
        System.out.printf("Карта: %s %d\n", getViewCard(), getNumbercard());
    }
}
