package pl.zzpj2021.solid.lsp.shape;

public class Square implements Countable{
    private float length;

    public Square(float length) {
        this.length = length;
    }


    @Override
    public float countArea() {
        return length * length;
    }

    @Override
    public float countPerimeter() {
        return 4 * length;
    }
}
