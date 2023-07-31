//import java.util.logging.Logger;

import Model.CalcDecorator;
import Model.Calculator;
import Model.iCalculable;
import Model.Logger;
import View.ViewCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        iCalculable calculator = new Calculator(0, 0);
        // ViewCalculator view = new ViewCalculator(calculator );
        
        iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());
        
        ViewCalculator view = new ViewCalculator(newCalcLog);
        view.run();
    }
}
