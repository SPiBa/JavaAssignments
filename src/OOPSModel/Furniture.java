package OOPSModel;

import java.util.ArrayList;

public class Furniture {
    private int id;
    private String type; //Chair, Table, Rack
    private String material; //wooden, iron

    public String getServ_module() {
        return this.serv_module;
    }

    private String serv_module; //Library,Lab,MusicRoom,Class
    private static int noOfChairs;

    public Furniture(int id, String type, String material,String serv_module ){
        this.id = id;
        this.type = type;
        this.material = material;
        this.serv_module = serv_module;

        if (type == "Chair")
            noOfChairs = noOfChairs + 1;
    }

    //Print all the furniture details
    public void displayFurnitureDetails(){
        System.out.println("For furtinure id " + this.id + "- type is " + type  + ", material is "+ material + " and belongs to service module" + serv_module);

    }

    public static ArrayList<Furniture> addDeptFurniture (ArrayList<Furniture> furnitureList,String serv_Module){
        ArrayList<Furniture> deptFurniture = new ArrayList<Furniture>();

        for (Furniture deptFurn : furnitureList) {
            if (deptFurn.getServ_module().contains(serv_Module)) {
                deptFurniture.add(deptFurn);
            }
        }
        return deptFurniture;

    }



    public static void displayTotalNoOfChairs(){
        System.out.println("The total number of chairs in the college are " + noOfChairs);
    }

}
