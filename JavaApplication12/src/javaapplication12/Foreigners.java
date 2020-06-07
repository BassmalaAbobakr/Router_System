package javaapplication12;
public class Foreigners extends Invoice implements Customer{

@Override
public boolean RentRouter(int reservationNo,Router myrouter,DurationType reservType,Date startDate,int Duration) {
	 return super.reservation.reserveRouter(reservationNo, myrouter, reservType, startDate, Duration);
	}


@Override
public void CancelRent() {
	super.reservation.getMyrouter().setRented(false);
}

@Override
public void ChangeModel(Model newModel) {
	super.reservation.getMyrouter().setModel(newModel);
}

@Override
public void ExtendDuration(Date Duedate)
{
    	super.reservation.setDueDate(Duedate);

}

 @Override
	public double calculateFees(Reservation reservation ) {
		int modelPrice=super.reservation.getMyrouter().getModel().getPrice();
		int durationPrice=super.reservation.getReservType().getPrice();
		super.fees= (durationPrice+(0.05*modelPrice))*reservation.getDuration();
		return this.fees;
	}

}
