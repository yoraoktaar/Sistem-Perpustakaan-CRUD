import java.util.Scanner;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password, "Admin");
    }

    @Override
    public void interact(LibrarySystem library, Scanner scanner) {
        while (true) {
            System.out.println("\nMENU ADMIN:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Lihat Semua Buku");
            System.out.println("4. Lihat Recycle Bin");
            System.out.println("5. Kembalikan Buku dari Recycle Bin");
            System.out.println("6. Logout");
            System.out.print("Pilih opsi: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("ID Buku: ");
                    String id = scanner.nextLine();
                    System.out.print("Judul: ");
                    String title = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                case "2":
                    System.out.print("ID Buku yang akan dihapus: ");
                    String deleteId = scanner.nextLine();
                    library.deleteBook(deleteId);
                    break;
                case "3":
                    library.displayBooks();
                    break;
                case "4":
                    library.displayRecycleBin();
                    break;
                case "5":
                    library.displayRecycleBin();
                    System.out.print("Masukkan ID Buku yang ingin dikembalikan: ");
                    String restoreId = scanner.nextLine();
                    library.restoreBook(restoreId);
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}
