package pro.sky.java.course2.homeworkcalculator;

public interface CalculatorService {
    String hello();

    String plus(Integer firstValue, Integer secondValue);

    String minus(Integer firstValue, Integer secondValue);

    String multiply(Integer firstValue, Integer secondValue);

    String divide(Double firstValue, Double secondValue);
}