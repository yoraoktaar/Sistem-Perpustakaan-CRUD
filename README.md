# Sistem Perpustakaan CRUD 📖🧾📘🖥️🪪
Tugas Kulyah


## 🐻‍❄️ Daftar File
Sistem ini terdiri dari 6 file Java terpisah:
1. Book.java
2. User.java 
3. Admin.java 
4. Member.java
5. LibrarySystem.java 
6. LibraryManagementSystem.java

## 🤍Cara Kompilasi dan Menjalankan
Opsi 1: Kompilasi Semua File Sekaligus
javac *.java
java LibraryManagementSystem

Opsi 2: Kompilasi File per File
javac Book.java
javac User.java
javac Admin.java
javac Member.java
javac LibrarySystem.java
javac LibraryManagementSystem.java
java LibraryManagementSystem

## 🕊️Fitur Sistem
1. Tambah buku baru
2. Hapus buku 
3. Lihat semua buku
4. Cari buku
5. Lihat Recycle Bin
6. Restore buku dari Recycle Bin
7. Hapus permanen dari Recycle Bin

## 🦢Member Features
1. Lihat buku tersedia
2. Pinjam buku
3. Kembalikan buku
4. Cari buku

## 🐏Konsep OOP yang Diimplementasikan
1. Inheritance (Pewarisan)
User (abstract class)
├── Admin (subclass)
└── Member (subclass)

3. Polymorphism
- Method showMenu() dan interact() memiliki implementasi berbeda di Admin dan Member.
- Runtime akan memanggil method sesuai tipe object yang sebenarnya.

3. Encapsulation
- Semua atribut bersifat private.
- Akses data menggunakan getter dan setter.

4. Abstraction
- User adalah kelas abstrak.
- Method abstrak: showMenu() dan interact() harus diimplementasikan oleh subclass.
