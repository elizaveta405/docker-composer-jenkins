import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckKubernetesTest {
    @Test
    public static void healthCheckKubernetes1() {
        given()
                .relaxedHTTPSValidation()
                .baseUri("https://192.168.0.50:6443/")
                .contentType(ContentType.JSON)
                .when()
                .get("livez")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public static void healthCheckKubernetes2() {
        given()
                .relaxedHTTPSValidation()
                .baseUri("https://192.168.0.50:6443/")
                .contentType(ContentType.JSON)
                .when()
                .get("livez?verbose")
                .then()
                .log().all()
                .statusCode(200);
    }
}
