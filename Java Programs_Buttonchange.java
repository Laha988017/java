import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Buttonchange.class" width="500" height="300">
</applet>
*/
public class Buttonchange extends Applet implements ActionListener{
	String msg;
	public void init(){
		Button Button_red=new Button("Red");
		Button Button_green=new Button("Green");
		Button Button_blue=new Button("Blue");
		add(Button_red);
		add(Button_green);
		add(Button_blue);
		Button_red.addActionListener(this);
		Button_green.addActionListener(this);
		Button_blue.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae){
		msg=ae.getActionCommand();
		repaint();
	}
	public void paint(Graphics g){
		if(msg=="Red")
			setBackground(Color.red);
		else if(msg=="Green")
			setBackground(Color.green);
		else
			setBackground(Color.cyan);
	}
}
