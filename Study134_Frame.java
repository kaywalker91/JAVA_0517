package study0517;

import java.awt.*;

public class Study134_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Round17_Ex04_Sub round = new Round17_Ex04_Sub();

	}

}

class Round17_Ex04_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("AAA");

	private Label lb1 = new Label("BBB");

	private Label lb2 = new Label("CCC");

	private Label lb3 = new Label("DDD");

	private Label lb4 = new Label("EEE");

	private Label lb5 = new Label("FFF");

	private Label lb6 = new Label("GGG");

	private Label lb7 = new Label("HHH");

	private Label lb8 = new Label("III");

	private Label lb9 = new Label("JJJ");

	public Round17_Ex04_Sub() {
		super();
		this.init();
		this.start();
		// this.setSize(300, 200);
		this.pack(); // �� Frame�� JVM�� ���ϴ� ũ�⿡ �����.
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		lb.setBackground(Color.yellow);
		lb1.setBackground(Color.yellow);
		lb2.setBackground(Color.yellow);
		lb3.setBackground(Color.yellow);
		lb4.setBackground(Color.yellow);
		lb5.setBackground(Color.yellow);
		lb6.setBackground(Color.yellow);
		lb7.setBackground(Color.yellow);
		lb8.setBackground(Color.yellow);
		lb9.setBackground(Color.yellow);

		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		this.setLayout(gridbag);

		// �۾� ���� ����
		this.add(lb);
		this.add(lb1);
		this.add(lb2);
		this.add(lb3);
		this.add(lb4);
		this.add(lb5);

		// �۾� ���� ��
	}

	public void start() {
		// �̺�Ʈ�� Thread ó���� �κ�
	}
}
