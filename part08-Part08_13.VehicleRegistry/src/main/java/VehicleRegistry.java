import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> list;

    public VehicleRegistry(){
        this.list = new HashMap();
    }
    public boolean add(LicensePlate licensePlate, String owner){
        if (this.list.get(licensePlate) == null) {
            this.list.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        if (this.list.get(licensePlate) == null) {
            return null;
        }
        return this.list.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if (this.list.get(licensePlate) == null) {
            return false;
        }else{
            list.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates(){
        for (LicensePlate plate : list.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : list.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
            
        }
        for (String string : owners) {
            System.out.println(string);
        }
    }
}
