package model;

import java.util.ArrayList;

public class Car {
    String VIN;
String Make;
String Model;
String Year;

public Car(String v, String ma, String mo, String year2){
    VIN = v;
    Make = ma;
    Model = mo;
    Year = year2;
}
public Car(){
}

public Car(String v, String ma, String mo, int i) {
}
public String getVIN() {
    return VIN;
}
public void setVIN(String vIN) {
    VIN = vIN;
}
public String getMake() {
    return Make;
}
public void setMake(String make) {
    Make = make;
}
public String getModel() {
    return Model;
}
public void setModel(String model) {
    Model = model;
}
public String getYear() {
    return Year;
}
public void setYear(String year) {
    Year = year;
} 

public class InsurancePolicy {
    ArrayList<Car> carList;
    
    public InsurancePolicy() {
        carList = new ArrayList<Car>();
    }

    public Car addNewFaculty(String VIN,String Make,String Model,String Year){
        Car newCar = new Car(VIN,Make,Model,Year);
        carList.add(newCar);
        return newCar;
    }

public void printInformation(){
    System.out.println(VIN + " " + Make + " " + Model + " " + Year);
}
}
}
