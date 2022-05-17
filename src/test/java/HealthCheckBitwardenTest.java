import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckBitwardenTest {
    @Test
    public static void healthCheckBitwarden() {
        given()
                .baseUri("http://192.168.0.45:90")
                .contentType(ContentType.JSON)
                .when()
                .get("/alive")
                .then()
                .log().all()
                .statusCode(200);
    }

}
