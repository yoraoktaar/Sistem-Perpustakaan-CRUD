// Kompilasi semua file Java dengan perintah:
//      javac *.java
// Jalankan aplikasi utama dengan perintah:
//      java LibraryManagementSystem

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibrarySystem library = new LibrarySystem();

        displayHeader();

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("\n=== LOGIN ===");
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    User currentUser = library.login(username, password);
                    if (currentUser != null) {
                        System.out.println("\nLOGIN BERHASIL! Selamat datang, " + currentUser.getUsername() + " (" + currentUser.getRole() + ")");
                        currentUser.interact(library, scanner);
                        System.out.println("Anda telah logout dari sistem.");
                    } else {
                        System.out.println("LOGIN GAGAL! Username atau password salah.");
                    }
                    break;
                case "2":
                    System.out.println("\n=== REGISTER ===");
                    System.out.print("Buat Username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Buat Password: ");
                    String newPassword = scanner.nextLine();
                    System.out.print("Role (admin/member): ");
                    String role = scanner.nextLine();

                    boolean registered = library.registerUser(newUsername, newPassword, role);
                    if (registered) {
                        System.out.println("Registrasi berhasil! Silakan login.");
                    } else {
                        System.out.println("Registrasi gagal! Username sudah digunakan atau role tidak valid.");
                    }
                    break;
                case "3":
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }

    private static void displayHeader() {
        System.out.println("SISTEM MANAJEMEN PERPUSTAKAAN");
    }
}