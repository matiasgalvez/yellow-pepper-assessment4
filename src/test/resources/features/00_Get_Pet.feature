Feature: Get Pet

  @GetPetWithValidId
  Scenario Outline: [TC-001] Validate that sending a Request to get Pet details with an existing id works

    Given I send a request to the URL with pet id <pet_id> to get pet details
    Then the response will return statuscode <status> and pet id <pet_id> and pet name '<pet_name>' and pet status '<pet_status>'

    Examples:
      |pet_id  |status  |pet_name |pet_status |
      |1       |200     |Cat 1    |available  |

  @GetPetWithInvalidId
  Scenario Outline: [TC-002] Validate that send a Request to get Pet details with a non existing id errors

    Given I send a request to the URL with pet id <pet_id> to get pet details
    Then the response will return statuscode <status>

    Examples:
      |pet_id  |status  |
      |999     |404     |