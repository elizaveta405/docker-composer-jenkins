import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckAlertmanagerTest {
    @Test
    public static void healthCheckAlertmanager() {
        given()
                .baseUri("http://192.168.0.49:9093/")
                .contentType(ContentType.JSON)
                .when()
                .get("-/healthy")
                .then()
                .log().all()
                .statusCode(200);
    }
}
