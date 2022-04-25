import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckVaultTest {
    @Test
    public static void healthCheckVault() {
        given()
                .baseUri("http://192.168.0.180:8200/v1/sys/")
                .contentType(ContentType.JSON)
                .when()
                .get("health")
                .then()
                .log().all()
                .statusCode(200);
    }

}
