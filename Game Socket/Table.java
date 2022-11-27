package assets;

import javax.swing.*;
import java.awt.*;
import display.*;

public class Table extends JPanel{
	int width, height;
	Racket Player;
	PlayerFrame Fenetre;

	//SetUp the field and instanciate the player
	public void paint(Graphics g){
	//Painting the green field
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, getwidth(), getheight());

	//Painting the Player (racket)
		Graphics2D g2D = (Graphics2D)g;
		Player.drawRacket(g2D);

	}

	//Constructor
	public Table(PlayerFrame P){
		setFenetre(P);
		setwidth(getFenetre().getwidth());
		setheight(getFenetre().getheight()-getFenetre().getwidth()/10);
		setPlayer(new Racket(0, 200, 60, Color.BLUE));
	}

	//Getters
	public int getwidth(){return width;}

	public int getheight(){return height;}

	public PlayerFrame getFenetre(){return Fenetre;}

	public Racket getPlayer(){return Player;}

	//Setters
	public void setwidth(int W){width = W;}

	public void setheight(int H){height = H;}

	public void setFenetre(PlayerFrame Pf){Fenetre = Pf;}

	public void setPlayer(Racket P){Player = P;}
}