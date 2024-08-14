# Domain model

Assuming that:

- A userType of 0 is a Bob Bagel's manager
- A userType of 1 is the public
- There cannot be two of the same bagels in the same basket

| Classes  | Methods                                               | Scenario                                       | Outputs |
|----------|-------------------------------------------------------|------------------------------------------------|---------|
| `Basket` | `add(String bagel)`                                   | Successfully added to basket                   | true    |
|          |                                                       | Failed to add to basket (e.g., already exists) | false   |
|          | `remove(String bagel)`                                | Successfully removed from basket               | true    |
|          |                                                       | Failed to remove from basket                   | false   |
|          | `isFull()`                                            | Basket is full                                 | true    |
|          |                                                       | Basket is not full                             | false   |
|          | `changeBasketCapacity(int newCapacity, int userType)` | Successfully changed capacity of baskets       | true    |
|          |                                                       | Failed to change capacity of baskets           | false   |
