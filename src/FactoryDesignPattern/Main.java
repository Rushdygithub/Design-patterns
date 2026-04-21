package FactoryDesignPattern;

public class Main {
    static void main(String[] args) {

        //NOTE::This is actually tight coupling
        //CardDeatails cardDeatails = new CardDeatails("1234 5678 9012 3456", "John Doe", "12/25", "123", new DebiCard());
        //CardDeatails cardDeatails = new CardDeatails();
        //cardDeatails.setCardNumber("1234 5678 9012 3456");
        //cardDeatails.setCardHolderName("John Doe");
        //cardDeatails.setExpiryDate("12/25");
        //cardDeatails.setCvv("123");
        //cardDeatails.setCreditCard(new CreditCard());
        //cardDeatails.getPaymentDetails();

        //NOTE::This is actually loose coupling
        //CardDeatails cardDeatails = new CardDeatails();
        //cardDeatails.setCardNumber("1234 5678 9012 3456");
        //cardDeatails.setCardHolderName("John Doe");
        //cardDeatails.setExpiryDate("12/25");
        //cardDeatails.setCvv("123");
        //cardDeatails.setCard(new CreditCard());
        //cardDeatails.getPaymentDetails();

        //CardDeatails cardDeatails = new CardDeatails("1234 5678 9012 3456", "John Doe", "12/25", "123", new DebiCard());
        //cardDeatails.getPaymentDetails();

        //CardDeatails cardDeatails = new CardDeatails("1234 5678 9012 3456", "John Doe", "12/25", "123", PaymentTypeFactory.getPaymentType(Types.CREDIT_CARD, "VISA"));
        //cardDeatails.getPaymentDetails();

    }
}
