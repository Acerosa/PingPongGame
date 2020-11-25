import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel  extends JPanel implements Runnable {

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
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

        newPaddles();
        newBall();
        score = new Score(GAME_WIDTH,GAME_HEIGHT);
        this.setFocusable(true);
        this.addKeyListener(new ActionListener());
        this.setPreferredSize(SCREEN_SIZE);
        gameThread = new Thread(this);
        gameThread.start();

    }
    public void newBall(){}

    public void newPaddles(){
        paddle1 = new Paddle(0,(GAME_HEIGHT/2) - (PADDLE_HEIGTH/2), PADDLE_WIDTH, PADDLE_HEIGTH, 1);
        paddle2 = new Paddle(GAME_WIDTH - PADDLE_WIDTH,(GAME_HEIGHT/2) - (PADDLE_HEIGTH/2), PADDLE_WIDTH, PADDLE_HEIGTH,2);

    }
    public void paint(Graphics graphicsL){
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        graphicsL.drawImage(image,0,0,this);

    }
    public void draw(Graphics graphicsL){
            paddle1.draw(graphicsL);
            paddle2.draw(graphicsL);
    }
    public void move(){}
    public void checkCollision(){}
    public void run(){
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double nanoseconds = 1000000000/amountOfTicks;
        double delta = 0;

        while (true){
            long now = System.nanoTime();
             delta+= (now - lastTime)/nanoseconds;
             lastTime = now;
             if (delta>=1){
                  move();
                  checkCollision();
                  repaint();
                  delta--;
                 System.out.println("Test");

             }
        }
    }

    public class ActionListener extends KeyAdapter {
        public void keyPressend(KeyEvent pressedKey){}

        public void keyReleased(KeyEvent releasedKey){}
    }
}
