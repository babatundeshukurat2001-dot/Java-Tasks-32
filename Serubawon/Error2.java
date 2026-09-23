//int x = 10;
//if (x = 10)
//    System.out.println("Ten");
//
//The error: x = 10 inside the if is an assignment, not a comparison — a single = assigns the value 10 to x and the expression evaluates to that assignment (which isn't even valid for an int condition in Java, since Java requires if conditions to be boolean, not int). This actually means the code won't compile in Java (unlike C, where it would compile and always be "true").
//
//The fix is to use == for equality comparison:
//



int x = 10;
if (x == 10)
    System.out.println("Ten");
