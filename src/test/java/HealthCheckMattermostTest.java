import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckMattermostTest {
    @Test
    public static void healthCheckMattermost() {
        given()
                .baseUri("https://chat.mmtr.ru/api/")
                .contentType(ContentType.JSON)
                .when()
                .get("v4/system/ping")
                .then()
                .log().all()
                .statusCode(200);
    }
}
