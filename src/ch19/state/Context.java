package ch19.state;

public interface Context {
	void setClock(int hour);
	void chageState(State state);
	void callSecurityCenter(String msg);
	void recordLog(String msg);
}
