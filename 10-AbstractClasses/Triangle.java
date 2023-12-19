public class Triangle extends Shape {
    int a;
    int b;
    int c;
    int h;
    

    

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double area(){
        return (this.a*this.h)/2;
    }

    @Override
    public double perimeter() {
        
        return a+b+c;
    }

    
    
}
