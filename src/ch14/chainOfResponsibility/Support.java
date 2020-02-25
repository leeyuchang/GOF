package ch14.chainOfResponsibility;

public abstract class Support {
	private String name;
	private Support next;

	public Support(String name) {
		super();
		this.name = name;
	}

	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	public final void support(Trobule trobule) {
		if (resolve(trobule)) {
			done(trobule);
		} else if (next != null) {
			next.support(trobule);
		} else {
			fail(trobule);
		}
	}

	private void fail(Trobule trobule) {
		System.out.println(trobule + " cannot be resolved.");
	}

	private void done(Trobule trobule) {
		System.out.println(trobule + " is resplved by " + this + ".");
	}

	protected abstract boolean resolve(Trobule trobule);

}
