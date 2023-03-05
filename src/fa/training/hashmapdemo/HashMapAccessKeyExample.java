package fa.training.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Examples of how to access key from HashMap
 *
 * @author SonDT21
 */

public class HashMapAccessKeyExample {

    /**
     * Access keys from HashMap
     *
     */
    public void accessKeys() {
        System.out.println("accessKeys() !!!");
        Map<String, String> userCityMapping = new HashMap<>();

        // Check if a HashMap is empty
        System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());

        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        System.out.println("userCityMapping HashMap : " + userCityMapping);
    }
}
