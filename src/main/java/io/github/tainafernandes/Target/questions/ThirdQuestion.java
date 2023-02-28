package io.github.tainafernandes.Target.questions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.tainafernandes.Target.entity.Invoicing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThirdQuestion {

    public static void main(String[] args) {
        ObjectMapper objMapper = new ObjectMapper();

        StringBuilder json = new StringBuilder();
        String arqLine;

        try(BufferedReader reader = new BufferedReader(new FileReader("json/dados.json"))) { //read the file
            while ((arqLine = reader.readLine()) != null) {
                json.append(arqLine);
            }
        } catch (IOException e) {
            e.getMessage();
        }

        try{
            Invoicing[] invoicings = objMapper.readValue(json.toString(), Invoicing[].class);

            Double lowerValue = invoicings[0].getValor();
            Double highestValue = 0.0;
            Double totalValue = 0.0;
            int validDays = 0;

            for (Invoicing invoicing : invoicings){
                if (invoicing.getValor() != 0.0){
                    lowerValue = lowerValue > invoicing.getValor() ? invoicing.getValor() : lowerValue;
                    highestValue = highestValue < invoicing.getValor() ? invoicing.getValor() : highestValue;
                    totalValue += invoicing.getValor();
                    validDays++;
                }
            }

            System.out.printf("Valor total faturado em %d dias: %.2f%n", validDays, totalValue);
            System.out.printf("Menor valor diário: %.2f%n", lowerValue);
            System.out.printf("Maior valor diário: %.2f%n", highestValue);

        } catch (JsonProcessingException e){
            e.getMessage();
        }
    }
}
