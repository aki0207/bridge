package bridge;

import java.util.Random;

public class RandomCountDiplay extends Display{
	public RandomCountDiplay(DisplayImpl impl) {
		super(impl);
	}

	public void randomDisplay(int times) {
		Random rand = new Random();
	    int loopCount = rand.nextInt(times);
	    open();
	    for (int i = 0; i <loopCount; i++) {
	    	print();
	    }
	    close();
	}
}
