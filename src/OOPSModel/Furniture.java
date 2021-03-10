package OOPSModel;

import java.util.ArrayList;

public class Furniture {
    private int id;
    private String type; //Chair, Table, Rack
    private String material; //wooden, iron

    public String getFacility() {
        return this.facility;
    }

    private String facility; //Library,Lab,MusicRoom,Class
    private static int noOfChairs;

    public Furniture(int id, String type, String material,String facility ){
        this.id = id;
        this.type = type;
        this.material = material;
        this.facility = facility;

        if (type == "Chair")
            noOfChairs = noOfChairs + 1;
    }

    //Print all the furniture details
    public void displayFurnitureDetails(){
        System.out.println("Furniture " + id + "- " + type  + ", material - "+ material + " belongs to facility " + facility);

    }

    public static ArrayList<Furniture> addDeptFurniture (ArrayList<Furniture> furnitureList,String facility){
        ArrayList<Furniture> deptFurniture = new ArrayList<Furniture>();

        for (Furniture deptFurn : furnitureList) {
            if (deptFurn.getFacility().contains(facility)) {
                deptFurniture.add(deptFurn);
            }
        }
        return deptFurniture;

    }


    public static void displayTotalNoOfChairs(){
        System.out.println("The total number of chairs in the college are " + noOfChairs);
    }

}
