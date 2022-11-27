package mpihaino;

import java.awt.event.*;
import java.awt.*;
import assets.*;

public class KListener implements KeyListener {
	Table field;

	//Overrinding method
	public void keyPressed(KeyEvent e){
		if(e.getKeyChar() == 'z'){
			getField().getPlayer().setUp(true);
		}
		if(e.getKeyChar() == 's'){
			getField().getPlayer().setDown(true);
		}
	}

	public void keyReleased(KeyEvent e){
		if(e.getKeyChar() == 'z'){
			getField().getPlayer().setUp(false);
		}
		if(e.getKeyChar() == 's'){
			getField().getPlayer().setDown(false);
		}
	}

	public void keyTyped(KeyEvent e){}

	//Constructor
	public KListener(Table T){
		setField(T);
	}

	//Getters
	public Table getField(){return field;}

	//Setters
	public void setField(Table T){field = T;}
}