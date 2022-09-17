package session1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int x = 10;
        System.out.println("x= " + x);
        String str = "Hello world";
        if (x > 5) {
            System.out.println(str);
        } else {
            System.out.println("not found");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i= " + i);
        }
        Car c = new Car();
        Car c2= new Car();
        c.brand = "Toyota";
        System.out.println(c.brand);
        Car.color = "red";
        System.out.println(Car.color);
        c.showInfo();
        c2.showInfo();
        Bike b = new Bike();
        b.run();
        System.out.println(Car.color);
        TamGiac t = new TamGiac();
        t.setCanhA(4);
        t.setCanhB(5);
        t.setCanhC(6);
        System.out.println("Chu vi:" +t.ChuVi());
        System.out.println("Dien tich:" +t.DienTich());
        PhanSo e = new PhanSo();
        e.setA(4);
        e.setB(5);

        PhanSo o = new PhanSo();
        o.setA(3);
        o.setB(4);
        o.inPhanSo();
        o.nghichdaoPhanSo();

    }

}