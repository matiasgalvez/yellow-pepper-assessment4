package steps;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import utils.RequestBody;

public class PutPet {
    private static final String URL = "http://localhost:8080/api/v3/pet";
    public Response response;
    RequestBody requestBody = new RequestBody(
            10,
            "Max",
            "available"
    );


    @Given("I send a request to the URL to update a pet with valid data")
    public void sendValidPutRequest() {

        response = SerenityRest.given().contentType("application/json").
                header("Content-Type", "application/json").body(requestBody).
                when().
                put(URL);
    }

    @Given("I send a request to the URL to update a pet with invalid data")
    public void sendInvalidPutRequest() {

        response = SerenityRest.given().contentType("application/json").
                header("Content-Type", "application/json").
                when().
                post(URL);
    }
}
