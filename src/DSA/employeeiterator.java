package DSA;

import java.util.*;

class MyEmployee {

    int empid;
    String empname;

    public MyEmployee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public int getempid() {
        return empid;
    }

    public String getempname() {
        return empname;
    }

    public void setempid(int empid) {
        this.empid = empid;
    }

    public void setempname(String empname) {
        this.empname = empname;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + "]";
    }
}

public class employeeiterator {

    public static void main(String[] args) {

        ArrayList<MyEmployee> al = new ArrayList<>();

        al.add(new MyEmployee(123, "pavan"));
        al.add(new MyEmployee(734, "venkat"));
        al.add(new MyEmployee(567, "lalith"));
        al.add(new MyEmployee(899, "alluarjun"));

        for (MyEmployee e : al) {
            System.out.println(e.getempid() + " " + e.getempname());
        }
    }
}