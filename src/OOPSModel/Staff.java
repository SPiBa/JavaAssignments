package OOPSModel;

import java.util.*;

public class Staff {
    private static int staff_id;
    private static int age;
    private static String f_name;
    private static String l_name;
    private static String serv_module;
    private static int staffCount = 0;
    private static  int eldestAge = 0;
    private static String eldestf_name;
    private static String eldestl_name;

    public String getServ_Module() {
        return serv_Module;
    }

    private String serv_Module;

   private static Map<String,Integer> staffByModule= new HashMap<>();


    //Parametrized constructor
    public Staff(int staff_id,int age,String f_name, String l_name, String serv_Module){
        this.staff_id = staff_id;
        this.age = age;
        this.f_name = f_name;
        this.l_name = l_name;
        this.serv_Module  = serv_Module;
        staffCount = staffCount +1;

        staffByModule.put(serv_Module,staff_id);

        if (this.age > eldestAge) {
            eldestAge = this.age;
            eldestf_name = this.f_name;
            eldestl_name = this.l_name;
        }

    }
    //Print all the staff details
    public static void displayStaffDetails(){
        System.out.println("Staff id " + staff_id + "is " + f_name  + " "+ l_name + " of age " + age + " who belongs to department " + serv_module);

    }
    public static ArrayList<Staff> addDeptStaff (ArrayList<Staff> staffList,String serv_Module){
        ArrayList<Staff> deptStaff = new ArrayList<Staff>();

        for (Staff ds : staffList) {
            if (ds.getServ_Module().contains(serv_Module)) {
                deptStaff.add(ds);
            }
        }
        return deptStaff;

    }

    public static int noOfStaffPerModule(String serv_Module){
        int count = 0;
        Set set = staffByModule.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry mapElement =(Map.Entry) it.next();
            String myStr = (String) mapElement.getKey();
            if (myStr.contains(serv_Module)) {
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
