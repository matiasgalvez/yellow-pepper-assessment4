package steps;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import utils.RequestBody;

public class CreatePet {
    private static final String URL = "http://localhost:8080/api/v3/pet";
    public Response response;
    RequestBody requestBody = new RequestBody(
            100,
            "Max",
            "available"
            );

    @Given("I send a request to the URL to create a pet with valid data")
    public void sendValidRequest() {

        response = SerenityRest.given().contentType("application/json").
                header("Content-Type", "application/json").body(requestBody).
                when().
                post(URL);
    }

    @Given("I send a request to the URL to create a pet with invalid data")
    public void sendInvalidRequest() {

        response = SerenityRest.given().contentType("application/json").
                header("Content-Type", "application/json").
                when().
                post(URL);
    }
}
