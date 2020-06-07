package javaapplication12;
public class Invoice {
	public Reservation reservation;
    public double fees;
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	//this function is used to calculate the fees by taking 5% form the model price and adding to it the duration price
	public double calculateFees(Reservation reservation ) {
		int modelPrice=this.reservation.getMyrouter().getModel().getPrice();
		int durationPrice=this.reservation.getReservType().getPrice();
		this.fees= (durationPrice+(0.05*modelPrice))*reservation.getDuration();
		return this.fees;
	}

	public void printInvoice() {
		System.out.println("SN "+ this.reservation.getMyrouter().getSerialno()); 	
		System.out.println("ReservationNo "+this.reservation.getReservationNo()); 
		System.out.println("Renting fees "+this.fees); 
	
	}
	
}

