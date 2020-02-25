package ch14.chainOfResponsibility;

public class OddSupport extends Support {

	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trobule trobule) {
		if (trobule.getNumber() % 2 == 1) {
			return true;
		}
		return false;
	}

}
