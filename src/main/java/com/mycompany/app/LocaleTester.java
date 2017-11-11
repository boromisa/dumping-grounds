package com.mycompany.app;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class LocaleTester {



    public static void main(String[] args) {
        Locale locale = new Locale("sv", "SE");

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());

        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);

        System.out.println(formatter.format(12.00));

        Double currencyAmount = new Double(9876543.21);
        Currency currentCurrency = Currency.getInstance(locale);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        System.out.println(locale.getDisplayName() + ", " + currentCurrency.getDisplayName() + ": "
                + currencyFormatter.format(currencyAmount));
    }

}
