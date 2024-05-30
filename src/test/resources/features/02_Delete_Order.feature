Feature: Delete Order

  @DeleteOrderWithValidOrderId
  Scenario Outline: Send a Request to Delete an order with a valid id

    Given I send a request to the URL <order_id> to delete an order
    Then the response will return statuscode <status>

    Examples:
      |order_id  |status  |
      |100       |200     |