package FactoryDesignPattern;

public class CreditCard implements Card {
    private final String cardType;

    public CreditCard(String cardType) {
        this.cardType =  cardType;
    }

    @Override
    public String getCardType() {
        return cardType;
    }

}
