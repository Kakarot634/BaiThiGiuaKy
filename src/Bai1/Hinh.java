package Bai1;

public abstract class Hinh {
    public String color;
    public double borderWidth;

    public Hinh(String color, double borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public static void main(String[] args) {
        Hinhvuong rectangle = new Hinhvuong("Red", 2, 5, 8);
        Hinhtron circle = new Hinhtron("Yellow", 1, 4);
        Tamgiac triangle = new Tamgiac("Green", 3, 3, 4, 5);

        displayShapeInfo(rectangle);
        displayShapeInfo(circle);
        displayShapeInfo(triangle);
    }

    public static void displayShapeInfo(Hinh shape) {
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("Color: " + shape.color);
        System.out.println("Border thickness: " + shape.borderWidth);
        System.out.println("Acreage: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("-----------------------");
    }
}

class Hinhvuong extends Hinh {
    private double width;
    private double height;

    public Hinhvuong(String color, double borderWidth, double width, double height) {
        super(color, borderWidth);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Hinhtron extends Hinh {
    private double radius;

    public Hinhtron(String color, int borderWidth, double radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Tamgiac extends Hinh {
    private double side1;
    private double side2;
    private double side3;

    public Tamgiac(String color, int borderWidth, double side1, double side2, double side3) {
        super(color, borderWidth);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}