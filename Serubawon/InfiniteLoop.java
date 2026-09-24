An infinite loop is a loop that never stops because its condition always remains true.

Example:

int i = 1;

while (i <= 10) {
    System.out.println(i);
}

Fix:
int i = 1;

while (i <= 10) {
    System.out.println(i);
    i++;
}
