package pl.zzpj2021.solid.lsp.shape;

public class Square extends Rectangle {

    @Override
    public void setWidth(double width) {
        super.setHeight(width);
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        this.setWidth(height);
    }
}
