package mpihaino;

import java.awt.event.*;
import java.awt.*;
import assets.*;

public class ActListener implements ActionListener{
	Table field;

	//Override Method
	public void actionPerformed(ActionEvent e){
		double speed = 5;
		if(getField().getPlayer().getUp()){
			getField().getPlayer().moveY(-speed);
			getField().getFenetre().repaint();
		}
		if(getField().getPlayer().getDown()){
			getField().getPlayer().moveY(speed);
			getField().getFenetre().repaint();
		}
	}

	//Constructor
	public ActListener(Table P){
		setField(P);
	}

	//Getters
	public Table getField(){return field;}

	//Setters
	public void setField(Table T){field = T;}
}