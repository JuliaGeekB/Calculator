package View;

import java.util.Scanner;

import Model.iCalculable;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int realComponent1 = promptInt("Введите вещественную часть комплексного числа 1: ");
            int imaginaryComponent1 = promptInt("Введите мнимую часть комплексного числа 1: ");
            calculator.sum(realComponent1, imaginaryComponent1);
            
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int realComponentNext = promptInt("Введите вещественную часть нового комплексного числа: ");
                    int imaginaryComponentNext = promptInt("Введите мнимую часть нового комплексного числа: ");
                    calculator.multi(realComponentNext, imaginaryComponentNext);
                    continue;
                }
                if (cmd.equals("+")) {
                    int realComponentNext = promptInt("Введите вещественную часть нового комплексного числа: ");
                    int imaginaryComponentNext = promptInt("Введите мнимую часть нового комплексного числа: ");
                    calculator.sum(realComponentNext, imaginaryComponentNext);
                    continue;
                }
                if (cmd.equals("/")) {
                    int realComponentNext = promptInt("Введите вещественную часть нового комплексного числа: ");
                    int imaginaryComponentNext = promptInt("Введите мнимую часть нового комплексного числа: ");
                    calculator.division(realComponentNext, imaginaryComponentNext);
                    continue;
                }
                if (cmd.equals("=")) {
                    int resultReal = calculator.getResultReal();
                    int resultImaginary = calculator.getResultImaginary();
                    System.out.println("Результат \n" + resultReal + "+" + resultImaginary + "*i");
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}