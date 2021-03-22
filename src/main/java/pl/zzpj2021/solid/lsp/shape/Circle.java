package pl.zzpj2021.solid.lsp.shape;

public class Circle implements Shape{

    private double r;

    @Override
    public double getCircuit() {
        return 2* Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r,2);
    }
}
