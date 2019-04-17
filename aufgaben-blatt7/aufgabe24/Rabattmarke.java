package programmiern2.blatt7.aufgabe24;

import java.io.Serializable;
import java.util.Date;

public class Rabattmarke implements Serializable {
    private int num;
    private String name;
    private int customerNum;
    private float rabatt;
    private Date d;

    public Rabattmarke() {
        this.d = new Date();
    }

    public Rabattmarke(int num, String name, int customerNum, float rabatt) {
        this.d = new Date();
        this.num = num;
        this.name = name;
        this.customerNum = customerNum;
        this.rabatt = rabatt;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public String toString() {
        return this.num + "\n" + this.name + ",\n" +this.customerNum + "\n" +this.rabatt + "%\n" + this.d;
    }
}
