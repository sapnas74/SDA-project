package sdaakademija.namudarbai.mano.interfaces.triangles_squares;

public class EquilateralTriangle implements RegularPolygon {

    private double length;

    public EquilateralTriangle(double length) {
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return length;
    }
}
