import java.util.HashMap;
import java.util.Map;

public class test {


    public static void main (String [] args){
        Map<String, Object> jsonMap = new HashMap<>();
        Map<String, Object> message = new HashMap<>();
        message.put("type", "text");
        Map<String, Object> properties = new HashMap<>();
        properties.put("message", message);
        jsonMap.put("properties", properties);

        System.out.println(jsonMap);
    }
}
