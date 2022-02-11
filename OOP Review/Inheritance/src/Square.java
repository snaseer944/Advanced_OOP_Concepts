
public class Square extends Shape {
    double sLength;

    public Square(double length, String name){
        super(name);
        this.sLength = length;
    }
    @Override
    public double getArea(){
        double area = this.sLength * this.sLength;
        return area;
    }

    @Override
    public double getPerimeter() {
        double per = 4 * this.sLength;
        return per;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Square)){
            return false;
        }
        Square other = (Square) obj;
        return this.sLength == other.sLength && name.equals(other.name);

    }

    @Override
    public String toString() {
        return this.getName() + ":" + this.sLength;
    }



}