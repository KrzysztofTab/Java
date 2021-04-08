package Cwiczenia.data;

public class Point {
    private int X;
    private int Y;

//    konstruktor bes parametrowy
    public Point(){
    }
//    konstrukro z dwoma współrzednymi
    public Point(int x, int y){
        this.X=x;
        this.Y=y;
    }
//    getter i settler
    public int getX() {
        return X;
    }

    public void setX(int x) {
       this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }
}
