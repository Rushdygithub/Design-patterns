package FactoryDesignPattern;

public class DebiCard implements Card {
    private final String cardType;

    public DebiCard(String cardType) {
       this.cardType = cardType;
    }

    @Override
    public String getCardType() {
        return cardType;
    }

}
