Feature: Adding items to the cart
  Rule: items added from the catalog page should appear in the cart
    Example: Colin adds some items to the cart
      Given Colin logs in with valid credentials
      And he is browsing the catalog
      When he adds the following items to the cart:
      | Sauce Labs Backpack |
      | Sauce Labs Fleece Jacket |
      Then the shopping cart count should be 2
      And the items should appear in the cart