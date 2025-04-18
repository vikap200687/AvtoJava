import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class TestMyClassTest {
    @Test
    public void main() {
        {
            Response response = RestAssured.given()
                    .get("https://petstore.swagger.io/v2/pet/123");

            // Вы можете добавить дополнительные проверки или действия с ответом
            System.out.println("Status Code: " + response.getStatusCode());
            System.out.println("Response Body: " + response.getBody().asString());
        }
    }
}


