package model;

import java.util.ArrayList;

public class Person {
    String FirstName;
String LastName;
String DateOfBirth;
String SocialSecurityNumber;
Address AddressList;

public String getFirstName() {
    return FirstName;
}

public void setFirstName(String firstName) {
    FirstName = firstName;
}

public String getLastName() {
    return LastName;
}

public void setLastName(String lastName) {
    LastName = lastName;
}

public String getDateOfBirth() {
    return DateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
    DateOfBirth = dateOfBirth;
}

public String getSocialSecurityNumber() {
    return SocialSecurityNumber;
}

public void setSocialSecurityNumber(String socialSecurityNumber) {
    SocialSecurityNumber = socialSecurityNumber;
}

public Address getAddressList() {
    return AddressList;
}

public void setAddressList(Address addressList) {
    AddressList = addressList;
}

public Person(String FN, String LN, String Br, String SSN, Address Ad){
    FirstName = FN;
    LastName = LN;
    DateOfBirth = Br;
    SocialSecurityNumber = SSN;
   
}
public void printInformation(){
    System.out.println(FirstName + LastName + DateOfBirth + SocialSecurityNumber + AddressList);
}
}



