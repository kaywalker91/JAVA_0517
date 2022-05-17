package study0517;

import java.awt.*;
import java.awt.event.*;

public class Study143_Event 
{
	public static void main(String[] ar) 
	{
		Round19_Ex02_Sub round = new Round19_Ex02_Sub();
	}
}

class Round19_Ex02_Sub extends Frame implements ActionListener 
{
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("���ǥ�� : ���� ���� ��ư�� �����ϴ�.", Label.CENTER);

	private Button bt = new Button("��ư 1");

	private Button bt1 = new Button("��ư 2");

	public Round19_Ex02_Sub() 
	{
		super();
		
		this.init();
		this.start();
		this.setSize(300, 200);
		// this.pack();
		
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		
		this.setVisible(true);
	}

	public void init() 
	{
		// ȭ�� ���� ���� �κ�
		BorderLayout border = new BorderLayout();
		this.setLayout(border);

		Panel p = new Panel();
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		p.setLayout(gridbag);

		gc.insets = new Insets(0, 0, 0, 10);
		gridbag.setConstraints(bt, gc);
		p.add(bt);

		gc.insets = new Insets(0, 10, 0, 0);
		gridbag.setConstraints(bt1, gc);
		p.add(bt1);

		this.add("North", lb);
		this.add("Center", p);
	}

	public void start() 
	{
		// Event�� ������ ó���� �κ�
		bt.addActionListener(this);
		bt1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource() == bt)
		{
			System.out.println("��ư1����!!");//�ܼ�â�� ǥ��
			lb.setText("���ǥ��: ��ư1����!!!");//������â��ǥ��
		}
		else if(e.getSource() == bt1)
		{
			System.out.println("��ư2����!!");//�ܼ�â�� ǥ��
			lb.setText("���ǥ��: ��ư2����!!!");//������â��ǥ��
		}
	}
}

