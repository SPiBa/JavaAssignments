package OOPSModel;

import java.util.ArrayList;

public class Lab {
    String deptCode;
    ArrayList<Furniture> furniture;
    ArrayList<Staff> staff;


    public Lab (String deptCode, ArrayList<Furniture> furniture, ArrayList<Staff> staff) {
        this.deptCode = deptCode;
        this.furniture = furniture;
        this.staff = staff;

    }
}
