package study0517;

import java.awt.*;

public class Study131_Frame 
{

	public static void main(String[] args) 
	{
		Round17_Ex02_Sub round = new Round17_Ex02_Sub();
	}

}

class Round17_Ex02_Sub extends Frame 
{
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("Test");

	public Round17_Ex02_Sub() 
	{
		super("���� �ֱ� - Test");
		
		this.init(); // 24������	NM() Method ȣ��
		this.start(); // 27������ start() Method ȣ��
		this.setSize(300, 200); // ���� ������ ȭ���� ũ�� ����
		
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos); // ���� �������� �߾� ��ġ
		
		this.setVisible(true); // ���� �������� ȭ��� ��Ÿ���� ��.
	}

	public void init() 
	{
		// ȭ�� ���� ���� �κ�
		this.setLayout(null);
		lb.setBackground(Color.green);
		this.add(lb);
		lb.setBounds(50, 50, 80, 80);
		//Label�� ����â �ȿ����� ����,���� ��ǥ�� ����,���� ����
	}

	public void start() 
	{
		// �̺�Ʈ�� Thread ó���� �κ�
	}
}
