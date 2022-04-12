import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestApi {

    @Test
    public static void myAPITest() {
        given()
                .baseUri("http://192.168.0.49:9090/")
                .contentType(ContentType.JSON)
                .when()
                .get("-/healthy")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public static void myAPITest1() {
        given()
                .baseUri("http://192.168.0.49:9093/")
                .contentType(ContentType.JSON)
                .when()
                .get("-/healthy")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public static void myAPITest2() {
        given()
                .baseUri("http://192.168.5.253:8080")
                .contentType(ContentType.JSON)
                .when()
                .get("/health")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public static void myAPITest3() {
        given()
                .baseUri("http://192.168.0.45:80")
                .contentType(ContentType.JSON)
                .when()
                .get("/alive")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public static void myAPITest4() {
        given()
                .baseUri("http://192.168.0.180:8200/sys/")
                .contentType(ContentType.JSON)
                .when()
                .get("health")
                .then()
                .log().all()
                .statusCode(200);
    }


    @Test
    public static void myAPITest5() {
        given()
                .baseUri("http://192.168.1.145:9000/")
                .contentType(ContentType.JSON)
                .when()
                .get("minio/health/live")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public static void myAPITest6() {
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

    @Test
    public static void myAPITest7() {
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
}
