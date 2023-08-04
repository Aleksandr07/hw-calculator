package pro.sky.java.course2.homeworkcalculator;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homeworkcalculator.exceptions.ArgumentIsNullException;
import pro.sky.java.course2.homeworkcalculator.exceptions.DivisionByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer firstValue, Integer secondValue) {
        if (firstValue == null && secondValue == null) {
            throw new ArgumentIsNullException("Оба параметра не поданы");
        } else if (firstValue == null || secondValue == null) {
            throw new ArgumentIsNullException("Один из параметров не подан");
        } else {
            return firstValue + " + " + secondValue + " = " + (firstValue + secondValue);
        }
    }

    @Override
    public String minus(Integer firstValue, Integer secondValue) {
        if (firstValue == null && secondValue == null) {
            throw new ArgumentIsNullException("Оба параметра не поданы");
        } else if (firstValue == null || secondValue == null) {
            throw new ArgumentIsNullException("Один из параметров не подан");
        } else {
            return firstValue + " - " + secondValue + " = " + (firstValue - secondValue);
        }
    }

    @Override
    public String multiply(Integer firstValue, Integer secondValue) {
        if (firstValue == null && secondValue == null) {
            throw new ArgumentIsNullException("Оба параметра не поданы");
        } else if (firstValue == null || secondValue == null) {
            throw new ArgumentIsNullException("Один из параметров не подан");
        } else {
            return firstValue + " * " + secondValue + " = " + (firstValue * secondValue);
        }
    }

    @Override
    public String divide(Double firstValue, Double secondValue) {
        if (secondValue != null && secondValue == 0.0) {
            throw new DivisionByZeroException("Деление на ноль");
        }
        if (firstValue == null && secondValue == null) {
            throw new ArgumentIsNullException("Оба параметра не поданы");
        } else if (firstValue == null || secondValue == null) {
            throw new ArgumentIsNullException("Один из параметров не подан");
        } else {
            return firstValue + " / " + secondValue + " = " + (firstValue / secondValue);
        }
    }
}
