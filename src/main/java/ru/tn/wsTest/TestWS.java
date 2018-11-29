package ru.tn.wsTest;

import ru.tn.wsTest.generateService.CalculatorWS;
import ru.tn.wsTest.generateService.CalculatorWS_Service;

public class TestWS {

    public static void main(String[] args) {
        CalculatorWS_Service service = new CalculatorWS_Service();
        CalculatorWS calculator = service.getCalculatorWSPort();

        System.out.println(calculator.add(5, 6));
    }
}
