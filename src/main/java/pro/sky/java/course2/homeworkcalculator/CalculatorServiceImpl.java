package pro.sky.java.course2.homeworkcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(String firstValue, String secondValue) {
        if (firstValue.equals("") && secondValue.equals("")) {
            return "Оба параметра не поданы";
        } else if (firstValue.equals("") || secondValue.equals("")) {
            return "Один из параметров не подан";
        } else {
            return firstValue + " + " + secondValue + " = " + (Integer.parseInt(firstValue) + Integer.parseInt(secondValue));
        }
    }

    @Override
    public String minus(String firstValue, String secondValue) {
        if (firstValue.equals("") && secondValue.equals("")) {
            return "Оба параметра не поданы";
        } else if (firstValue.equals("") || secondValue.equals("")) {
            return "Один из параметров не подан";
        } else {
            return firstValue + " - " + secondValue + " = " + (Integer.parseInt(firstValue) - Integer.parseInt(secondValue));
        }
    }

    @Override
    public String multiply(String firstValue, String secondValue) {
        if (firstValue.equals("") && secondValue.equals("")) {
            return "Оба параметра не поданы";
        } else if (firstValue.equals("") || secondValue.equals("")) {
            return "Один из параметров не подан";
        } else {
            return firstValue + " * " + secondValue + " = " + (Integer.parseInt(firstValue) * Integer.parseInt(secondValue));
        }
    }

    @Override
    public String divide(String firstValue, String secondValue) {
        if (secondValue.equals("0")) {
            return "Делить на ноль нельзя";
        }
        if (firstValue.equals("") && secondValue.equals("")) {
            return "Оба параметра не поданы";
        } else if (firstValue.equals("") || secondValue.equals("")) {
            return "Один из параметров не подан";
        } else {
            return firstValue + " / " + secondValue + " = " + (Double.parseDouble(firstValue) / Double.parseDouble(secondValue));
        }
    }
}
