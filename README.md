# Fawry E-commerce System – Internship Challenge

This project is a Java-based e-commerce system developed as a solution for the Fawry Quantum Full Stack Internship Challenge. It simulates product management, shopping cart functionality, shipping, and checkout with complete validation and test coverage.


## Features

- Define products with name, price, quantity, expiration, and shipping attributes.
- Add products to cart with quantity validation against available stock.
- Checkout process with:
  - Subtotal calculation
  - Fixed shipping cost (if applicable)
  - Total amount
  - Updated customer balance
- Shipment notice with total package weight
- Error handling for the following cases:
  - Empty cart
  - Expired product
  - Product out of stock
  - Insufficient customer balance

## Test Cases Covered

The implementation covers and prints output for all required use cases, including:

1. Successful checkout with valid products and sufficient balance.
2. Attempting checkout with an empty cart.
3. Adding an expired product to the cart.
4. Adding quantity greater than available stock.
5. Performing checkout with insufficient customer balance.

## Sample Output

```
** Shipment notice **
- Cheese 400g
- Biscuits 700g
Total package weight 1.1 kg

** Checkout receipt **
2x Cheese 200
1x Biscuits 150
1x Scratch Card 50
Subtotal 400
Shipping 30
Amount 430
Customer balance after payment: 70

## Repository Structure

```
src/
├── Product.java
├── CartItem.java
├── Cart.java
├── Customer.java
├── Checkout.java
├── ShippingService.java
├── Main.java
=
```

