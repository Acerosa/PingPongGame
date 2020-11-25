import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle{

    int id;
    int yVelocity;

    public Paddle(int x, int y, int paddleWidth, int paddleHeigth, int id) {
        super(x,y,paddleWidth,paddleHeigth);
        this.id = id;
    }

    public void keyPressed(KeyEvent pressendKey){}
    public void keyReleased(KeyEvent releasedKey){}
    public void setYDirection(int yDirection){}
    public void move(){}
    public void draw(Graphics graphicsL){
        if (id==1)
            graphicsL.setColor(Color.blue);
        else
            graphicsL.setColor(Color.red);
        graphicsL.fillRect(x,y,width,height);


    }

}
