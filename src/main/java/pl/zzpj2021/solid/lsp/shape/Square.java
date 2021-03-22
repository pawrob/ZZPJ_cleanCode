package pl.zzpj2021.solid.lsp.shape;

public class Square implements Shape {
    protected double a;

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double getCircuit() {
        return a*4;
    }

    @Override
    public double getArea() {
        return a*a;
    }
}
