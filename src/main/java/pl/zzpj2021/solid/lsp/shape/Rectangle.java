package pl.zzpj2021.solid.lsp.shape;

public class Rectangle implements Countable{
    private float width;
    private float length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public float countArea() {
        return width * length;
    }

    @Override
    public float countPerimeter() {
        return 2 * (width + length);
    }
}
