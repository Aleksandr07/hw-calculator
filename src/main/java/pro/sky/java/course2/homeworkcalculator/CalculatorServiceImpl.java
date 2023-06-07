package pro.sky.java.course2.homeworkcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer firstValue, Integer secondValue) {
        if (firstValue == null && secondValue == null) {
            return "Оба параметра не поданы";
        } else if (firstValue == null || secondValue == null) {
            return "Один из параметров не подан";
        } else {
            return firstValue + " + " + secondValue + " = " + (firstValue + secondValue);
        }
    }

    @Override
    public String minus(Integer firstValue, Integer secondValue) {
        if (firstValue == null && secondValue == null) {
            return "Оба параметра не поданы";
        } else if (firstValue == null || secondValue == null) {
            return "Один из параметров не подан";
        } else {
            return firstValue + " - " + secondValue + " = " + (firstValue - secondValue);
        }
    }

    @Override
    public String multiply(Integer firstValue, Integer secondValue) {
        if (firstValue == null && secondValue == null) {
            return "Оба параметра не поданы";
        } else if (firstValue == null || secondValue == null) {
            return "Один из параметров не подан";
        } else {
            return firstValue + " * " + secondValue + " = " + (firstValue * secondValue);
        }
    }

    @Override
    public String divide(Double firstValue, Double secondValue) {
        if (secondValue != null && secondValue == 0.0) {
            return "Делить на ноль нельзя";
        }
        if (firstValue == null && secondValue == null) {
            return "Оба параметра не поданы";
        } else if (firstValue == null || secondValue == null) {
            return "Один из параметров не подан";
        } else {
            return firstValue + " / " + secondValue + " = " + (firstValue / secondValue);
        }
    }
}
