import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckStatPingTest {
    @Test
    public static void healthCheckStatPing() {
        given()
                .baseUri("http://192.168.5.253:8080")
                .contentType(ContentType.JSON)
                .when()
                .get("/health")
                .then()
                .log().all()
                .statusCode(200);
    }
}
