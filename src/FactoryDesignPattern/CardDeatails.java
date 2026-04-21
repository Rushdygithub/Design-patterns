package FactoryDesignPattern;

public class CardDeatails {

    //NOTE:: Card Details
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    //NOTE:: This is actually tight coupling
    //private CreditCard creditCard;
    //NOTE:: This is actually loose coupling
    private Card card;


    public CardDeatails() {
    }

    public CardDeatails(String cardNumber, String cardHolderName, String expiryDate, String cvv, Card card) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.card = card;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public Card getCard() {
        return card;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    //NOTE::Get payment details
    public void getPaymentDetails() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
        //System.out.println("Credit Card Type: " + Card.getCardType());
    }

}
