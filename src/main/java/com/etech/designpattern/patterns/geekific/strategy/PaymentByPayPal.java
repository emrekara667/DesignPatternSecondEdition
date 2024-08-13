package com.etech.designpattern.patterns.geekific.strategy;

public class PaymentByPayPal implements PaymentStrategy {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect PayPal mail and password
        email = "Paypal Mail";
        password = "Paypal Password";
        System.out.println("Collecting PayPal Account Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate account...
        System.out.printf("Validating PayPal info: %s | %s%n", email, password);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + "using PayPal");
    }
}
