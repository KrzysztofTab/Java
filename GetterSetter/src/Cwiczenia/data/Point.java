package Cwiczenia.data;

public class Point {
    private int X;
    private int Y;

    public Point(){
    }
    public Point(int x, int y){
        this.X=x;
        this.Y=y;
    }

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
