import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckMinioTest {
    @Test
    public static void healthCheckMinio() {
        given()
                .baseUri("http://192.168.1.145:9000/")
                .contentType(ContentType.JSON)
                .when()
                .get("minio/health/live")
                .then()
                .log().all()
                .statusCode(404);
    }
}
