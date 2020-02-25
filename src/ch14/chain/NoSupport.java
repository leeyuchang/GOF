package ch14.chain;

public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trobule trobule) {
		return false;
	}

}
