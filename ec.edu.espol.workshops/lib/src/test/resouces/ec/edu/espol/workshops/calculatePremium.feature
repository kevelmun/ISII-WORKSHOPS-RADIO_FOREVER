Feature: Calculate the insurance prime for a customer

Scenario: The customer is a man 24 years old, married with valid driven license
Given a customer 
And is a male
And 24 years old
And is married
And with a valid driven license
When Calculate the premium
Then Show 500 
    
Scenario: The customer is a man 88 years old, married with a not valid driven license
Given a customer 
And is a male
And 88 years old
And is married
And with a not valid driven license
When Calculate the premium
Then Show -1 

Scenario: The customer is a women 15 years old, not married with valid driven license
Given a customer 
And is a female
And 15 years old
And is not married
And with a valid driven license
When Calculate the premium
Then Show -1 
