package ch17.observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

	private static NumberGenerator numberGenerator = new RandomNumberGenerator();
	
	public static NumberGenerator getInstance() {
		return numberGenerator;
	}
	
	private RandomNumberGenerator() {}
	
	private Random random = new Random();

	private int number;

	@Override
	int getNumber() {
		return number;
	}

	@Override
	void execute() {

		for (int i = 0; i < 20; i++) {
			number = random.nextInt(20);
			noticeAll();
		}
	}

}
