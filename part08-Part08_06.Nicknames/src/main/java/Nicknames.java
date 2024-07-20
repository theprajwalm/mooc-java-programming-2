
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> hashList = new HashMap<>();

        hashList.put("matthew", "matt");
        hashList.put("michael","mix");
        hashList.put("arthur", "artie");

        System.out.println(hashList.get("arthur"));
    }

}
