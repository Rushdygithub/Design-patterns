package FactoryDesignPattern;

import static FactoryDesignPattern.Types.*;

public class PaymentTypeFactory {

    public static Card getPaymentType(Types types,String type) {
        if (types == CREDIT_CARD) {
            System.out.println("-- CREDIT_CARD --");
            return new CreditCard(type);
        }
        else if (types == DEBIT_CARD) {
            return new DebiCard(type);
        }
        return null;
    }

}
