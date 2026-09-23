double price = 0, quantity = 0, subtotal, vat, grandTotal;

// (1) Read item price
price = 4.99;

// (2) Read quantity
quantity = 3;

// (3) Calculate subtotal
subtotal = price * quantity;

// (4) Calculate VAT
vat = subtotal * 0.20;

// (5) Calculate grand total
grandTotal = subtotal + vat;

// (6) Print grand total
System.out.println("Grand total: " + grandTotal);
