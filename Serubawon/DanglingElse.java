// Problem:
if (x > 5)
  if (y > 5)
    System.out.println("both >5");
else // Java attaches this else to nearest if (y>5), not x>5 - this is dangling else
  System.out.println("x <=5?");

// Solution - use braces {}
if (x > 5){
  if (y > 5){
    System.out.println("both >5");
  }
} else {
  System.out.println("x <=5");
}
