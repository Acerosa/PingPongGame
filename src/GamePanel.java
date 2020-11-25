import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel  extends JPanel implements Runnable {

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)GAME_WIDTH * (5/9);
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGTH = 100;

    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;

    public GamePanel() {
    }
    public void newBall(){}
    public void newPaddles(){}
    public void paint(Graphics graphics){}
    public void draw(Graphics graphics){}
    public void move(){}
    public void checkCollision(){}
    public void run(){}

    public class ActiveListener extends KeyAdapter {
        public void keyPressend(KeyEvent pressedKey){}

        public void keyReleased(KeyEvent releasedKey){}
    }
}
