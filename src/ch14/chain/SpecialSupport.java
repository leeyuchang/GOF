package ch14.chain;

public class SpecialSupport extends Support{
	
	private int number;
	
	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}
	
	@Override
	protected boolean resolve(Trobule trobule) {
		if(trobule.getNumber() == number) {
			return true;
		}
		return false;
	}
}
