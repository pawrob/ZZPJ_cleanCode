package pl.zzpj2021.solid.lsp.shape;

public class Rectangle extends Square{
    protected int b;

    @Override
    public double getCircuit() {
        return 2*a + 2*b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
