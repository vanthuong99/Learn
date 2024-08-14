package org.example;

public class Main {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("abcdef@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("ghijkl@gmail.com", "0123456789");
    }
}
