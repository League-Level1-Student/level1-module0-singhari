package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x;
    int y;
    int hold;
    int birdYVelocity = -10;
    Random ran = new Random();
    int plsceX = ran.nextInt(WIDTH);
    int upperPipeHeight = (int) random(100, 400);
    int pipeGap = 10;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }
//a
    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	int gravity = 1;
        background(0,255,240);
        stroke(0,0,0);
        fill(255,255,0);
        for(int i = 0; i< 1; i++) {
        	fill(0, 255, 0);
            rect(plsceX, 500, 50, upperPipeHeight);
            plsceX++;
        	x++;
        	if(x > WIDTH) {
        		x = 10;
        	}
        	y=20;
        	y+=birdYVelocity;
        	 fill(255,255,0);
        ellipse(x,y,30,30);
        gravity++;
        birdYVelocity += gravity;
        hold++;
        if(hold > 150 || plsceX > WIDTH) {       	
        	plsceX = ran.nextInt(WIDTH);
        	upperPipeHeight = (int) random(100, 400);
        	hold = 0;
        	}
        }
    }
public void mousePressed(){
	birdYVelocity = -10;
}
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
