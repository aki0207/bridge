package bridge;

public class CharDisplayImpl extends DisplayImpl {
	private String firstLetter;
	private String decoration;
	private String lastLetter;

	public CharDisplayImpl(String firstLetter, String decoration, String lastLetter) {
		this.firstLetter = firstLetter;
		this.decoration = decoration;
		this.lastLetter = lastLetter;
	}

	@Override
	public void rawOpen() {
		System.out.print(firstLetter);
	}

	@Override
	public void rawPrint() {
		System.out.print(decoration);
	}

	@Override
	public void rawClose() {
		System.out.println(lastLetter);
	}


}
