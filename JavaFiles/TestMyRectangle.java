package JavaFiles;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create MyRectangle objects
        MyRectangle rect1 = new MyRectangle(1, 4, 5, 1);
        MyRectangle rect2 = new MyRectangle(new MyPoint(2, 5), new MyPoint(6, 2));

        // Test getters and setters
        System.out.println("rect1 top-left: " + rect1.getTopLeft());  // (1, 4)
        System.out.println("rect1 bottom-right: " + rect1.getBottomRight());  // (5, 1)
        System.out.println("rect2 top-left: " + rect2.getTopLeft());  // (2, 5)
        System.out.println("rect2 bottom-right: " + rect2.getBottomRight());  // (6, 2)

        // Test setTopLeft and setBottomRight
        rect1.setTopLeft(new MyPoint(0, 3));
        rect1.setBottomRight(new MyPoint(4, 0));
        System.out.println("rect1 new top-left: " + rect1.getTopLeft());  // (0, 3)
        System.out.println("rect1 new bottom-right: " + rect1.getBottomRight());  // (4, 0)

        // Test getWidth, getHeight, getArea, and getPerimeter
        System.out.println("rect1 width: " + rect1.getWidth());  // 4
        System.out.println("rect1 height: " + rect1.getHeight());  // 3
        System.out.println("rect1 area: " + rect1.getArea());  // 12
        System.out.println("rect1 perimeter: " + rect1.getPerimeter());  // 14

        System.out.println("rect2 width: " + rect2.getWidth());  // 4
        System.out.println("rect2 height: " + rect2.getHeight());  // 3
        System.out.println("rect2 area: " + rect2.getArea());  // 12
        System.out.println("rect2 perimeter: " + rect2.getPerimeter());  // 14

        // Test toString
        System.out.println("rect1: " + rect1);  // MyRectangle [topLeft = (0, 3), bottomRight = (4, 0)]
        System.out.println("rect2: " + rect2);  // MyRectangle [topLeft = (2, 5), bottomRight = (6, 2)]
    }
}
