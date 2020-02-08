package sdaakademija.namudarbai.mano.interfaces.triangles_squares;

import static java.lang.Math.PI;

public interface RegularPolygon {
    int getNumSides();
    double getSideLength();

    default double getPerimeter(int n, double length){
        return n * length;
    }
    default double getInteriorAngle(int n){
        return (n - 2) * 180;
    }
}

