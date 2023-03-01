package io.github.tainafernandes.Target.questions;

import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
        String phrase = "Eu amo comer";
        String phrase2 = "Três pratos de trigo para três tigres tristes.";

        System.out.println(reversePhrase(phrase));
        System.out.println(reversePhrase(phrase2));
    }

    public static String reversePhrase(String phrase) {
        StringBuilder sb = new StringBuilder();

        for (int i = phrase.length() - 1; i >= 0; i--){
            sb.append(phrase.charAt(i));
        }
        return sb.toString();
    }
}
