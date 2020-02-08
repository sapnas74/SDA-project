package sdaakademija.namudarbai.mano.interfaces.triangles_squares;

public class RegularPolygonMain {
    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle(10);
        Square polygon = new Square(5);

        System.out.println("Trikampio perimetras :" + triangle.getPerimeter(triangle.getNumSides(), triangle.getSideLength()));
        System.out.println("Trikampio plotas : " + triangle.getInteriorAngle(triangle.getNumSides()));

        System.out.println("Keturkampio perimetras : " + polygon.getPerimeter(polygon.getNumSides(), polygon.getSideLength()));
        System.out.println("Keturkampio vidinis kampas" + polygon.getInteriorAngle(polygon.getNumSides()));
    }
}