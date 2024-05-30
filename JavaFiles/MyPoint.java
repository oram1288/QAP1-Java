package JavaFiles;

public class MyPoint {
    private int x=0;
    private int y=0;
    //no argument constructor
    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    //parameterized constructor
    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
   //Setter & Getter Method
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return ("(" + this.x + "," +  this.y + ")");
    }
    public double distance(int x, int y)
    {
        int xDiff = this.x-x;
        int yDiff = this.y-y;

        return (Math.sqrt((xDiff*xDiff) + (yDiff*yDiff)));
    }
    public double distance(MyPoint p)
    {
        int xDiff = this.x-p.x;
        int yDiff = this.y-p.y;

        return (Math.sqrt((xDiff*xDiff) + (yDiff*yDiff)));
    }
    public double distance()
    {
        int xDiff = this.x-0;
        int yDiff = this.y-0;

        return (Math.sqrt((xDiff*xDiff) + (yDiff*yDiff)));
    }
}
