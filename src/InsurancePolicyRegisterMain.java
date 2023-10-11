import java.util.ArrayList;

import model.Address;
import model.Car;
import model.InsurancePolicyRegister;
import model.InsurancePolicy;
import model.Person;


public class InsurancePolicyRegisterMain {
    public static void main(String[] args) throws Exception {
    Address address = new Address();
    address.addNewAddress();
    address.addNewAddress("AA","AB","Boston","Za","US","AC","AD","Los","Za","US","AE","AF","WA","Za","US");
    address.addNewAddress("BA","BB","Boston","Za","US","BC","BD","Los","Za","US","BE","BF","WA","Za","US");
    address.addNewAddress("CA","CB","Boston","Za","US","CC","CD","Los","Za","US","CE","CF","WA","Za","US");
    

    Car newCar1 = new Car("aa", "blu", "max", 2020);
    Car newCar2 = new Car("bb", "red", "max", 2021);
    Car newCar3 = new Car("cc", "yel", "max", 2022);
    
    ArrayList<Car> carlist = new ArrayList<>(); 
    
    carlist.add(newCar1);
    carlist.add(newCar2);
    carlist.add(newCar3);



    Person person1 = new Person("Sandy", "Lu", "48", "5252",);
    Person person2 = new Person("Tom", "Li", "48", "5252",);
    
    
    System.out.printIn(InsurancePolicy.tostring());

   

 


    }

}
