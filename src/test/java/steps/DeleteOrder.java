package steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class DeleteOrder {
    private static final String URL = "http://localhost:8080/api/v3/store/order";
    public Response response;

    @Given("I send a request to the URL with order id {int} to delete an order")
    public void sendRequest(int id) {

        response = SerenityRest.given().contentType("application/json").header("Content-Type", "application/json")
                .when().delete(URL + '/' + id);
    }
}
