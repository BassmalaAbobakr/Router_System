package javaapplication12;
//enumerated class
public enum Model {
ADSL(300) ,
TPLINK(400),
TEDATA(500);

	private final int price;

	Model(int price) {
	    this.price = price;
	}

	public int getPrice() {
	    return this.price;
	}
}
