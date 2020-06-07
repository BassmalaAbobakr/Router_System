package javaapplication12;
public class Reservation {
	private int reservationNo;
	private Router myrouter ;
	private DurationType reservType;
        private int Duration;

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }
	private	Date startDate;
	private Date dueDate;
	public Router getMyrouter() {
		return myrouter;
	}
	public boolean reserveRouter(int reservationNo,Router myrouter,DurationType reservType,Date startDate, int Duration) {
		if (myrouter.isRented()==false) {
			this.reservationNo=reservationNo;
			
			this.reservType=reservType;
			this.startDate=startDate;
			this.myrouter=myrouter;
			myrouter.setRented(true);
                        CalculateDueDate(startDate,reservType ,Duration,this.dueDate);
			return true;
		}
		else {
			return false;
		}
	}
        //Static method
        public static void CalculateDueDate(Date startDate,DurationType reservType , int Duration, Date dueDate){
            if (reservType==DurationType.Daily){
                dueDate.day=startDate.day+Duration;
            }
            else if(reservType==DurationType.Monthly){
                dueDate.month=startDate.month+Duration;
            }
            else if(reservType==DurationType.Weekly){
                dueDate.day=(startDate.day+Duration)*7;

            }
        }
	public void setMyrouter(Router myrouter) {
		this.myrouter = myrouter;
	}
	public int getReservationNo() {
		return reservationNo;
	}
	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}
	public DurationType getReservType() {
		return reservType;
	}
	public void setReservType(DurationType reservType) {
		this.reservType = reservType;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
}

