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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    phoneBook();
                    break;

                case 2:
                    messages();
                    break;

                case 3:
                    System.out.println("Chat");
                    break;

                case 4:
                    callRegister();
                    break;

                case 5:
                    tones();
                    break;

                case 6:
                    settings();
                    break;

                case 7:
                    System.out.println("Call divert");
                    break;

                case 8:
                    music();
                    break;

                case 9:
                    games();
                    break;

                case 10:
                    System.out.println(" Calculator");
                    break;

                case 11:
                    System.out.println(" Reminders");
                    break;

                case 12:
                    clock();
                    break;

                case 13:
                    System.out.println("Profiles");
                    break;

                case 14:
                    System.out.println("Services");
                    break;

                case 15:
                    System.out.println("SIM services");
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Search");
                    break;

                case 2:
                    System.out.println("Service Nos.");
                    break;

                case 3:
                    System.out.println("Add name");
                    break;

                case 4:
                    System.out.println("Erase");
                    break;

                case 5:
                    System.out.println("Edit");
                    break;

                case 6:
                    System.out.println("Copy");
                    break;

                case 7:
                    System.out.println("Assign tone");
                    break;

                case 8:
                    System.out.println("Send b'card");
                    break;

                case 9:
                    phoneBookOptions();
                    break;

                case 10:
                    System.out.println("Speed dials");
                    break;

                case 11:
                    System.out.println("Voice tags");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Memory in use");
                    break;

                case 2:
                    System.out.println("Type of view");
                    break;

                case 3:
                    System.out.println("Memory status");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

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

                case 7:
                    messageSettings();
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

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    messageSet();
                    break;

                case 2:
                    messageCommon();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Message centre number");
                    break;

                case 2:
                    System.out.println("Messages sent as");
                    break;

                case 3:
                    System.out.println("Message validity");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Delivery reports");
                    break;

                case 2:
                    System.out.println("Reply via same centre");
                    break;

                case 3:
                    System.out.println("Character support");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Missed calls");
                    break;

                case 2:
                    System.out.println("Received calls");
                    break;

                case 3:
                    System.out.println("Dialled numbers");
                    break;

                case 4:
                    System.out.println("Erase recent call lists");
                    break;

                case 5:
                    callDuration();
                    break;

                case 6:
                    callCosts();
                    break;

                case 7:
                    callCostSettings();
                    break;

                case 8:
                    System.out.println("Prepaid credit");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Last call duration");
                    break;

                case 2:
                    System.out.println("All calls' duration");
                    break;

                case 3:
                    System.out.println("Received calls' duration");
                    break;

                case 4:
                    System.out.println("Dialled calls' duration");
                    break;

                case 5:
                    System.out.println("Clear timers");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Last call cost");
                    break;

                case 2:
                    System.out.println("All calls' cost");
                    break;

                case 3:
                    System.out.println("Clear counters");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Call cost limit");
                    break;

                case 2:
                    System.out.println("Show costs in");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

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
                    System.out.println("Message alert tone");
                    break;

                case 5:
                    System.out.println("Keypad tones");
                    break;

                case 6:
                    System.out.println("Warning tones");
                    break;

                case 7:
                    System.out.println("Vibrating alert");
                    break;

                case 8:
                    System.out.println("Screen saver");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    callSettings();
                    break;

                case 2:
                    phoneSettings();
                    break;

                case 3:
                    securitySettings();
                    break;

                case 4:
                    System.out.println("Restore factory settings");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Automatic redial");
                    break;

                case 2:
                    System.out.println("Speed dialling");
                    break;

                case 3:
                    System.out.println("Call waiting options");
                    break;

                case 4:
                    System.out.println("Own number sending");
                    break;

                case 5:
                    System.out.println("Phone line in use");
                    break;

                case 6:
                    System.out.println("Automatic answer");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Language");
                    break;

                case 2:
                    System.out.println("Cell info display");
                    break;

                case 3:
                    System.out.println("Welcome note");
                    break;

                case 4:
                    System.out.println("Network selection");
                    break;

                case 5:
                    System.out.println("Confirm SIM service actions");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("PIN code request");
                    break;

                case 2:
                    System.out.println("Call barring service");
                    break;

                case 3:
                    System.out.println("Fixed dialling");
                    break;

                case 4:
                    System.out.println("Closed user group");
                    break;

                case 5:
                    System.out.println("Security level");
                    break;

                case 6:
                    System.out.println("Change access codes");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Music player");
                    break;

                case 2:
                    System.out.println("Radio");
                    break;

                case 3:
                    System.out.println("Recorder");
                    break;

                case 4:
                    System.out.println("Track list");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    selectGame();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    snake();
                    break;

                case 2:
                    System.out.println("Space Impact");
                    break;

                case 3:
                    System.out.println("Bantumi");
                    break;

                case 4:
                    System.out.println("Pairs II");
                    break;

                case 5:
                    System.out.println("Bumper");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("New game");
                    break;

                case 2:
                    System.out.println("High scores");
                    break;

                case 3:
                    System.out.println("Options");
                    break;

                case 4:
                    System.out.println("Instructions");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
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
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

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

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
