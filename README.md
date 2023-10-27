**LadsBankProject**
*Lads-Bank team-members: Ana, Alish, Danica, Emily, Katie*

*Features:*
Current and Savings Account - Withdraw(), Deposit() Methods;

How to Use:
Create a bank account (savings or current) with ladsbank, choose to withdraw or deposit into these accounts, have interest rates effect the savings account and minimum balanace

| Classes              | Type           |      Inheritence     |
| ---------------------|----------------| ---------------------|
| App                  | Static Class   |        N/A           |
| Bank Account         | ABSTRACT Class |        N/A           |
| Current Bank Account | Class          | Extends Bank Account |
| Savings Bank Account | Class          | Extends Bank Account |

*Tests*
| Tests Name                                | Outcome |
| ------------------------------------------|---------|
| Add new account balance                   | Success |                     | Add account minimum balanace              | Success |
| Add new account name                      | Success |
| Successful Withdraw                       | Success |
| Unsucessful Withdraw - invalid            | Error   |
| Unsucessful Withdraw - Not enough balanace| Error   |
| Sucessful Deposit                         | Success |
| Unsucessful Deposit                       | Error   |
| ------------------------------------------|---------|

License: None
