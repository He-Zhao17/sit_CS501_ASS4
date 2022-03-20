public class TestRectangle {
    public static void main(String[] args) throws Exception {
        System.out.println("This tool is to test the Rectangle Class.");
        System.out.println("\n");
        System.out.println("Now we create a rectangle called rec1 with 40 height and 40 width.");
        Rectangle rec1 = new Rectangle(40, 4);
        System.out.println("rec1: ");
        rec1.print();
        System.out.println("The area of rec1 is " + rec1.getArea());
        System.out.println("The perimeter of rec1 is " + rec1.getPerimeter());
        System.out.println("\n");
        System.out.println("Now we create a rectangle called rec2 with 35.9 height and 3.5 width.");
        Rectangle rec2 = new Rectangle(35.9, 3.5);
        System.out.println("rec2: ");
        rec2.print();
        System.out.println("The area of rec2 is " + rec2.getArea());
        System.out.println("The perimeter of rec2 is " + rec2.getPerimeter());
    }
}
