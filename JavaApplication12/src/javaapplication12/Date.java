package javaapplication12;
public class Date {
  public int day;
  public int month;
  public final int MinDay =1;
  public final int MaxDay =30;
  public final int MinMon =1;
  public final int MaxMon =12;
  //handle exception   
  public Date(int d,int m){
           if(d>=MinDay && d<=MaxDay) {
            
               this.day=d;
            }
           else {
           throw new ArithmeticException("Invalid date, please insert another valid one :)"); 
           }
         if(m>=MinMon && m<=MaxMon)
        {
            this.month=m;
        }
         else {
           throw new ArithmeticException("Invalid date, please insert another valid one :)"); 
           }
       }
public static void main(String[] args) {
    Date date= new Date(0,11);
  System.out.println(date.day); 
    System.out.println(date.month); 

}
}