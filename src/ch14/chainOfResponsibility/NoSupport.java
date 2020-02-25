package ch14.chainOfResponsibility;

public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trobule trobule) {
		return false;
	}

}
