package javaapplication12;
import java.util.ArrayList;
public class JavaApplication12 {
public static void main(String[] args) {
//initializing an array of routers		
ArrayList<Router> routers=new ArrayList<Router>();
Model model1 = Model.TPLINK;
Model model2 = Model.ADSL;
Model model3 = Model.TEDATA;

routers.add(new Router(12121,7,model1));
routers.add(new Router(12551,8,model2));
routers.add(new Router(11515,10,model3));

// initializing array list of customers
ArrayList<Foreigners> foreigner=new ArrayList<Foreigners>();
foreigner.add( new Foreigners());
foreigner.add(new Foreigners() );
foreigner.add(new Residents() );
    Date date1= new Date(5,5);
    Date date2= new Date(10,9);
    Date date3= new Date(10,5);

foreigner.get(0).RentRouter(1, routers.get(0), DurationType.Daily, date1, 2);
//foreigner.get(0).printInvoice();
//customers.get(1).RentRouter(2, routers.get(1), DurationType.Weekly, 5);
//customers.get(2).RentRouter(3, routers.get(2), DurationType.Monthly, date3,);

	}
}