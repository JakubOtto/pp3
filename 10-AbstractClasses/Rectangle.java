public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double area(){
        return this.a*this.b;
    }

    @Override
    public double perimeter() {
        return (2*a)+(2*b);
    }

    
}
