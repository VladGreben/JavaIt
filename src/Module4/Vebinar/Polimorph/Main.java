package Module4.Vebinar.Polimorph;

public class Main {
    static void draw(Figure figure){
        figure.drawFigure();
    }

    public static void main(String[] args) {

        Figure circle = new Circle();
        Figure square = new Square();
        draw(circle);

    }

}
