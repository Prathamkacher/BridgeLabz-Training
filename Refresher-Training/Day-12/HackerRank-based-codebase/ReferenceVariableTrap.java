public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
	
	public void scale(int factor) {
        length = length * factor;
        width = width * factor;
    }

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = rect1;

        rect2.scale(2);

        System.out.println("rect1 length: " + rect1.getLength());
        System.out.println("rect1 width: " + rect1.getWidth());
    }
}