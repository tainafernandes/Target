package io.github.tainafernandes.Target.questions;

import java.util.List;
import java.util.Locale;
public class FourthQuestion {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<String> states = List.of("SP", "RJ", "MG", "ES", "Outros");
        List<Double> invoicing = List.of(67836.43, 36678.66, 29229.88, 27165.48, 19849.53);

        final Double[] totalValue = {0.0};

        invoicing.forEach(i -> {
            totalValue[0] += i.doubleValue();
        });
        System.out.println("Valor total: " + totalValue[0]);

        for(int i = 0; i < states.size(); i++) {
            System.out.printf("Percentual do Estado de %s: %.2f%n", states.get(i), calcPercent(totalValue[0], invoicing.get(i)));
        }
    }
    private static Double calcPercent(Double totalValue, Double valueState) {
        return (valueState * 100) / totalValue;
    }
}
