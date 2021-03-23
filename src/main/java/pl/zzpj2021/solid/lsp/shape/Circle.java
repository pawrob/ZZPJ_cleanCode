package pl.zzpj2021.solid.lsp.shape;

import lombok.Getter;
import lombok.Setter;

public class Circle implements Shape {

    @Getter
    @Setter
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
