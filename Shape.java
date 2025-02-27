interface Shapes {
    int getArea();
    int getPerimeter();
    void printDimentions();
}

class Rectangle implements Shapes {
    int length;
    int breadth;
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    public int getArea() {
        return length * breadth;
    }
    public int getPerimeter() {
        return 2 * (length + breadth);
    }
    public void printDimentions() {
        System.out.println("Length : " + length);
        System.out.println("Breadth : " + breadth);
    }
}

class Circle implements Shapes {
    int radius;
    public Circle(int r) {
        radius = r;
    }
    public int getArea() {
        return (int) (3.14 * radius * radius);
    }
    public int getPerimeter() {
        return (int) (2 * 3.14 * radius);
    }
    public void printDimentions() {
        System.out.println("Radius : " + radius);
    }
}

class Square implements Shapes {
    int side;
    public Square(int s) {
        side = s;
    }
    public int getArea() {
        return side * side;
    }
    public int getPerimeter() {
        return 4 * side;
    }
    public void printDimentions() {
        System.out.println("Side : " + side);
    }
}

class Shape {

    public static void print(Shapes s){
        s.getArea();
        s.getPerimeter();
        System.out.println("Class : " + (s instanceof Square));
    }
    public static void main(String[] args) {
        Shapes r = new Square(10);
        print(r);
    }
}