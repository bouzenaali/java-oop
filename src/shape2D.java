public class shape2D extends Shape {
    int x,y;
    public shape2D(String name,int X, int Y) {
        super(name);
        this.x = X;
        this.y = Y;
    }

    public double getPerimeter() {
        return (x+y)*2;
    }

    public double getArea(){
        return x*y;
    }

    public String toString() {
        return super.toString() + ", 2D";
    }


}
