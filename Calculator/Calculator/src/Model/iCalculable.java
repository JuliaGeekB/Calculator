package Model;

public interface iCalculable {
    iCalculable sum(int realComponentNext, int imaginaryComponentNext);
    iCalculable multi(int realComponentNext, int imaginaryComponentNext);
    iCalculable division(int realComponentNext, int imaginaryComponentNext);
    int getResultReal();
    int getResultImaginary();
}