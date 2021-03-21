package pl.zzpj2021.solid.lsp.shape;

public class Circle implements Countable{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float countArea() {
        return (float) (Math.PI * Math.pow(radius,2));
    }

    @Override
    public float countPerimeter() {
        return (float) (2 * Math.PI * radius);
    }
}
