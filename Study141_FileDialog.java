package study0517;

import java.awt.*;

public class Study141_FileDialog {
	public static void main(String[] ar) {
		Round18_Ex14_Sub round = new Round18_Ex14_Sub();
	}
}

class Round18_Ex14_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("directory = ");

	private Label lb1 = new Label("file = ");

	private FileDialog fdlg = new FileDialog(this, "�����Ͽ���", FileDialog.LOAD);

	public Round18_Ex14_Sub() {
		super("���� ���̾�α�");
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

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ee) {
		}
		fdlg.setVisible(true);
		String dir = fdlg.getDirectory();
		String file = fdlg.getFile();
		lb.setText(lb.getText().trim() + dir);
		lb1.setText(lb1.getText().trim() + file);
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		this.setLayout(gridbag);

		lb.setBackground(Color.yellow);
		lb1.setBackground(Color.yellow);

		gc.weightx = 1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridwidth = GridBagConstraints.REMAINDER;
		gc.insets = new Insets(0, 0, 10, 0);
		gridbag.setConstraints(lb, gc);
		this.add(lb);

		gridbag.setConstraints(lb1, gc);
		this.add(lb1);
	}

	public void start() {
		// �̺�Ʈ�� ������ ó���� �κ�
	}
}
