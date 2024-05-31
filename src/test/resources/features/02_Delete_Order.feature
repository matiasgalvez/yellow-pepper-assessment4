Feature: Delete Order

  @DeleteOrderWithValidOrderId
  Scenario Outline: [TC-005] Validate that sending a Request to Delete an order with a valid id works

    Given I send a request to the URL with order id <order_id> to delete an order
    Then the response will return statuscode <status>

    Examples:
      |order_id  |status  |
      |100       |200     |