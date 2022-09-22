public class Square {
    double x0;
    double x1;
    double y0;
    double y1;

    public Square(double x0, double x1, double y0, double y1){
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;
    }

    public boolean isPointIntoSquare(double x, double y){
        return (y0 <= y) && (y <= y1) && (x0 <= x) && (x <= x1);
    }

    public boolean isPointAboveSquare(double x, double y){
        return y1 < y;
    }
    public boolean isPointBottomSquare(double x, double y){
        return y < y0;
    }
    public boolean isPointRightSquare(double x, double y){return x1 < x;
    }
    public boolean isPointLeftSquare(double x, double y){
        return x < x0;
    }
}
