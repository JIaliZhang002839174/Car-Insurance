package model;

public class Address {
    String HLine1;
    String HLine2;
    String HCity;
    String HZip;
    String HState;

    String WLine1;
    String WLine2;
    String WCity;
    String WZip;
    String WState;

    String LLine1;
    String LLine2;
    String LCity;
    String LZip;
    String LState;

    public Address(String HL1,String HL2,String HC,String HZ,String HS,String WL1,String WL2,String WC,String WZ,String WS,String LL1,String LL2,String LC,String LZ,String LS){
        HLine1 = HL1;
        HLine2 = HL2;
        HCity = HC;
        HZip = HZ;
        HState = HS;

        WLine1 = WL1;
        WLine2 = WL2;
        WCity = WC;
        WZip = WZ;
        WState = WS;

        LLine1 = LL1;
        LLine2 = LL2;
        LCity = LC;
        LZip = LZ;
        LState = LS;
    }

    public Address(){
    }


public String getHLine1() {
    return HLine1;
}


public void setHLine1(String hLine1) {
    HLine1 = hLine1;
}


public String getHLine2() {
    return HLine2;
}


public void setHLine2(String hLine2) {
    HLine2 = hLine2;
}


public String getHCity() {
    return HCity;
}


public void setHCity(String hCity) {
    HCity = hCity;
}


public String getHZip() {
    return HZip;
}


public void setHZip(String hZip) {
    HZip = hZip;
}


public String getHState() {
    return HState;
}


public void setHState(String hState) {
    HState = hState;
}


public String getWLine1() {
    return WLine1;
}


public void setWLine1(String wLine1) {
    WLine1 = wLine1;
}


public String getWLine2() {
    return WLine2;
}


public void setWLine2(String wLine2) {
    WLine2 = wLine2;
}


public String getWCity() {
    return WCity;
}


public void setWCity(String wCity) {
    WCity = wCity;
}


public String getWZip() {
    return WZip;
}


public void setWZip(String wZip) {
    WZip = wZip;
}


public String getWState() {
    return WState;
}


public void setWState(String wState) {
    WState = wState;
}


public String getLLine1() {
    return LLine1;
}


public void setLLine1(String lLine1) {
    LLine1 = lLine1;
}


public String getLLine2() {
    return LLine2;
}


public void setLLine2(String lLine2) {
    LLine2 = lLine2;
}


public String getLCity() {
    return LCity;
}


public void setLCity(String lCity) {
    LCity = lCity;
}


public String getLZip() {
    return LZip;
}


public void setLZip(String lZip) {
    LZip = lZip;
}


public String getLState() {
    return LState;
}


public void setLState(String lState) {
    LState = lState;
}
public void printInformation(){
    System.out.println("HomeAddress" + " " + HLine1 + " " + HLine2 + " " + HCity + " " + HZip + " " + HState + " " + "WorkAddress" + " " + WLine1 + " " + WLine2 + " " + WCity + " " + WZip + " " + WState + " " + "LocalAddress"  + " " + LLine1 + " " + LLine2 + " " + LCity + " " + LZip + " " + LState); 
}

public void addNewAddress() {
}

public void addNewAddress(String string, String string2, String string3, String string4, String string5, String string6,
        String string7, String string8, String string9, String string10, String string11, String string12,
        String string13, String string14, String string15) {
}

public void printAddressList() {
}
}
