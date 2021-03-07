package OOPSModel;

import java.util.ArrayList;

public class MusicRoom {
    String deptCode;
    ArrayList<Furniture> furniture;
    ArrayList<Staff> staff;


    public MusicRoom (String deptCode, ArrayList<Furniture> furniture, ArrayList<Staff> staff) {
        this.deptCode = deptCode;
        this.furniture = furniture;
        this.staff = staff;

    }
}
