import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateBookingTests {


    @Test
    public void getBookingTest() {
        given().when().get("https://restful-booker.herokuapp.com/booking").then().statusCode(200);
    }

}
