package session1;

public class PhanSo {
    int A;
    int B;

    public PhanSo(){

    }
    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public boolean ktPhanso(){
    return B!=0;
    }
    public void inPhanso(){
        if (!ktPhanso())  System.out.println("Mau so khong duoc bang 0");
        System.out.println("Phan so la :" +Math.abs(A)+ "/" + Math.abs(B));
    }
}

