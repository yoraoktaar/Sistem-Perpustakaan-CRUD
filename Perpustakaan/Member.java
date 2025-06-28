import java.util.Scanner;

public class Member extends User {
    public Member(String username, String password) {
        super(username, password, "Member");
    }

    @Override
    public void interact(LibrarySystem library, Scanner scanner) {
        while (true) {
            System.out.println("\nMENU MEMBER:");
            System.out.println("1. Lihat Buku");
            System.out.println("2. Logout");
            System.out.print("Pilih opsi: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    library.displayBooks();
                    break;
                case "2":
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}