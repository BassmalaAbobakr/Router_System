package javaapplication12;
public enum DurationType {
Daily(10),
Weekly(60),
Monthly(250);
private final int price;

DurationType(int price) {
    this.price = price;
}

public int getPrice() {
    return this.price;
}
public static void main(String[] args) {

	DurationType type = DurationType.Daily;

	System.out.println(type.getPrice());
}
  }