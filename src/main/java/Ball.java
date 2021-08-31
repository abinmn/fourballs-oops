import processing.core.PApplet;

public class Ball {
    private static final int DIAMETER_BALL = 10;

    private PApplet pApplet;

    private int speed;
    private double relativeHeight;
    private int windowHeight;

    public Ball(int speed, double relativeHeight, int windowHeight, PApplet pApplet) {
        this.speed = speed;
        this.relativeHeight = relativeHeight;
        this.windowHeight = windowHeight;
        this.pApplet = pApplet;
    }

    public void draw(int relativeHorizontalPosition) {
        float xAxis = getXAxis(relativeHorizontalPosition);
        float yAxis = getYAxis();
        pApplet.ellipse(xAxis, yAxis, DIAMETER_BALL, DIAMETER_BALL);
    }

    private float getXAxis(int xAxis) {

        return xAxis * speed;
    }

    private float getYAxis() {

        return (float) (windowHeight * relativeHeight);
    }


}
