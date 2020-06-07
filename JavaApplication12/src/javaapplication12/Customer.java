package javaapplication12;
public interface Customer {
public void CancelRent();
public boolean RentRouter(int reservationNo,Router myrouter,DurationType reservType,Date startDate, int Duration);
public void ExtendDuration(Date DueDate );
public void ChangeModel(Model newModel);

}
