package JavaFiles;

public class TestMyLine {
    public static void main(String[] args) {
        // Create MyLine objects
        MyLine line1 = new MyLine(1, 2, 3, 4);
        MyLine line2 = new MyLine(new MyPoint(5, 6), new MyPoint(7, 8));

        // Test getters and setters
        System.out.println("line1 begin: " + line1.getBegin());  // (1, 2)
        System.out.println("line1 end: " + line1.getEnd());      // (3, 4)
        System.out.println("line2 begin: " + line2.getBegin());  // (5, 6)
        System.out.println("line2 end: " + line2.getEnd());      // (7, 8)

        // Test setBegin and setEnd
        line1.setBegin(new MyPoint(9, 10));
        line1.setEnd(new MyPoint(11, 12));
        System.out.println("line1 new begin: " + line1.getBegin());  // (9, 10)
        System.out.println("line1 new end: " + line1.getEnd());      // (11, 12)

        // Test getBeginX, getBeginY, getEndX, getEndY
        System.out.println("line1 begin x: " + line1.getBeginX());  // 9
        System.out.println("line1 begin y: " + line1.getBeginY());  // 10
        System.out.println("line1 end x: " + line1.getEndX());      // 11
        System.out.println("line1 end y: " + line1.getEndY());      // 12

        // Test setBeginXY and setEndXY
        line2.setBeginXY(13, 14);
        line2.setEndXY(15, 16);
        System.out.println("line2 new begin: " + line2.getBegin());  // (13, 14)
        System.out.println("line2 new end: " + line2.getEnd());      // (15, 16)

        // Test getLength
        System.out.println("line1 length: " + line1.getLength());  // Distance between (9, 10) and (11, 12)
        System.out.println("line2 length: " + line2.getLength());  // Distance between (13, 14) and (15, 16)

        // Test getGradient
        System.out.println("line1 gradient: " + line1.getGradient());  // Gradient of the line from (9, 10) to (11, 12)
        System.out.println("line2 gradient: " + line2.getGradient());  // Gradient of the line from (13, 14) to (15, 16)

        // Test toString
        System.out.println("line1: " + line1);  // MyLine[begin=(9, 10),end=(11, 12)]
        System.out.println("line2: " + line2);  // MyLine[begin=(13, 14),end=(15, 16)]
    }
}
