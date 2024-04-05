public class RectPerimeter {
double length;
double width;
double perimeter;
    public double calculatePerimeter(double length, double width){
double perimeter =  length +  width;
return perimeter;
    }
public static void main (String[]args){
Rectangle recPerimeter = new Rectangle();
double perimeter = recPerimeter.calculatePerimeter(3, 4);
    System.out.println("Perimeter of Rec " + perimeter);
}
}