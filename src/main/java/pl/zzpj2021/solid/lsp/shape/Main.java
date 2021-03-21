package pl.zzpj2021.solid.lsp.shape;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator(new Circle(8));
        System.out.println("Shape area: " + calculator.countArea());
        System.out.println("Shape perimeter: " + calculator.countPerimeter());

        calculator.setShape(new Rectangle(2,5));
        System.out.println("Shape area: " + calculator.countArea());
        System.out.println("Shape perimeter: " + calculator.countPerimeter());
    }
}
