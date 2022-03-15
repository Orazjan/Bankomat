package Bankomat;

public class cash {
    public cash(){}
    private String NameCard;
    private String ViewCard;
    private int Numbercard;
    private int Pincode;
    private int Summa = 1000;

    public String getNameCard() {
        return NameCard;
    }

    public void setNameCard(String nameCard) {
        NameCard = nameCard;
    }

    public String getViewCard() {
        return ViewCard;
    }

    public void setViewCard(String viewCard) {
        ViewCard = viewCard;
    }

    public void setNumbercard(int numbercard) {
        this.Numbercard = numbercard;
    }

    public int getNumbercard() {
        return Numbercard;
    }

    public void setPincode(int pincode) {
        this.Pincode = pincode;
    }

    public int getPincode() {
        return Pincode;
    }

    public void setSumma(int summa) {
        this.Summa = summa;
    }

    public int getSumma() {
        return Summa;
    }
}
