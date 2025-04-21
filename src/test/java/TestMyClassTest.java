import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestMyClassTest {
    final static String BASE_URI = "https://petstore.swagger.io/v2/pet";
    @BeforeAll
    public static void setup() {
        // Setting BaseURI once
        RestAssured.baseURI = BASE_URI;
    }

    public Response createPet(String id, String name) {
        // Создаем JSON-объект для тела запроса
        String requestBody = "{\n" +
                "  \"id\": "+ id +",\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Bob\"\n" +
                "  },\n" +
                "  \"name\": \""+ name +"\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        // Выполняем POST-запрос
        Response response = RestAssured.given()
                .contentType(ContentType.JSON) // Устанавливаем тип контента
                .body(requestBody) // Устанавливаем тело запроса
                .post(BASE_URI); // Выполняем POST-запрос
        Assertions.assertEquals(200, response.getStatusCode());

        return response; // Возвращаем ответ
    }
    // Метод для удаления животного по ID
    public Response deletePet(String petId) {
        // Формируем URL для удаления питомца
        String deleteUrl = BASE_URI + "/" + petId;

        // Выполняем DELETE-запрос
        Response response = RestAssured.given()
                .delete(deleteUrl); // Выполняем DELETE-запрос
        Assertions.assertEquals(200, response.getStatusCode());

        return response; // Возвращаем ответ
    }

    @Test
    public void testGet() {
        String petId = "123";
        createPet(petId,"BOBTest");
        RequestSpecification request = RestAssured.given();
        // Setting Base Path
        request.basePath("/" + petId);

        Response response = request
                .contentType(ContentType.JSON)
                .get();

        System.out.println(response.asString());
            // Вы можете добавить дополнительные проверки или действия с ответом
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        deletePet(petId);
    }
}


