
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;

public class TwstJson {


    @Test
    public void test() {
        Response response =
                given()
                        .log().uri()
                        .baseUri("http://newsapi.org")
                        .basePath("/v2")
                        .header("Authorization", "Bearer 03e75cdc200c4f27a77f9b1473bbde8d")
                        .queryParam("country", "us").
                        when()
                        .get("/top-headlines");
        System.out.println(response.jsonPath().getString("status"));
    }
}
