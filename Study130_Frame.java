package study0517;

import java.awt.*;

public class Study130_Frame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.setSize(700, 500);
		//가로,세로 700,500사이즈의 윈도우창을 생성하는 코드
		
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen1 = f.getSize();
		int xpos = (int)(dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		int ypos = (int)(dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		f.setLocation(xpos, ypos);//윈도우창의 위치를 가운데로 지정해주는 코드
		
		System.out.println("화면해상도 가로 총 길이:"+dimen.getWidth());
		System.out.println("화면해상도 세로 총 길이:"+dimen.getHeight());
		System.out.println("윈도우창 가로 총 길이:"+dimen1.getWidth());
		System.out.println("윈도우창 세로 총 길이:"+dimen1.getHeight());
		
		f.setVisible(true);//화면에 윈도우창을 보여주는 코드
	}
}
