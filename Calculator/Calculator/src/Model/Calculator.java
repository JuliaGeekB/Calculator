package Model;

public final class Calculator implements iCalculable {

    private int realComponent1;
    private int imaginaryComponent1;

    public Calculator(int realComponent1, int imaginaryComponent1) {
        this.realComponent1 = realComponent1;
        this.imaginaryComponent1 = imaginaryComponent1;
    }

    @Override
    public iCalculable sum(int realComponentNext, int imaginaryComponentNext) {
        realComponent1 += realComponentNext;
        imaginaryComponent1 += imaginaryComponentNext;
        return this;
    }

    @Override
    public iCalculable multi(int realComponentNext, int imaginaryComponentNext) {
         int a= realComponent1*realComponentNext-imaginaryComponent1*imaginaryComponentNext;
         imaginaryComponent1 = (realComponent1*imaginaryComponentNext)+(imaginaryComponent1*realComponentNext);
         realComponent1=a;
         return this;
    }

    @Override
    public iCalculable division(int realComponentNext, int imaginaryComponentNext) {
        int b = (realComponent1*realComponentNext+imaginaryComponent1*imaginaryComponentNext)/(realComponentNext*realComponentNext+imaginaryComponentNext*imaginaryComponentNext);
        // добавить проверку деления на 0
        imaginaryComponent1 = (imaginaryComponent1*realComponentNext-realComponent1*imaginaryComponentNext)/(realComponentNext*realComponentNext+imaginaryComponentNext*imaginaryComponentNext);
        realComponent1=b;
        return this;
    }  
    
    @Override
    public int getResultReal() {
        return (realComponent1);
    }

  
    @Override
    public int getResultImaginary() {
        return (imaginaryComponent1);
    }

}