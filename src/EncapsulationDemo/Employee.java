package EncapsulationDemo;

import java.util.Date;

public class Employee {

    private int eID;
    private  String eName;
    private  String EAddress;
    private Date eDOB;

    public int geteID() {
        return eID;
    }

    public String geteName() {
        return eName;
    }

    public String getEAddress() {
        return EAddress;
    }

    public Date geteDOB() {
        return eDOB;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setEAddress(String EAddress) {
        this.EAddress = EAddress;
    }

    public void seteDOB(Date eDOB) {
        this.eDOB = eDOB;
    }
}
