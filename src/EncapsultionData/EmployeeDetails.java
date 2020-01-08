package EncapsultionData;

import java.util.Date;

public class EmployeeDetails

{

    private int eId;
    private Date dob;
    private String eName;
    private String address;

    public int geteId() {
        return eId;
    }

    public Date getDob() {
        return dob;
    }

    public String geteName() {
        return eName;
    }

    public String getAddress() {
        return address;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
