package study0517;

import java.awt.*;

public class Study135_BorderLayout 
{
	private Frame fr;
	
	public Study135_BorderLayout(String str) 
	{
		initialize(str);
	}

	public static void main(String[] args) 
	{

		Study135_BorderLayout myfr = new Study135_BorderLayout("myframetitle");
		myfr.fr.setVisible(true);
	}
	
	private void initialize(String str)
	{
		fr = new Frame();
		Button bt1 = new Button("North");
		Button bt2 = new Button("South");
		Button bt3 = new Button("East");
		Button bt4 = new Button("West");
		Button bt5 = new Button("Center");
		
		fr.setLayout(new BorderLayout(0,0));
		fr.add(bt1,BorderLayout.NORTH);
		fr.add(bt2,BorderLayout.SOUTH);
		fr.add(bt3,BorderLayout.EAST);
		fr.add(bt4,BorderLayout.WEST);
		fr.add(bt5,BorderLayout.CENTER);
		
		fr.setSize(200,200);
	}

}
