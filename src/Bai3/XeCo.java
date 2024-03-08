package Bai3;

public class XeCo {
    private String brand;
    private String color;

    public XeCo(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public XeCo() {
    }

    public void start() {
        System.out.println("Khởi động xe...");
    }

    public void accelerate() {
        System.out.println("Tăng tốc...");
    }

    public void stop() {
        System.out.println("Dừng lại...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class main {
    public static void main(String[] args) {
        XeOto car = new XeOto("Hyundai", "Gray", 5);
        car.start();
        car.accelerate();
        car.stop();
        System.out.println(car);

        XeMay motorcycle = new XeMay("Wave", "Red", 150);
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();
        System.out.println(motorcycle);

        XeTai truck = new XeTai("Thaco", "Black", 5000);
        truck.start();
        truck.accelerate();
        truck.stop();
        System.out.println(truck);
    }
}
class XeOto extends XeCo {

    private int seats;

    public XeOto(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", numSeats=" + seats +
                '}';
    }
}
class XeMay extends XeCo {

    private int dungTichDongCo;

    public XeMay(String brand, String color, int dungTichDongCo) {
        super(brand, color);
        this.dungTichDongCo = dungTichDongCo;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "dungTichDongCo=" + dungTichDongCo +
                '}';
    }
}
class XeTai extends XeCo {

    private int payload;

    public XeTai(String brand, String color, int payload) {
        super(brand, color);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
}
