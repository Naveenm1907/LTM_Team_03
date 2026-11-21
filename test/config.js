const noOfDay = 32;

const testSuites = [
  {
  "day": 1,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayOneTest.java"
      ],
      "testcases": [
        {
          "name": "testCustomersParameterizedConstructor_Day1",
          "value": "Verify that the Customers parameterized constructor correctly initializes all customer fields with the supplied values."
        },
        {
          "name": "testCustomersSettersAndGetters_Day1",
          "value": "Verify that the Customers setters correctly assign values and the corresponding getters return the assigned values."
        }
      ]
    }
  ]
},
{
  "day": 2,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayTwoTest.java"
      ],
      "testcases": [
        {
          "name": "testCustomersParameterizedConstructor_Day2",
          "value": "Verify that the Customers parameterized constructor correctly initializes all customer fields with the supplied values."
        },
        {
          "name": "testAccountsParameterizedConstructorAndGetters_Day2",
          "value": "Verify that the Accounts parameterized constructor correctly initializes all account fields and the getters return the expected values."
        },
        {
          "name": "testTransactionsParameterizedConstructorAndGetters_Day2",
          "value": "Verify that the Transactions parameterized constructor correctly initializes all transaction fields and the getters return the expected values."
        }
      ]
    }
  ]
},
{
  "day": 3,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayThreeTest.java"
      ],
      "testcases": [
        {
          "name": "testGetDatabaseConnection_Day3",
          "value": "Verify that the database connection method successfully establishes and returns a valid database connection."
        }
      ]
    }
  ]
},
{
  "day": 4,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayFourTest.java"
      ],
      "testcases": [
        {
          "name": "testAccountServiceDelegatesToDAO_Day4",
          "value": "Verify that the AccountService correctly delegates account retrieval or processing operations to the AccountDAO."
        },
        {
          "name": "testCustomerServiceSortsCustomersByName_Day4",
          "value": "Verify that the CustomerService correctly sorts customers in ascending order based on customer name."
        },
        {
          "name": "testTransactionServiceDelegatesToDAO_Day4",
          "value": "Verify that the TransactionService correctly delegates transaction operations to the TransactionDAO."
        },
        {
          "name": "testAccountBalanceSorting_Day4",
          "value": "Verify that accounts are correctly sorted based on account balance."
        }
      ]
    }
  ]
},
{
  "day": 5,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayFiveTest.java"
      ],
      "testcases": [
        {
          "name": "testAccountsComparableByBalance_Day5",
          "value": "Verify that the Accounts class implements Comparable and compares accounts correctly based on account balance."
        },
        {
          "name": "testCustomersComparableByName_Day5",
          "value": "Verify that the Customers class implements Comparable and compares customers correctly based on customer name."
        },
        {
          "name": "testAccountServiceSortsAccountsByBalance_Day5",
          "value": "Verify that the AccountService returns accounts sorted correctly based on account balance using the Comparable implementation."
        },
        {
          "name": "testCustomerServiceSortsCustomersByName_Day5",
          "value": "Verify that the CustomerService returns customers sorted correctly based on customer name using the Comparable implementation."
        }
      ]
    }
  ]
},
{
  "day": 6,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DaySixTest.java"
      ],
      "testcases": [
        {
          "name": "testGetAllCustomersFromDAO_Day6",
          "value": "Verify that the CustomerDAO successfully retrieves all customer records from the database."
        },
        {
          "name": "testAddCustomerThroughDAO_Day6",
          "value": "Verify that a new customer can be successfully added to the database through the CustomerDAO."
        },
        {
          "name": "testGetCustomerByIdThroughDAO_Day6",
          "value": "Verify that the CustomerDAO successfully retrieves the correct customer using the specified customer ID."
        },
        {
          "name": "testGetAllCustomersSortedByName_Day6",
          "value": "Verify that the CustomerDAO retrieves all customers sorted correctly in ascending order based on customer name."
        }
      ]
    }
  ]
},
{
  "day": 7,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DaySevenTest.java"
      ],
      "testcases": [
        {
          "name": "testGetAllAccountsFromDAO_Day7",
          "value": "Verify that the AccountDAO successfully retrieves all account records from the database."
        },
        {
          "name": "testAddAccountThroughDAO_Day7",
          "value": "Verify that a new account can be successfully added to the database through the AccountDAO."
        },
        {
          "name": "testGetAccountByIdThroughDAO_Day7",
          "value": "Verify that the AccountDAO successfully retrieves the correct account using the specified account ID."
        },
        {
          "name": "testGetAllAccountsSortedByBalance_Day7",
          "value": "Verify that the AccountDAO retrieves all accounts sorted correctly based on account balance."
        }
      ]
    }
  ]
},
{
  "day": 8,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayEightTest.java"
      ],
      "testcases": [
        {
          "name": "testGetAllTransactionsFromDAO_Day8",
          "value": "Verify that the TransactionDAO successfully retrieves all transaction records from the database."
        },
        {
          "name": "testGetTransactionByIdThroughDAO_Day8",
          "value": "Verify that the TransactionDAO successfully retrieves the correct transaction using the specified transaction ID."
        },
        {
          "name": "testAddTransactionThroughDAO_Day8",
          "value": "Verify that a new transaction can be successfully added to the database through the TransactionDAO."
        },
        {
          "name": "testDeleteTransactionThroughDAO_Day8",
          "value": "Verify that the TransactionDAO successfully deletes the transaction with the specified transaction ID."
        }
      ]
    }
  ]
},
{
  "day": 9,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayNineTest.java"
      ],
      "testcases": [
        {
          "name": "testBankSafeApplicationHasSpringBootApplicationAnnotation_Day9",
          "value": "Verify that the BankSafeApplication class is correctly annotated with @SpringBootApplication."
        }
      ]
    }
  ]
},
{
  "day": 10,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayTenTest.java"
      ],
      "testcases": [
        {
          "name": "testCustomerControllerHasRestControllerAnnotation_Day10",
          "value": "Verify that the CustomerController class is correctly annotated with @RestController."
        },
        {
          "name": "testCustomersParameterizedConstructorAndGetters_Day10",
          "value": "Verify that the Customers parameterized constructor correctly initializes all fields and the corresponding getters return the expected values."
        },
        {
          "name": "testCustomersComparableByName_Day10",
          "value": "Verify that the Customers class implements Comparable and compares customers correctly based on customer name."
        },
        {
          "name": "testCustomersDefaultConstructorAndSetters_Day10",
          "value": "Verify that the Customers default constructor creates an object successfully and the setters correctly assign values to all fields."
        }
      ]
    }
  ]
},
 {
  "day": 11,
  "dayWiseTestcase": [
    {
      "fileName": [
        "DayElevenTest.java"
      ],
      "testcases": [
        {
          "name": "testAccountAndTransactionControllersHaveRestController_Day11",
          "value": "Verify that the AccountController and TransactionController classes are correctly annotated with @RestController."
        },
        {
          "name": "testAllEntitiesHaveEntityAnnotation_Day11",
          "value": "Verify that all required entity classes are correctly annotated with @Entity."
        },
        {
          "name": "testAccountsComparableByBalance_Day11",
          "value": "Verify that the Accounts class implements Comparable and compares accounts correctly based on account balance."
        },
        {
          "name": "testTransactionParameterizedConstructorAndGetters_Day11",
          "value": "Verify that the Transactions parameterized constructor correctly initializes all transaction fields and the corresponding getters return the expected values."
        }
      ]
    }
  ]
},
  {
    "day": 12,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DayTwelveTest.java"
        ],
        "testcases": [
          {
          "name": "testAddCustomersToArrayList_Day12",
          "value": "test Add Customers To ArrayList_Day12"
        },
        {
          "name": "testGetAllCustomersSortedByNameFromArrayList_Day12",
          "value": "test Get All Customers Sorted By Name From ArrayList_Day12"
        },
        {
          "name": "testGetAllCustomers_Day12",
          "value": "test Get All Customers_Day12"
        }
        ]
      }
    ]
  },
  {
    "day": 13,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DayThirteenTest.java"
        ],
        "testcases": [
          {
          "name": "testAddCustomerController_Day13",
          "value": "test Add Customer Controller_Day13"
        },
        {
          "name": "testUpdateCustomerController_Day13",
          "value": "test Update Customer Controller_Day13"
        },
        {
          "name": "testGetAllCustomersController_Day13",
          "value": "test Get All Customers Controller_Day13"
        },
        {
          "name": "testGetCustomerById_Day13",
          "value": "test Get Customer By Id_Day13"
        }
        ]
      }
    ]
  },
  {
    "day": 14,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DayFourteenTest.java"
        ],
        "testcases": [
          {
          "name": "testGetAllAccounts_Day14",
          "value": "test Get All Accounts_Day14"
        },
        {
          "name": "testGetAllAccountsSortedByBalance_Day14",
          "value": "test Get All Accounts Sorted By Balance_Day14"
        },
        {
          "name": "testGetAccountsByUserController_Day14",
          "value": "test Get Accounts By User Controller_Day14"
        },
        {
          "name": "testAddAccountController_Day14",
          "value": "test Add Account Controller_Day14"
        }
        ]
      }
    ]
  },
  {
    "day": 15,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DayFifteenTest.java"
        ],
        "testcases": [
          {
          "name": "testGetTransactionById_Day15",
          "value": "test Get Transaction By Id_Day15"
        },
        {
          "name": "testGetTransactionsByIdController_Day15",
          "value": "test Get Transactions By Id Controller_Day15"
        },
        {
          "name": "testAddTransactionController_Day15",
          "value": "test Add Transaction Controller_Day15"
        }
        ]
      }
    ]
  },
  {
    "day": 16,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DaySixteenTest.java"
        ],
        "testcases": [
          {
          "name": "testTranscationOutBalanceException_Day16",
          "value": "test Transaction OutOfBalanceException Day16"
        },
        {
          "name": "testWithdrawalLimitException_Day16",
          "value": "test Withdrawal Limit Exception Day16"
        },
        {
          "name": "testAccountNotFoundException_Day16",
          "value": "test Account Not Found Exception Day16"
        }
        ]
      }
    ]
  },
  {
    "day": 17,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DaySeventeenTest.java"
        ],
        "testcases": [
          {
          "name": "testCreateAndGetLoan_day17",
          "value": "test Create and Get Loan Day17"
        },
        {
          "name": "testDeleteLoan_day17",
          "value": "test Delete Loan Day17"
        },
        {
          "name": "testUpdateLoan_Day17",
          "value": "test Update Loan Day17"
        }
        ]
      }
    ]
  },
  {
    "day": 18,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DayEighteenTest.java"
        ],
        "testcases": [
          {
          "name": "testAddCreditCard_Day18",
          "value": "test Add CreditCard Day18"
        },
        {
          "name": "testUpdateCreditCard_Day18",
          "value": "test Update CreditCard Day18"
        },
        {
          "name": "testDeleteCreditCard_Day18",
          "value": "test Delete CreditCard Day18"
        },
        {
          "name": "testGetAllCreditCards_Day18",
          "value": "test Get All CreditCards Day18"
        },
        {
          "name": "testGetCreditCardById_Day18",
          "value": "test Get CreditCard By Id Day18"
        }
        ]
      }
    ]
  },
  {
    "day": 19,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DayNineteenTest.java"
        ],
        "testcases": [
          {
          "name": "testCustomerControllerGetAllCustomers_Day19",
          "value": "test Get All Customers Day19"
        },
        {
          "name": "testCustomerControllerAddCustomer_Day19",
          "value": "test Add Customer Day19"
        },
        {
          "name": "testCustomerControllerDeleteCustomer_Day19",
          "value": "test Delete Customer Day19"
        },
        {
          "name": "testAccountControllerAddAccount_Day19",
          "value": "test Add Account Day19"
        },
        {
          "name": "testAccountControllerGetAccountById_Day19",
          "value": "test Get Account By Id Day19"
        }
        ]
      }
    ]
  },
  {
    "day": 20,
    "dayWiseTestcase": [
      {
        "fileName": [
          "DayTwentyTest.java"
        ],
        "testcases": [
         {
          "name": "testAccountControllerDeleteAccount_Day20",
          "value": "test Delete Account Day20"
        },
        {
          "name": "testTransactionControllerAddTransaction_Day20",
          "value": "test Add Transaction Day20"
        },
        {
          "name": "testTransactionControllerDeleteTransaction_Day20",
          "value": "test Delete Transaction Day20"
        },
        {
          "name": "testUnauthorizedAddCustomerByUser_Day20",
          "value": "test Unauthorized Add Customer by USER Day20"
        },
        {
          "name": "testUnauthorizedDeleteAccountByUser_Day20",
          "value": "test Unauthorized Delete Account by USER Day20"
        }
        ]
      }
    ]
  },
{
  day: 21,
  dayWiseTestcase: [
    {
      fileName: [
        "day_21.test.js"
      ],
      testcases: [
         {
      "name": "testRegisterFunction_Day21",
      "value": "test Register Function Day21"
    },
	 {
      "name": "testLoginFunction_Day21",
      "value": "test Login Function Day21"
    }
        ]
    }
  ]
},
 {
    "day": 22,
    "dayWiseTestcase": [
      {
        "fileName": [
          "day_22.spec.ts"
        ],
        "testcases": [
         {
			"name": "CustomerTS_displayInfo",
			"value": "test CustomerTS displayInfo method logs correct information_Day22"
		  },
		  {
			"name": "AccountTS_displayInfo",
			"value": "test AccountTS displayInfo method logs correct information_Day22"
		  },
		  {
			"name": "TransactionTS_displayInfo",
			"value": "test TransactionTS displayInfo method logs correct information_Day22"
		  }
        ]
      }
    ]
  },
  {
    "day": 23,
    "dayWiseTestcase": [
      {
        "fileName": [
          "day_23.spec.ts"
        ],
        "testcases": [
			  {
				"name": "CustomersampleComponent_displayAccountInfo",
				"value": "test CustomersampleComponent displays account information correctly_Day23"
			  },
			  {
				"name": "CustomersampleComponent_displayCustomerDetails",
				"value": "test CustomersampleComponent displays customer details correctly_Day23"
			  }
        ]
      }
    ]
  },
 {
  "day": 24,
  "dayWiseTestcase": [
    {
      "fileName": [
        "day_24.spec.ts"
      ],
      "testcases": [
        {
          "name": "CustomersampleComponent should display customer details correctly",
          "value": "Verify that the CustomersampleComponent displays the customer name, email, age, and role correctly in the template."
        },
        {
          "name": "CustomersampleComponent should display customer email when Show Email button is clicked",
          "value": "Verify that clicking the Show Email button changes the component state and displays the customer's email address."
        },
        {
          "name": "CustomersampleComponent should change customer role to Admin when Change Role button is clicked",
          "value": "Verify that clicking the Change Role button changes the customer's role from the existing role to Admin."
        }
      ]
    }
  ]
},
{
  "day": 25,
  "dayWiseTestcase": [
    {
      "fileName": [
        "day_25.spec.ts"
      ],
      "testcases": [
        {
          "name": "CustomerarrayComponent should use uppercase, lowercase and titlecase pipes correctly",
          "value": "Verify that the uppercase, lowercase, and titlecase Angular pipes transform and display customer data correctly."
        },
        {
          "name": "CustomerarrayComponent should use json pipe to display customer object",
          "value": "Verify that the Angular json pipe correctly converts and displays the customer object as a JSON string."
        }
      ]
    }
  ]
},
{
  "day": 26,
  "dayWiseTestcase": [
    {
      "fileName": [
        "day_26.spec.ts"
      ],
      "testcases": [
        {
          "name": "Customer Routing Components should display View Customer Details links",
          "value": "Verify that the customer routing component displays a View Customer Details link for each customer."
        },
        {
          "name": "Customer Routing Components should create route parameter and query parameter links",
          "value": "Verify that the customer detail links correctly include the customer ID as a route parameter and the role as a query parameter."
        },
        {
          "name": "Customer Routing Components should read customer ID from route parameter",
          "value": "Verify that the customer details component correctly reads and uses the customer ID from the Angular route parameter."
        },
        {
          "name": "Customer Routing Components should read role from query parameter",
          "value": "Verify that the customer details component correctly reads and uses the role value from the Angular query parameter."
        }
      ]
    }
  ]
},
{
  "day": 27,
  "dayWiseTestcase": [
    {
      "fileName": [
        "day_27.spec.ts"
      ],
      "testcases": [
        {
          "name": "Reactive Form Components should create account form with required controls",
          "value": "Verify that the account reactive form is created successfully with all required form controls."
        },
        {
          "name": "Reactive Form Components should create customer form with required controls",
          "value": "Verify that the customer reactive form is created successfully with all required form controls."
        },
        {
          "name": "Reactive Form Components should create transaction form with required controls",
          "value": "Verify that the transaction reactive form is created successfully with all required form controls."
        },
        {
          "name": "Reactive Form Components should validate transaction amount as non-negative",
          "value": "Verify that the transaction amount field rejects negative values and accepts zero or positive values."
        }
      ]
    }
  ]
},
{
  day: 28,
  dayWiseTestcase: [
    {
      fileName: [
        "day_28.spec.ts"
      ],
      testcases: [
		  {
			"name": "CustomersComponent_shouldCreate",
			"value": "test CustomersComponent should create the component_Day28"
		  },
		  {
			"name": "CustomersComponent_initializeForm",
			"value": "test CustomersComponent should initialize the form_Day28"
		  },
		  {
			"name": "CustomersComponent_formControlsExist",
			"value": "test CustomersComponent should have form controls for name, email, username, and password_Day28"
		  },
		  {
			"name": "CustomersComponent_formControlsEmpty",
			"value": "test CustomersComponent should initialize the form with empty controls_Day28"
		  },
		  {
			"name": "CustomersComponent_invalidControls",
			"value": "test CustomersComponent should mark form controls as invalid if they are touched and empty_Day28"
		  },
		  {
			"name": "CustomersComponent_invalidEmailError",
			"value": "test CustomersComponent should update customerError for invalid email format on form submission_Day28"
		  },
		  {
			"name": "CustomersComponent_onSubmitCalled",
			"value": "test CustomersComponent should call onSubmit method on form submission_Day28"
		  },
		  {
			"name": "AccountComponent_shouldCreate",
			"value": "test AccountComponent should create the component_Day28"
		  },
		  {
			"name": "AccountComponent_accountIdRequired",
			"value": "test AccountComponent should validate accountId as required_Day28"
		  },
		  {
			"name": "AccountComponent_balanceMinValidation",
			"value": "test AccountComponent should validate balance as non-negative_Day28"
		  },
		  {
			"name": "AccountComponent_validForm",
			"value": "test AccountComponent should pass validation when all fields are valid_Day28"
		  }
        ]
    }
  ]
},
{
    day: 29,
    dayWiseTestcase: [
      {
        fileName: [
          "day_29.spec.ts"
        ],
        testcases: [
          {
			"name": "login_shouldPostRequest",
			"value": "test login should make a POST request to login_Day29"
		  },
		  {
			"name": "getToken_shouldReturnToken",
			"value": "test getToken should get the token from localStorage_Day29"
		  },
		  {
			"name": "createUser_shouldPostRequest",
			"value": "test createUser should make a POST request to create a user_Day29"
		  }
        ]
      }
    ]
  },
{
    day: 30,
    dayWiseTestcase: [
      {
        fileName: [
          "day_30.spec.ts"
        ],
        testcases: [
		  {
			"name": "AccountComponent_shouldCreate",
			"value": "test AccountComponent should create component_Day30"
		  },
		  {
			"name": "AccountComponent_shouldLoadCustomers",
			"value": "test AccountComponent should initialize customers on load_Day30"
		  },
		  {
			"name": "AccountComponent_validateFormFields",
			"value": "test AccountComponent should validate account form fields_Day30"
		  },
		  {
			"name": "AccountComponent_validFormSubmission",
			"value": "test AccountComponent should display success message on valid form submission_Day30"
		  },
		  {
			"name": "AccountComponent_invalidFormSubmission",
			"value": "test AccountComponent should display error message on invalid form submission_Day30"
		  },
		  {
			"name": "CustomersComponent_shouldCreate",
			"value": "test CustomersComponent should create component_Day30"
		  },
		  {
			"name": "CustomersComponent_validateFormFields",
			"value": "test CustomersComponent should validate customer form fields_Day30"
		  },
		  {
			"name": "CustomersComponent_validFormSubmission",
			"value": "test CustomersComponent should display success message on valid form submission_Day30"
		  },
		  {
			"name": "CustomersComponent_invalidFormSubmission",
			"value": "test CustomersComponent should display error message on invalid form submission_Day30"
		  },
		  {
			"name": "DashboardComponent_shouldCreate",
			"value": "test DashboardComponent should create component_Day30"
		  },
		  {
			"name": "DashboardComponent_loadAdminDataIfAdmin",
			"value": "test DashboardComponent should load admin data if role is ADMIN_Day30"
		  },
		  {
			"name": "DashboardComponent_loadAllData",
			"value": "test DashboardComponent should load customers, accounts, and transactions_Day30"
		  }
        ]
      }
    ]
  },
{
    day: 31,
    dayWiseTestcase: [
      {
        fileName: [
          "day_31.spec.ts"
        ],
        testcases: [
          {
			"name": "TransactionComponent_shouldCreate",
			"value": "test TransactionComponent should create component"
		  },
		  {
			"name": "TransactionComponent_initializeForm",
			"value": "test TransactionComponent should initialize the form on ngOnInit_Day31"
		  },
		  {
			"name": "TransactionComponent_fetchAccountsForUser",
			"value": "test TransactionComponent should fetch accounts for USER role on ngOnInit_Day31"
		  },
		  {
			"name": "TransactionComponent_validateAmountField",
			"value": "test TransactionComponent should validate the amount field_Day31"
		  },
		  {
			"name": "TransactionComponent_invalidFormSubmission",
			"value": "test TransactionComponent should display error message on invalid form submission_Day31"
		  },
		  {
			"name": "TransactionComponent_validFormSubmission",
			"value": "test TransactionComponent should call performTransaction on valid form submission_Day31"
		  },
		  {
			"name": "TransactionComponent_handleServiceErrors",
			"value": "test TransactionComponent should handle errors from performTransaction service_Day31"
		  },
		  {
			"name": "DashboardComponent_shouldCreate",
			"value": "test DashboardComponent should create component_Day31"
		  },
		  {
			"name": "DashboardComponent_loadUserDataIfUser",
			"value": "test DashboardComponent should load user data if role is USER_Day31"
		  }
        ]
      }
    ]
  },
{
    day: 32,
    dayWiseTestcase: [
      {
        fileName: [
          "day_32.spec.ts"
        ],
        testcases: [
          {
			"name": "EditAccountComponent_shouldCreate",
			"value": "test EditAccountComponent should create component_Day32"
		  },
		  {
			"name": "EditAccountComponent_initializeForm",
			"value": "test EditAccountComponent should initialize the form on ngOnInit_Day32"
		  },
		  {
			"name": "EditAccountComponent_loadAccountDetails",
			"value": "test EditAccountComponent should load account details on initialization_Day32"
		  },
		  {
			"name": "EditAccountComponent_formSubmissionSuccess",
			"value": "test EditAccountComponent should handle form submission successfully_Day32"
		  },
		  {
			"name": "EditCustomerComponent_shouldCreate",
			"value": "test EditCustomerComponent should create component_Day32"
		  },
		  {
			"name": "EditCustomerComponent_initializeForm",
			"value": "test EditCustomerComponent should initialize the form on ngOnInit_Day32"
		  },
		  {
			"name": "EditCustomerComponent_loadCustomerDetails",
			"value": "test EditCustomerComponent should load customer details on initialization_Day32"
		  },
		  {
			"name": "EditCustomerComponent_formSubmissionSuccess",
			"value": "test EditCustomerComponent should handle form submission successfully_Day32"
		  }
        ]
      }
    ]
  }

]

module.exports = {
  noOfDay,
  testSuites
};