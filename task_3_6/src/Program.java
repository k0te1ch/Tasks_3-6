public class Program {
    public static final HorizontalParabola HP1 = new HorizontalParabola(-3, -4, 1);
    public static final Parabola P1 = new Parabola(3, 1, 1);
    public static final Square S1 = new Square(-3, 5, -1, 8);
    public static final Square S2 = new Square(1, 3, -3, 2);
    public static final Square S3 = new Square(-3, 4, 0, 9);
    public static SimpleColour getColour(double x, double y){
        if ((S2.isPointIntoSquare(x, y))){
            if (HP1.isPointRightOfParabola(x, y) || P1.isPointAboveOfParabola(x, y)){
                return SimpleColour.ORANGE;
            }
            if (y >= 0) {
                return SimpleColour.GRAY;
            }
            return SimpleColour.GREEN;
        }
        if ((S1.isPointAboveSquare(x, y)) && (S3.isPointIntoSquare(x, y))){
            return SimpleColour.ORANGE;
        }
        if (S1.isPointIntoSquare(x, y)){
            if (S3.isPointRightSquare(x, y) || (S2.isPointRightSquare(x, y) && y<=0)){
                return SimpleColour.YELLOW;
            }
            if (P1.isPointAboveOfParabola(x, y) && S3.isPointIntoSquare(x, y)) {
                return SimpleColour.BLUE;
            }
            if (!P1.isPointAboveOfParabola(x, y) && S2.isPointRightSquare(x, y)){
                return SimpleColour.ORANGE;
            }
            return SimpleColour.GREEN;
        }
        if (P1.isPointAboveOfParabola(x, y)){
            if (S3.isPointIntoSquare(x, y)){
                return SimpleColour.BLUE;
            }
            return SimpleColour.GRAY;
        }
        if (HP1.isPointRightOfParabola(x, y)){
            return SimpleColour.YELLOW;
        }
        if (!P1.isPointAboveOfParabola(x, y) && !HP1.isPointRightOfParabola(x, y) && (S2.isPointLeftSquare(x, y) ||  S2.isPointBottomSquare(x, y))){
            return SimpleColour.ORANGE;
        }
        return SimpleColour.WHITE;
    }
}
