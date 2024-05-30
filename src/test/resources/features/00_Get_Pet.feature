Feature: Get Pet

  @GetPetWithValidId
  Scenario Outline: Send a Request to get Pet details with an existing id

    Given I send a request to the URL <pet_id> to get pet details
    Then the response will return statuscode <status> and id <pet_id> and pet name '<pet_name>' and pet status '<pet_status>'

    Examples:
      |pet_id  |status  |pet_name |pet_status |
      |1       |200     |Cat 1    |available  |

  @GetPetWithInvalidId
  Scenario Outline: Send a Request to get Pet details with a non existing id

    Given I send a request to the URL <pet_id> to get pet details
    Then the response will return statuscode <status>

    Examples:
      |pet_id  |status  |
      |999     |404     |