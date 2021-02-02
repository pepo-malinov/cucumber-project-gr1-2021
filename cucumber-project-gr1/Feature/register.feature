
Feature: Регистрация на потребител

  Scenario Outline: Регистрация на потребител
    Given Потребителя отваря екрана за регистрация на потребител
    When Въведе потребителско име "<username>"
    And Въведе парола "<password>"
    And Въведе втора парола "<password2>"
    And Въведе email "<email>"
    And Натиска върху бутона за регистрация
    Then Вижда съобщение"<message>"

    Examples: 
      | username  | password	| password2  |email        |message    				 |
      | name1 		| password	| password	 |test@test.com|Успешна регистрация|
      | name2 		| password	| password	 |test@test.com|Потребителското име е заето|
      | name1 		| password	| password2	 |test@test.com|Въведете еднакви пароли|
      | name1 		| 	| 	 |test@test.com|Въведете парола|
      | name1 		| password	||test@test.com|Въведете еднакви пароли|
      | name1 		| | password2	 |test@test.com|Въведете еднакви пароли|
      | name1 		| password	| password	 ||Веведете електронна поща|
      || password	| password	 |test@test.com|Веведете потребителско име|
