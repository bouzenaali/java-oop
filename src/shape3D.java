public class shape3D extends Shape {
    int x,y,z;
    public shape3D(String name, int X, int Y, int Z){
        super(name);
        this.x = X;
        this.y = Y;
        this.z = Z;
    }
    

    

    public double getVolume (){
        return x*y*z;
    }

    public String toString(){
        return super.toString() +", 3D" ;
    }

}
