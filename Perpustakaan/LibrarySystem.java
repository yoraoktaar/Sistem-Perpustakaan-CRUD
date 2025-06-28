import java.util.*;

public class LibrarySystem {
    private Map<String, User> users = new HashMap<>();
    private List<Book> books = new ArrayList<>();
    private List<Book> recycleBin = new ArrayList<>();

    public boolean registerUser(String username, String password, String role) {
        if (users.containsKey(username)) return false;

        if (role.equalsIgnoreCase("admin")) {
            users.put(username, new Admin(username, password));
        } else if (role.equalsIgnoreCase("member")) {
            users.put(username, new Member(username, password));
        } else {
            return false;
        }
        return true;
    }

    public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void deleteBook(String id) {
        Book toDelete = null;
        for (Book b : books) {
            if (b.getId().equals(id)) {
                toDelete = b;
                break;
            }
        }
        if (toDelete != null) {
            books.remove(toDelete);
            recycleBin.add(toDelete);
            System.out.println("Buku telah dipindahkan ke recycle bin.");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku dalam sistem.");
        } else {
            System.out.println("Daftar Buku:");
            for (Book b : books) {
                System.out.println("- " + b);
            }
        }
    }

    public void displayRecycleBin() {
        if (recycleBin.isEmpty()) {
            System.out.println("Recycle bin kosong.");
        } else {
            System.out.println("Recycle Bin:");
            for (Book b : recycleBin) {
                System.out.println("- " + b);
            }
        }
    }

    public void restoreBook(String id) {
        Book toRestore = null;
        for (Book b : recycleBin) {
            if (b.getId().equals(id)) {
                toRestore = b;
                break;
            }
        }
        if (toRestore != null) {
            recycleBin.remove(toRestore);
            books.add(toRestore);
            System.out.println("Buku berhasil dikembalikan ke daftar utama.");
        } else {
            System.out.println("Buku tidak ditemukan di recycle bin.");
        }
    }
}
