package model;

public class InsurancePolicy {
    Person HolderList;
    Person Seconddriver;
    String AmountOfPremium;
    String StartDate;
    String EndDate;
    Car carList;
    String MaximumCoverageLimit;

    public InsurancePolicy(Person Ho,Person sn, String p, String s, String e, Car ca,String mx){
HolderList = Ho;
Seconddriver = sn;
AmountOfPremium = p;
StartDate = s;
EndDate = e;
carList = ca;
MaximumCoverageLimit = mx;
}

    public Person getHolderList() {
        return HolderList;
    }


    public void setHolderList(Person holderList) {
        HolderList = holderList;
    }


    public Person getSeconddriver() {
        return Seconddriver;
    }


    public void setSeconddriver(Person seconddriver) {
        Seconddriver = seconddriver;
    }


    public String getAmountOfPremium() {
        return AmountOfPremium;
    }


    public void setAmountOfPremium(String amountOfPremium) {
        AmountOfPremium = amountOfPremium;
    }


    public String getStartDate() {
        return StartDate;
    }


    public void setStartDate(String startDate) {
        StartDate = startDate;
    }


    public String getEndDate() {
        return EndDate;
    }


    public void setEndDate(String endDate) {
        EndDate = endDate;
    }


    public Car getCarList() {
        return carList;
    }


    public void setCarList(Car carList) {
        this.carList = carList;
    }


    public String getMaximumCoverageLimit() {
        return MaximumCoverageLimit;
    }


    public void setMaximumCoverageLimit(String maximumCoverageLimit) {
        MaximumCoverageLimit = maximumCoverageLimit;
    }


    


    public void printInformation(){
        System.out.println(HolderList + " " + Seconddriver + " " + AmountOfPremium + " " + StartDate + " " + EndDate + " " + carList + " " + MaximumCoverageLimit);
    }

    public static Object tostring() {
        return null;
    }
}



    


