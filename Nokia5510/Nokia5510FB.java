
import java.util.Scanner;

public class Nokia5510FB {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("""
                    
                    =========================
                       NOKIA 5510 MENU
                    =========================
                    1. Phone book
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Music
                    9. Games
                    10. Calculator
                    11. Reminders
                    12. Clock
                    13. Profiles
                    14. Services
                    15. SIM services
                    
                    0. Exit
                    =========================
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> phoneBook();

                case 2 -> messages();

                case 3 -> System.out.println("Chat");

                case 4 -> callRegister();

                case 5 -> tones();

                case 6 -> settings();

                case 7 -> System.out.println("Call divert");

                case 8 -> music();

                case 9 -> games();

                case 10 -> System.out.println("Calculator");

                case 11 -> System.out.println("Reminders");

                case 12 -> clock();

                case 13 -> System.out.println("Profiles");

                case 14 -> System.out.println("Services");

                case 15 -> System.out.println("SIM services");

                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void phoneBook() {

        while (true) {

            System.out.println("""
                    
                    ----- PHONE BOOK -----
                    1. Search
                    2. Service Nos.
                    3. Add name
                    4. Erase
                    5. Edit
                    6. Copy
                    7. Assign tone
                    8. Send b'card
                    9. Options
                    10. Speed dials
                    11. Voice tags
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Search");

                case 2 -> System.out.println("Service Nos.");

                case 3 -> System.out.println("Add name");

                case 4 -> System.out.println("Erase");

                case 5 -> System.out.println("Edit");

                case 6 -> System.out.println("Copy");

                case 7 -> System.out.println("Assign tone");

                case 8 -> System.out.println("Send b'card");

                case 9 -> phoneBookOptions();

                case 10 -> System.out.println("Speed dials");

                case 11 -> System.out.println("Voice tags");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void phoneBookOptions() {

        while (true) {

            System.out.println("""
                    
                    ----- PHONE BOOK > OPTIONS -----
                    1. Memory in use
                    2. Type of view
                    3. Memory status
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Memory in use");

                case 2 -> System.out.println("Type of view");

                case 3 -> System.out.println("Memory status");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void messages() {

        while (true) {

            System.out.println("""
                    
                    ----- MESSAGES -----
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
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Write messages");

                case 2 -> System.out.println("Inbox");

                case 3 -> System.out.println("Outbox");

                case 4 -> System.out.println("Picture messages");

                case 5 -> System.out.println("Templates");

                case 6 -> System.out.println("Smileys");

                case 7 -> messageSettings();

                case 8 -> System.out.println("Info service");

                case 9 -> System.out.println("Voice mailbox number");

                case 10 -> System.out.println("Service command editor");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void messageSettings() {

        while (true) {

            System.out.println("""
                    
                    ----- MESSAGE SETTINGS -----
                    1. Set
                    2. Common
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> messageSet();

                case 2 -> messageCommon();

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void messageSet() {

        while (true) {

            System.out.println("""
                    
                    ----- MESSAGE SETTINGS > SET -----
                    1. Message centre number
                    2. Messages sent as
                    3. Message validity
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Message centre number");

                case 2 -> System.out.println("Messages sent as");

                case 3 -> System.out.println("Message validity");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void messageCommon() {

        while (true) {

            System.out.println("""
                    
                    ----- MESSAGE SETTINGS > COMMON -----
                    1. Delivery reports
                    2. Reply via same centre
                    3. Character support
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Delivery reports");

                case 2 -> System.out.println("Reply via same centre");

                case 3 -> System.out.println("Character support");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void callRegister() {

        while (true) {

            System.out.println("""
                    
                    ----- CALL REGISTER -----
                    1. Missed calls
                    2. Received calls
                    3. Dialled numbers
                    4. Erase recent call lists
                    5. Show call duration
                    6. Show call costs
                    7. Call cost settings
                    8. Prepaid credit
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Missed calls");

                case 2 -> System.out.println("Received calls");

                case 3 -> System.out.println("Dialled numbers");

                case 4 -> System.out.println("Erase recent call lists");

                case 5 -> callDuration();

                case 6 -> callCosts();

                case 7 -> callCostSettings();

                case 8 -> System.out.println("Prepaid credit");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void callDuration() {

        while (true) {

            System.out.println("""
                    
                    ----- SHOW CALL DURATION -----
                    1. Last call duration
                    2. All calls' duration
                    3. Received calls' duration
                    4. Dialled calls' duration
                    5. Clear timers
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Last call duration");

                case 2 -> System.out.println("All calls' duration");

                case 3 -> System.out.println("Received calls' duration");

                case 4 -> System.out.println("Dialled calls' duration");

                case 5 -> System.out.println("Clear timers");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void callCosts() {

        while (true) {

            System.out.println("""
                    
                    ----- SHOW CALL COSTS -----
                    1. Last call cost
                    2. All calls' cost
                    3. Clear counters
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Last call cost");

                case 2 -> System.out.println("All calls' cost");

                case 3 -> System.out.println("Clear counters");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void callCostSettings() {

        while (true) {

            System.out.println("""
                    
                    ----- CALL COST SETTINGS -----
                    1. Call cost limit
                    2. Show costs in
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Call cost limit");

                case 2 -> System.out.println("Show costs in");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void tones() {

        while (true) {

            System.out.println("""
                    
                    ----- TONES -----
                    1. Ringing tone
                    2. Ringing volume
                    3. Incoming call alert
                    4. Message alert tone
                    5. Keypad tones
                    6. Warning tones
                    7. Vibrating alert
                    8. Screen saver
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Ringing tone");

                case 2 -> System.out.println("Ringing volume");

                case 3 -> System.out.println("Incoming call alert");

                case 4 -> System.out.println("Message alert tone");

                case 5 -> System.out.println("Keypad tones");

                case 6 -> System.out.println("Warning tones");

                case 7 -> System.out.println("Vibrating alert");

                case 8 -> System.out.println("Screen saver");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void settings() {

        while (true) {

            System.out.println("""
                    
                    ----- SETTINGS -----
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> callSettings();

                case 2 -> phoneSettings();

                case 3 -> securitySettings();

                case 4 -> System.out.println("Restore factory settings");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void callSettings() {

        while (true) {

            System.out.println("""
                    
                    ----- CALL SETTINGS -----
                    1. Automatic redial
                    2. Speed dialling
                    3. Call waiting options
                    4. Own number sending
                    5. Phone line in use
                    6. Automatic answer
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Automatic redial");

                case 2 -> System.out.println("Speed dialling");

                case 3 -> System.out.println("Call waiting options");

                case 4 -> System.out.println("Own number sending");

                case 5 -> System.out.println("Phone line in use");

                case 6 -> System.out.println("Automatic answer");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void phoneSettings() {

        while (true) {

            System.out.println("""
                    
                    ----- PHONE SETTINGS -----
                    1. Language
                    2. Cell info display
                    3. Welcome note
                    4. Network selection
                    5. Confirm SIM service actions
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Language");

                case 2 -> System.out.println("Cell info display");

                case 3 -> System.out.println("Welcome note");

                case 4 -> System.out.println("Network selection");

                case 5 -> System.out.println("Confirm SIM service actions");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void securitySettings() {

        while (true) {

            System.out.println("""
                    
                    ----- SECURITY SETTINGS -----
                    1. PIN code request
                    2. Call barring service
                    3. Fixed dialling
                    4. Closed user group
                    5. Security level
                    6. Change access codes
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("PIN code request");

                case 2 -> System.out.println("Call barring service");

                case 3 -> System.out.println("Fixed dialling");

                case 4 -> System.out.println("Closed user group");

                case 5 -> System.out.println("Security level");

                case 6 -> System.out.println("Change access codes");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void music() {

        while (true) {

            System.out.println("""
                    
                    ----- MUSIC -----
                    1. Music player
                    2. Radio
                    3. Recorder
                    4. Track list
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Music player");

                case 2 -> System.out.println("Radio");

                case 3 -> System.out.println("Recorder");

                case 4 -> System.out.println("Track list");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void games() {

        while (true) {

            System.out.println("""
                    
                    ----- GAMES -----
                    1. Select game
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> selectGame();

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void selectGame() {

        while (true) {

            System.out.println("""
                    
                    ----- SELECT GAME -----
                    1. Snake II
                    2. Space Impact
                    3. Bantumi
                    4. Pairs II
                    5. Bumper
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> snake();

                case 2 -> System.out.println("Space Impact");

                case 3 -> System.out.println("Bantumi");

                case 4 -> System.out.println("Pairs II");

                case 5 -> System.out.println("Bumper");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void snake() {

        while (true) {

            System.out.println("""
                    
                    ----- SNAKE II -----
                    1. New game
                    2. High scores
                    3. Options
                    4. Instructions
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("New game");

                case 2 -> System.out.println("High scores");

                case 3 -> System.out.println("Options");

                case 4 -> System.out.println("Instructions");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }


    static void clock() {

        while (true) {

            System.out.println("""
                    
                    ----- CLOCK -----
                    1. Alarm clock
                    2. Clock settings
                    3. Date setting
                    4. Stopwatch
                    5. Countdown timer
                    6. Auto update of date and time
                    
                    0. Back
                    """);

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Alarm clock");

                case 2 -> System.out.println("Clock settings");

                case 3 -> System.out.println("Date setting");

                case 4 -> System.out.println("Stopwatch");

                case 5 -> System.out.println("Countdown timer");

                case 6 -> System.out.println("Auto update of date and time");

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

