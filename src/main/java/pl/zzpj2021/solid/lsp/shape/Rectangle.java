package pl.zzpj2021.solid.lsp.shape;

import lombok.Getter;
import lombok.Setter;

public class Rectangle implements Shape {

    @Getter
    @Setter
    protected double width, height;

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        return (width + height) * 2;
    }
}
