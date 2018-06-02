package exercise3;

public class StaticOverload {

    //method to calculate perimeter of square
    public static int perimeter(int a){
        return (4*a);
    }

    //method to calculate perimeter of Rectangle
    public static int perimeter(int a,int b){
        return (2*(a+b));
    }

    //method to calculate perimeter of Triangle
    public static int perimeter(int a,int b,int c){
        return ((a+b+c));
    }

    public static void main(String[] args) {
     StaticOverload object=new StaticOverload();
        System.out.println("Perimeter of Square = "+object.perimeter(5));
        System.out.println("Perimeter of Rectangle = "+object.perimeter(8,12));
        System.out.println("Perimeter of Triangle = "+object.perimeter(9,17,11));
    }
}
