public class Shape {
    String name;

    public Shape(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public String getName(){
        return "Shape: " + name;
    }


    public static void main(String[] args) {
        Shape shape = new Shape("shape");
        shape2D shape2D = new shape2D("square",12,4);
        shape3D shape3D = new shape3D("sphere",11,8,3);

        String name = shape.getName(); // "shape"
        double perimeter = shape2D.getPerimeter(); 
        double area = shape2D.getArea(); 
        double volume = shape3D.getVolume(); 

        System.out.println(shape.toString()); // "Shape: shape"
        System.out.println(shape2D.toString()); // "Shape: square, 2D"
        System.out.println(shape3D.toString()); // "Shape: sphere, 3D"

    }
}
