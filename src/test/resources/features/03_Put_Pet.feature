Feature: Update Pet

  @UpdatePetWithValidData
  Scenario Outline: Send a Request to update a Pet with valid data

    Given I send a request to the URL to update a pet with valid data
    Then the response will return statuscode <status> and id <pet_id> and pet name '<pet_name>' and pet status '<pet_status>'

    Examples:
      |pet_id  |status  |pet_name |pet_status |
      |10      |200     |Max      |available  |

  @CreatePetWithInValidData
  Scenario Outline: Send a Request to update a Pet with invalid data

    Given I send a request to the URL to create a pet with invalid data
    Then the response will return statuscode <status>

    Examples:
      |status  |
      |400     |