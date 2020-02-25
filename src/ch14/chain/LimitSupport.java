package ch14.chain;

public class LimitSupport extends Support {

	private int limit;
	
	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trobule trobule) {
		if(trobule.getNumber() < limit) {
			return true;
		}
		
		return false;
	}

}
