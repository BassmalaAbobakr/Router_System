package javaapplication12;
//inheritance and interfaces
public class Residents extends Foreigners {
	
	
	
        @Override
	public double calculateFees(Reservation reservation ) {
		int modelPrice=super.reservation.getMyrouter().getModel().getPrice();
		int durationPrice=super.reservation.getReservType().getPrice();
		super.fees= (durationPrice+(0.05*modelPrice))*reservation.getDuration();
		return 0.25*super.fees;
	}
        
       

	
}

