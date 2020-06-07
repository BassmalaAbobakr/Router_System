
package javaapplication12;
public class Router {
private int  serialno;
private int noofports;
private boolean rented;

private Model model;
public Router(int serialno,int noofports,Model model) {
this.serialno=serialno;
this.noofports=noofports;

this.model=model;
this.rented=false;
}

public int getSerialno() {
	return serialno;
}

public void setSerialno(int serialno) {
	this.serialno = serialno;
}

public int getNoofports() {
	return noofports;
}

public void setNoofports(int noofports) {
	this.noofports = noofports;
}


public Model getModel() {
	return model;
}

public void setModel(Model model) {
	this.model = model;
}


public boolean isRented() {
	return rented;
}


public void setRented(boolean rented) {
	this.rented = rented;
}

/*
public static void main(String[] args) {
	Model mymodel = Model.TPLINK;
    Router myRouter = new Router(12212,122,515,mymodel);
  int price =myRouter.getPrice();
  LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56); 
  DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  String formattedDate = a.format(myFormatObj);  
  System.out.println(formattedDate); 
  
  }
   */

}
