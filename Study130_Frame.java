package study0517;

import java.awt.*;

public class Study130_Frame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.setSize(700, 500);
		//����,���� 700,500�������� ������â�� �����ϴ� �ڵ�
		
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen1 = f.getSize();
		int xpos = (int)(dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		int ypos = (int)(dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		f.setLocation(xpos, ypos);//������â�� ��ġ�� ����� �������ִ� �ڵ�
		
		System.out.println("ȭ���ػ� ���� �� ����:"+dimen.getWidth());
		System.out.println("ȭ���ػ� ���� �� ����:"+dimen.getHeight());
		System.out.println("������â ���� �� ����:"+dimen1.getWidth());
		System.out.println("������â ���� �� ����:"+dimen1.getHeight());
		
		f.setVisible(true);//ȭ�鿡 ������â�� �����ִ� �ڵ�
	}
}
