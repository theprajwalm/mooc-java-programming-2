import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    HashMap <String, ArrayList<String>> storageList;
    public StorageFacility(){
        this.storageList = new HashMap();
    }
    
    public void add(String unit, String item){
        this.storageList.putIfAbsent(unit, new ArrayList<>());
        this.storageList.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        this.storageList.putIfAbsent(storageUnit, new ArrayList<>());
        return this.storageList.get(storageUnit); 
    }

    public void remove(String storageUnit, String item){
        if (this.storageList.get(storageUnit).isEmpty()) {
            this.storageList.remove(storageUnit);
        }
        else{
            for (String itemInsideStorageUnit : this.storageList.get(storageUnit)) {
                if (itemInsideStorageUnit.equals(item)) {
                    this.storageList.get(storageUnit).remove(item);
                    break;
                }
            }
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> listOfStorageUnit = new ArrayList<>();

        for (String string : storageList.keySet()) {
            if (!this.storageList.get(string).isEmpty()) {
                listOfStorageUnit.add(string);
            }
        }
        return listOfStorageUnit;
    }
}