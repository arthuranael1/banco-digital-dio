package com.bank.service;

public class Utils {
    public static String formatarMoeda(double valor) {
        return String.format("R$ %.2f", valor);
    }
}
