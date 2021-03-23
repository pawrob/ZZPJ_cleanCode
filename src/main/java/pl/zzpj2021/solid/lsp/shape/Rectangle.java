package pl.zzpj2021.solid.lsp.shape;

import lombok.Getter;
import lombok.Setter;

public class Rectangle implements Shape {

    @Getter
    private double width, height;

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        return (width + height) * 2;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

}
