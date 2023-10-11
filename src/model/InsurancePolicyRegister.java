package model;

import java.util.ArrayList;


public class InsurancePolicyRegister {
    ArrayList<InsurancePolicy> facultyList;
    
    public InsurancePolicyRegister() {
        new ArrayList<InsurancePolicy>();
    }

    public InsurancePolicy addNewFaculty(Person HolderList,Person Seconddriver,String AmountOfPremium,String StartDate,String EndDate,Car carList,String MaximumCoverageLimit){
        InsurancePolicy newFaculty = new InsurancePolicy(HolderList,Seconddriver,AmountOfPremium,StartDate,EndDate,carList,MaximumCoverageLimit);
        facultyList.add(newFaculty);
        return newFaculty;
    }

    public void removeFaculty(int index){
        facultyList.remove(index);
    }

    public void clearAllElements(){
        facultyList.clear();
    }
}

    
  

