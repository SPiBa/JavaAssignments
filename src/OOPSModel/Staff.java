package OOPSModel;

import java.util.*;

public class Staff {
    private  int staff_id;
    private  int age;
    private  String f_name;
    private  String l_name;
    private  String facility;
    private static int staffCount = 0;
    private static  int eldestAge = 0;
    private static String eldestf_name;
    private static String eldestl_name;

    public String getFacility() {
        return facility;
    }

   private static Map<String,Integer> staffByModule= new HashMap<>();


    //Parametrized constructor
    public Staff(int staff_id,int age,String f_name, String l_name, String facility){
        this.staff_id = staff_id;
        this.age = age;
        this.f_name = f_name;
        this.l_name = l_name;
        this.facility = facility;
        staffCount = staffCount +1;

        staffByModule.put(facility,staff_id);

        if (this.age > eldestAge) {
            eldestAge = this.age;
            eldestf_name = this.f_name;
            eldestl_name = this.l_name;
        }

    }
    //Print all the staff details
    public void displayStaffDetails(){
        System.out.println("Staff ID" + staff_id + "is " + f_name  + ", "+ l_name + " of age " + age + " who works in the " + facility + " facility.");

    }
    public static ArrayList<Staff> addDeptStaff (ArrayList<Staff> staffList,String facility){
        ArrayList<Staff> deptStaff = new ArrayList<Staff>();

        for (Staff ds : staffList) {
            if (ds.getFacility().contains(facility)) {
                deptStaff.add(ds);
            }
        }
        return deptStaff;

    }

    public static int noOfStaffPerModule(String facility){
        int count = 0;
        Set set = staffByModule.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry mapElement =(Map.Entry) it.next();
            String myStr = (String) mapElement.getKey();
            if (myStr.contains(facility)) {
                count = count + 1;
            }
        }
        return count;
    }


    public static void printTotalStaffCount(){
        System.out.println("The total number of staff in the college are " + staffCount);
    }

    public static void printEldestStaff(){
        System.out.println("The eldest staff in the college is " + eldestf_name + " " + eldestl_name + " of age " + eldestAge + " years." );
    }

}
