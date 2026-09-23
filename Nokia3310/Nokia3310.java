import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("""
=====================================
          NOKIA 3310 MENU
=====================================
1. PhoneBook
2. Messages
3. Chat
4. Call Register
5. Tones
6. Settings
7. Call Divert
8. Games
9. Calculator
10. Reminder
11. Clock
12. Profiles
13. SIM Services

0. Exit
=====================================""");

            System.out.print("\nEnter your choice: ");
            number = Integer.parseInt(sc.nextLine());

            switch (number) {
                case 1: // PHONEBOOK
                    System.out.println("""

PHONEBOOK
1. Search
2. Service No
3. Add name
4. Erase
5. Edit
6. Assign tone
7. Send b'card
8. Options
9. Speed dials
10. Voice tags
0. Back""");

                    System.out.print("\nEnter choice: ");
                    number = Integer.parseInt(sc.nextLine());

                    switch (number) {
                        case 8: // Options submenu
                            System.out.println("""

OPTIONS
1. Type of view
2. Memory status""");
                            System.out.print("\nEnter number from 1-2: ");
                            number = Integer.parseInt(sc.nextLine());
                            switch (number) {
                                case 1:
                                    System.out.println("Type of view");
                                    break;
                                case 2:
                                    System.out.println("Memory status");
                                    break;
                            }
                            break;
                        case 1:
                            System.out.println("Search");
                            break;
                        case 2:
                            System.out.println("Service No");
                            break;
                        case 3:
                            System.out.println("Add name");
                            break;
                        case 9:
                            System.out.println("Speed dials");
                            break;
                        case 10:
                            System.out.println("Voice tags");
                            break;
                    }
                    break;

                case 2: // MESSAGES
                    System.out.println("""

MESSAGES
1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox number
10. Service command editor
0. Back""");

                    System.out.print("\nEnter choice: ");
                    number = Integer.parseInt(sc.nextLine());

                    switch (number) {
                        case 7: // Message settings
                            System.out.println("""

MESSAGE SETTINGS
1. Set
2. Common""");
                            System.out.print("\nEnter number from 1-2: ");
                            number = Integer.parseInt(sc.nextLine());

                            switch (number) {
                                case 1:
                                    System.out.println("""

SET
1. Message centre number
2. Message sent as
3. Message validity""");
                                    System.out.print("\nEnter number from 1-3: ");
                                    number = Integer.parseInt(sc.nextLine());
                                    switch (number) {
                                        case 1:
                                            System.out.println("Message centre number");
                                            break;
                                        case 2:
                                            System.out.println("Message sent as");
                                            break;
                                        case 3:
                                            System.out.println("Message validity");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("""

COMMON
1. Delivery reports
2. Reply via same centre
3. Character support""");
                                    System.out.print("\nEnter number from 1-3: ");
                                    number = Integer.parseInt(sc.nextLine());
                                    switch (number) {
                                        case 1:
                                            System.out.println("Delivery reports");
                                            break;
                                        case 2:
                                            System.out.println("Reply via same centre");
                                            break;
                                        case 3:
                                            System.out.println("Character support");
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 1:
                            System.out.println("Write messages");
                            break;
                        case 2:
                            System.out.println("Inbox");
                            break;
                        case 3:
                            System.out.println("Outbox");
                            break;
                        case 4:
                            System.out.println("Picture messages");
                            break;
                        case 5:
                            System.out.println("Templates");
                            break;
                        case 6:
                            System.out.println("Smileys");
                            break;
                        case 8:
                            System.out.println("Info service");
                            break;
                        case 9:
                            System.out.println("Voice mailbox number");
                            break;
                        case 10:
                            System.out.println("Service command editor");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\n>>> Chat opened\n");
                    break;

                case 4: // CALL REGISTER
                    System.out.println("""

CALL REGISTER
1. Missed calls
2. Received calls
3. Dialed numbers
4. Erase recent call lists
5. Show call duration
6. Show call cost
7. Call cost setting
8. Prepaid credit
0. Back""");

                    System.out.print("\nEnter choice: ");
                    number = Integer.parseInt(sc.nextLine());

                    switch (number) {
                        case 5:
                            System.out.println("Show call duration submenu (further options not expanded)");
                            break;
                        case 6:
                            System.out.println("Show call cost submenu");
                            break;
                        case 7:
                            System.out.println("Call cost setting submenu");
                            break;
                        case 1:
                            System.out.println("Missed calls");
                            break;
                        case 2:
                            System.out.println("Received calls");
                            break;
                        case 3:
                            System.out.println("Dialed numbers");
                            break;
                        case 4:
                            System.out.println("Erase recent call lists");
                            break;
                        case 8:
                            System.out.println("Prepaid credit");
                            break;
                    }
                    break;

                case 5: // TONES
                    System.out.println("""

TONES
1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Warning and gaming tones
8. Vibrating alert
9. Screen saver""");

                    System.out.print("\nEnter choice: ");
                    number = Integer.parseInt(sc.nextLine());

                    switch (number) {
                        case 1:
                            System.out.println("Ringing tone");
                            break;
                        case 2:
                            System.out.println("Ringing volume");
                            break;
                        case 3:
                            System.out.println("Incoming call alert");
                            break;
                        case 4:
                            System.out.println("Composer");
                            break;
                        case 5:
                            System.out.println("Message alert tone");
                            break;
                        case 6:
                            System.out.println("Keypad tones");
                            break;
                        case 7:
                            System.out.println("Warning and gaming tones");
                            break;
                        case 8:
                            System.out.println("Vibrating alert");
                            break;
                        case 9:
                            System.out.println("Screen saver");
                            break;
                    }
                    break;

                case 6: // SETTINGS
                    System.out.println("""

SETTINGS
1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings""");

                    System.out.print("\nEnter choice: ");
                    number = Integer.parseInt(sc.nextLine());

                    switch (number) {
                        case 1:
                            System.out.println("Call settings submenu");
                            break;
                        case 2:
                            System.out.println("Phone settings submenu");
                            break;
                        case 3:
                            System.out.println("Security settings submenu");
                            break;
                        case 4:
                            System.out.println("Restore factory settings");
                            break;
                    }
                    break;

                case 7:
                    System.out.println("\n>>> Call Divert\n");
                    break;
                case 8:
                    System.out.println("\n>>> Games\n");
                    break;
                case 9:
                    System.out.println("\n>>> Calculator\n");
                    break;
                case 10:
                    System.out.println("\n>>> Reminder\n");
                    break;

                case 11: // CLOCK
                    System.out.println("""

CLOCK
1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time""");

                    System.out.print("\nEnter choice: ");
                    number = Integer.parseInt(sc.nextLine());

                    switch (number) {
                        case 1:
                            System.out.println("Alarm clock");
                            break;
                        case 2:
                            System.out.println("Clock settings");
                            break;
                        case 3:
                            System.out.println("Date setting");
                            break;
                        case 4:
                            System.out.println("Stopwatch");
                            break;
                        case 5:
                            System.out.println("Countdown timer");
                            break;
                        case 6:
                            System.out.println("Auto update of date and time");
                            break;
                    }
                    break;

                case 12:
                    System.out.println("\n>>> Profiles\n");
                    break;
                case 13:
                    System.out.println("\n>>> SIM Services\n");
                    break;
                case 0:
                    System.out.println("\nGoodbye! 👋");
                    sc.close();
                    return;
                default:
                    System.out.println("\nInvalid choice! Please try again.\n");
            }
        }
    }
}
