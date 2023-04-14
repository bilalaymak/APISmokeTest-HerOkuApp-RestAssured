package util;

import java.util.HashMap;
import java.util.Map;

public class HerOkuAppTestData{
     //inner json
    public Map<String, String> bookingdatesMapMethod(String checkin, String checkout){
        Map<String, String> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin",checkin);
        bookingdatesMap.put("checkout",checkout);
        return bookingdatesMap;
    }
    //outer json
    public static Map<String, Object> expectedDataMethod(String firstname, String lastname, Integer totalprice, Boolean depositpaid, Map<String, String> bookingdatesMap, String additionalneeds){
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("firstname",firstname);
        expectedData.put("lastname",lastname);
        expectedData.put("totalprice",totalprice);
        expectedData.put("depositpaid",depositpaid);
        expectedData.put("bookingdates",bookingdatesMap);
        if(additionalneeds != null){
            expectedData.put("additionalneeds",additionalneeds);
        }


        return expectedData;
    }

}
