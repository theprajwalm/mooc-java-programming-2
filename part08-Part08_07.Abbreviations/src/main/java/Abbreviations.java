import java.util.HashMap;

public class Abbreviations{
    HashMap<String, String> abbreviationList;

    public Abbreviations(){
        abbreviationList = new HashMap<>();
    }

    public boolean hasAbbreviation(String abbreviation){
        if (abbreviationList.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public void addAbbreviation(String abbreviation, String explanation){
        if (!hasAbbreviation(abbreviation)) {
            abbreviationList.put(abbreviation, explanation);
        }
    }

    public String findExplanationFor(String abbreviation){
        if (hasAbbreviation(abbreviation)) {
            return abbreviationList.get(abbreviation);
        }
        return null;
    }
}