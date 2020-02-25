package ch19.state;

public class NightState implements State {

	private static NightState singleton = new NightState();

	private NightState() {
	}

	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		if (hour >= 9 || hour < 17) {
			context.chageState(DayState.GetInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.callSecurityCenter("非常：夜間の銀行使用");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("非常ベル（夜間）");
	}

	@Override
	public void doPhone(Context context) {
		context.recordLog("夜間の通話録音");
	}

	public String toString() {
		return "[夜間]";
	}
}
