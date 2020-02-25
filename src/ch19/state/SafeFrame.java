package ch19.state;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context{
	
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10, 60);
	private Button btnUse = new Button("銀行使用");
	private Button btnAlarm = new Button("非常ベル");
	private Button btnPhone = new Button("通常通話");
	private Button btnExit = new Button("終了");
	
	private State state = DayState.GetInstance();
	
	@SuppressWarnings("deprecation")
	public SafeFrame(String title) {
		super(title);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		add(textScreen, BorderLayout.CENTER);
		Panel panel = new Panel();
		panel.add(btnUse);
		panel.add(btnAlarm);
		panel.add(btnPhone);
		panel.add(btnExit);
		add(panel, BorderLayout.SOUTH);
		pack();
		show();
		btnUse.addActionListener(this);
		btnAlarm.addActionListener(this);
		btnPhone.addActionListener(this);
		btnExit.addActionListener(this);
	}

	@Override
	public void setClock(int hour) {
		String clockstring = "現在時刻は";
		if(hour < 10) {
			clockstring += "0" + hour + ":00";
		} else {
			clockstring += hour + ":00";
		}
		System.out.println(clockstring);
		textClock.setText(clockstring);
		state.doClock(this, hour);
	}

	@Override
	public void chageState(State state) {
		System.out.println(this.state + "から" + state + "へ状態が変化しました。");
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("call!" + msg + "\n");
	}

	@Override
	public void recordLog(String msg) {
		textScreen.append("record..." + msg + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		
		if(e.getSource() == btnUse) {
			state.doUse(this);
		} else if(e.getSource() == btnAlarm) {
			state.doAlarm(this);
		} else if(e.getSource() == btnPhone) {
			state.doPhone(this);
		} else if(e.getSource() == btnExit) {
			System.exit(0);
		} else {
			System.out.println("?");
		}
	}
	
}
