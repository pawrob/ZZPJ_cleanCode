package pl.zzpj2021.solid.lsp.shape;

public class ShapeCalculator {
    private Countable shape;

    public ShapeCalculator(Countable countable) {
        this.shape = countable;
    }

    public float countArea(){
        return shape.countArea();
    }

    public float countPerimeter(){
        return shape.countPerimeter();
    }

    public void setShape(Countable shape) {
        this.shape = shape;
    }
}
