Feature:

@Tag_101
Scenario: A user should be able  buy a pill on Medicare sucessfully
Given the user is on the landing page of the Medicare
When clicks on the view form the displayed pills
And he clicks on Add To Cart button
And he login as a user and clicks on the login button
And he clicks on the checkout button
And he enters the delivery address and clicks on the add address button
And he enters the card number for payment and click on the pay button
Then he should be able to purchase a pill sucessfully

@Tag_102
Scenario:A user should add the product as a admin
Given the user is on the landing page of the Medicare click the login button
When he login as a admin
And he clicks on the manage product button
And he adds the product and save
Then he sees the product added sucessful message





