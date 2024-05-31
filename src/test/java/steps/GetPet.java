package steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.Matchers.*;

public class GetPet {
    private static final String URL = "http://localhost:8080/api/v3/pet";
    public Response response;

    @Given("I send a request to the URL with pet id {int} to get pet details")
    public void sendRequest(int id) {

        response = SerenityRest.given().contentType("application/json").header("Content-Type", "application/json")
                .when().get(URL + '/' + id);
    }

    @Then("the response will return statuscode {int} and pet id {int} and pet name {string} and pet status {string}")

    public void verifyValidPet(int statusCode, int pet_id, String pet_name, String pet_status) {
        SerenityRest.restAssuredThat(response -> response.statusCode(statusCode).and()
                .body("id", equalTo(pet_id)).and().body("name", equalTo(pet_name)).and().body("status", equalTo(pet_status)));

    }

    @Then("the response will return statuscode {int}")
    public void verifyInvalidPet(int statusCode) {
        SerenityRest.restAssuredThat(response -> response.statusCode(statusCode));

    }
}
