public class Triangle {
    int a,b,c;

    public Triangle(int a, int b, int c) throws TriangleException {
        if (a<0 || b<0 || c<0 ) {
            throw new TriangleException("Nhập sai cạnh");
        }
        if ((a+b)<=c || (b+c)<=a || (a+c)<= b) {
            throw new TriangleException("Sai logic");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() throws TriangleException{
        if (a>3) {
            throw new TriangleException ("nhap ngu");
        }
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
