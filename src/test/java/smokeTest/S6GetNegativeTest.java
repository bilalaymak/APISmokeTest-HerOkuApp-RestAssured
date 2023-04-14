package smokeTest;
import baseUrl.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
public class S6GetNegativeTest extends HerOkuAppBaseUrl {

    @Test
    public void getNegativeTest(){
        //Set the url
        spec.pathParams("first","booking","second",S1Post.bookingId);

        //Set the expected data
        String expectedData = "Not Found";

        //Send the request agd get the response
        Response response = given(spec).get("{first}/{second}");
        response.prettyPrint();


        //Do assertion
        assertEquals(404, response.statusCode());
        assertEquals(expectedData,response.asString());
    }
}
