import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static final int TOTAL_BALLS = 4;

    private int relativeHorizontalPosition = 0;
    private ArrayList<Ball> balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBalls");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int b = 1; b <= TOTAL_BALLS; b++) {
            Ball ball = new Ball(b, getRelativeHeight(b), HEIGHT,this);
            balls.add(ball);
        }
    }

    @Override
    public void draw() {
        for (Ball ball: balls) {
            ball.draw(relativeHorizontalPosition);
        }
        incrementRelativeHorizontalPosition();
    }

    private double getRelativeHeight(int i) {
        return i * 0.2;
    }

    private void incrementRelativeHorizontalPosition() {
        relativeHorizontalPosition++;
    }
}
