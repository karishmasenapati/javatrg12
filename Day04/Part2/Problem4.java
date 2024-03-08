import java.util.ArrayList;
import java.util.Scanner;

class DirectoryEntry {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueID;

    public DirectoryEntry(String name, String address, String telephoneNumber, String mobileNumber,
                          String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void displayInfo() {
        System.out.println("\nDirectory Entry:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
    }
}

public class DirectoryManager {
    private ArrayList<DirectoryEntry> directory = new ArrayList<>();

    public void createEntry() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter information for a new directory entry:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Telephone Number (with STD code, if available): ");
        String telephoneNumber = scanner.nextLine();
        System.out.print("Mobile Number (if available): ");
        String mobileNumber = scanner.nextLine();
        System.out.print("Head of Family: ");
        String headOfFamily = scanner.nextLine();
        System.out.print("Unique ID: ");
        String uniqueID = scanner.nextLine();

        for (DirectoryEntry entry : directory) {
            if (entry.getUniqueID().equals(uniqueID)) {
                System.out.println("Error: Unique ID already exists. Please choose a different one.");
                return;
            }
        }

       
        for (DirectoryEntry entry : directory) {
            if (entry.getHeadOfFamily().equals(headOfFamily) &&
                    entry.getTelephoneNumber().equals(telephoneNumber)) {
                System.out.println("Error: Telephone number already exists for the same family. Please check.");
                return;
            }
        }

        DirectoryEntry newEntry = new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
        directory.add(newEntry);
        System.out.println("Directory entry created successfully.");
    }

    public void editEntry(String uniqueID) {
        Scanner scanner = new Scanner(System.in);

        for (DirectoryEntry entry : directory) {
            if (entry.getUniqueID().equals(uniqueID)) {
                System.out.println("\nEnter new information for the directory entry with Unique ID " + uniqueID + ":");
                System.out.print("Name: ");
                entry = new DirectoryEntry(scanner.nextLine(), entry.getAddress(),
                        entry.getTelephoneNumber(), entry.getMobileNumber(),
                        entry.getHeadOfFamily(), entry.getUniqueID());
                System.out.println("Directory entry edited successfully.");
                return;
            }
        }

        System.out.println("Error: Directory entry with Unique ID " + uniqueID + " not found.");
    }

    public void searchByKeyword(String keyword) {
        System.out.println("\nSearch results for keyword '" + keyword + "':");

        for (DirectoryEntry entry : directory) {
            if (entry.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getAddress().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getTelephoneNumber().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getMobileNumber().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getHeadOfFamily().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getUniqueID().toLowerCase().contains(keyword.toLowerCase())) {
                entry.displayInfo();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectoryManager directoryManager = new DirectoryManager();

        while (true) {
            System.out.println("\nDirectory Management System Menu:");
            System.out.println("1. Create a new entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    directoryManager.createEntry();
                    break;
                case 2:
                    System.out.print("Enter the Unique ID to edit: ");
                    String editID = scanner.nextLine();
                    directoryManager.editEntry(editID);
                    break;
                case 3:
                    System.out.print("Enter the keyword to search: ");
                    String searchKeyword = scanner.nextLine();
                    directoryManager.searchByKeyword(searchKeyword);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
