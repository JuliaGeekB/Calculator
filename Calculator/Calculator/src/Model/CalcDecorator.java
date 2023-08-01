package Model;

public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;
 
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    public CalcDecorator(iCalculable calculator, java.util.logging.Logger logger2) {
    }

    @Override
    public iCalculable sum(int realComponentNext, int imaginaryComponentNext) {
        int firstReal = oldCalc.getResultReal();
        int firstImaginary = oldCalc.getResultImaginary();

       logger.log(String.format("Первое значение калькулятора. Первое число  " + firstReal +" +" + firstImaginary+"i" +"и второе число " + realComponentNext +" + "+ imaginaryComponentNext+"i"));
       iCalculable result = oldCalc.sum(realComponentNext, imaginaryComponentNext);

       logger.log(String.format("Вызова метода sum произошел"));

       return result;
    }

    @Override
    public iCalculable multi(int realComponentNext, int imaginaryComponentNext) {
        int firstReal = oldCalc.getResultReal();
        int firstImaginary = oldCalc.getResultImaginary();
        logger.log(String.format("Первое значение калькулятора. Первое число  " + firstReal +" +" + firstImaginary+"i" +"и второе число " + realComponentNext +" + "+ imaginaryComponentNext+"i"));
        iCalculable result = oldCalc.multi(realComponentNext, imaginaryComponentNext);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public iCalculable division(int realComponentNext, int imaginaryComponentNext) {
        int firstReal = oldCalc.getResultReal();
        int firstImaginary = oldCalc.getResultImaginary();
        logger.log(String.format("Первое значение калькулятора. Первое число  " + firstReal +" +" + firstImaginary+"i" +"и второе число " + realComponentNext +" + "+ imaginaryComponentNext+"i"));
        iCalculable result = oldCalc.multi(realComponentNext, imaginaryComponentNext);
        logger.log(String.format("Вызова метода division произошел"));
        return result;
    }

    @Override
    public int getResultReal() {
        int resultReal = oldCalc.getResultReal();
        logger.log(String.format("Получение результата вещественной части %d", resultReal));
        return resultReal;
    }
    
    @Override
    public int getResultImaginary() {
        int resultImaginary = oldCalc.getResultImaginary();
        logger.log(String.format("Получение результата мнимой части %d", resultImaginary));
        return resultImaginary;
    }
    
}