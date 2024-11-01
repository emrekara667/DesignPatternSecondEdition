package com.etech.designpattern.patterns.baha.factory;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Ayşe", "Mehmet", "Fatma");

        // Stream ile isimleri büyük harfe çevirip, işlemler sırasında peek ile gözlem yapalım
        List<String> upperCaseNames = names.stream()
                .peek(name -> System.out.println("İşlenmeden önce: " + name)) // Gözlemleme
                .map(String::toUpperCase) // İsimleri büyük harfe çevirme
                .peek(name -> System.out.println("İşlendikten sonra: " + name)) // Gözlemleme
                .toList(); // Sonuçları listeye çevir

        System.out.println("Sonuç: " + upperCaseNames);

    }
}
