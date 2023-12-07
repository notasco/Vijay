Feature: Vehicle Registration
@smoketest3
  Scenario: User enters valid credentials, adds a new vehicle, and verifies successful registration
    Given the user is logged in
    When the user clicks on Add Vehicle
    And the user navigates to add a new vehicle with details:
      | VehicleNumber | VehicleStatus | VehicleType | VehicleBody | VehicleSpec | VehicleCategory | SizeUnit | Size | WeightUnit | Weight | Brand  | MakeModel | FuelType | Tyres | State         | City         | LegalOwnership | RegistrationDate |
      | ABC123         | Available     | Trailer     | Closed      | MXL         | HCV             | FT       | 27   | MT         | 7.5    | Eicher | cc9087    | Petrol   | 8     | Tamil Nadu    | Chennai      | Owner          | 23-01-2020       |
    And the user clicks on the Marketplace button
    And the user clicks on the Save button
<<<<<<< HEAD
    Then verify that the vehicle is successfully registered

  Examples:
    | VehicleNumber | VehicleStatus  | VehicleType | VehicleBody | VehicleSpec | VehicleCategory | SizeUnit | Size | WeightUnit | Weight | Brand  | MakeModel | FuelType | Tyres | State         | City         | LegalOwnership | RegistrationDate |
    | ABC123        | Available      | Trailer     | Closed      | MXL         | HCV             | FT       | 27   | MT         | 7.5    | Eicher | cc9087    | Petrol   | 8     | Tamil Nadu    | Chennai      | Owner          | 23-01-2020       |
    | XYZ456        | Inactive       | Truck       | Open        | SXL         | LCV             | M        | 20   | KG         | 31     | Volvo  | xyz123    | Diesel   | 10    | Karnataka     | Bangalore    | Leased operator| 15-02-2021       |
    | LMN789        | Available      | Refeer      | Open        | LMN         | MCV             | CM       | 32   | LB         | 22     | Force  |  lmn456   | CNG      | 6     | Maharashtra   | Mumbai       | Market hired   | 05-06-2019       |
    
  
=======
    Then verify that the vehicle is successfully registered
>>>>>>> d13b6159ecede8b4e0a128deff6de411ceb857bb
