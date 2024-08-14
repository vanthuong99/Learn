package org.example;

import org.example.service.*;

public class ShopFacade {
    private static final ShopFacade INSTANCE = new ShopFacade();

    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;
    private SmsService smsService;

    private ShopFacade() {
        this.accountService = new AccountService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.emailService = new EmailService();
        this.smsService = new SmsService();
    }

    public static ShopFacade getInstance() {
        return INSTANCE;
    }

    public void buyProductByCashWithFreeShipping(String email) {
        this.accountService.getAccount(email);
        this.paymentService.paymentByCash();
        this.shippingService.freeShipping();
        this.emailService.sendMail(email);
        System.out.println("Done!");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String phoneNumber) {
        this.accountService.getAccount(email);
        this.paymentService.paymentByPaypal();
        this.shippingService.standardShipping();
        this.emailService.sendMail(email);
        this.smsService.sendSms(phoneNumber);
        System.out.println("Done!");
    }
}
