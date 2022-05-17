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
		super("제목 넣기 - Test");
		
		this.init(); // 24라인의	NM() Method 호출
		this.start(); // 27라인의 start() Method 호출
		this.setSize(300, 200); // 현재 프레임 화면의 크기 지정
		
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos); // 현재 프레임의 중앙 배치
		
		this.setVisible(true); // 현재 프레임을 화면상에 나타나게 함.
	}

	public void init() 
	{
		// 화면 구성 넣을 부분
		this.setLayout(null);
		lb.setBackground(Color.green);
		this.add(lb);
		lb.setBounds(50, 50, 80, 80);
		//Label의 윈도창 안에서의 가로,세로 좌표와 가로,세로 길이
	}

	public void start() 
	{
		// 이벤트나 Thread 처리할 부분
	}
}
