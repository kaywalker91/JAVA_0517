package study0517;

import java.awt.*;

public class Study136_FlowLayout 
{
	private Frame fr;
	
	public Study136_FlowLayout(String str) 
	{
		initialize(str);
	}

	public static void main(String[] args) {

		Study136_FlowLayout myfr = new Study136_FlowLayout("myframetitle");
		myfr.fr.setVisible(true);

	}
	
	private void initialize(String str)
	{
		fr = new Frame();
		Button bt1 = new Button("North");
		Button bt2 = new Button("South");
		Button bt3 = new Button("East");
		Button bt4 = new Button("West");
		
		fr.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		fr.add(bt1,BorderLayout.NORTH);
		fr.add(bt2,BorderLayout.SOUTH);
		fr.add(bt3,BorderLayout.EAST);
		fr.add(bt4,BorderLayout.WEST);
		
		fr.setSize(200,200);
	}

}
