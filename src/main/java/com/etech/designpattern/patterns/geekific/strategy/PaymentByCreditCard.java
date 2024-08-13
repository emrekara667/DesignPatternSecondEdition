package com.etech.designpattern.patterns.geekific.strategy;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard card;
    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect card details
        card = new CreditCard("cardNumber", "expiryDate", "cvv");
        System.out.println("Collecting card details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate credit card
        System.out.println("Validating Card info " + card);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + "using credit card");
        card.setAmount(card.getAmount() - amount);
    }
}
