package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String Text = scanner.nextLine();
        scanner.close();

        if (Palindrome(Text)) {
            System.out.println("'" + Text + "' adalah palindrome.");
        } else {
            System.out.println("'" + Text + "' bukan palindrome.");
        }
    }

    /**
     * @param text
     *  Metod ini akan memeriksa apakah text yang telah kita input merupakan sebuah palindrome
     *
     */
    public static boolean Palindrome(String text) {
        // Menghapus spasi
        text = text.replaceAll("\\s", " ").toLowerCase();
        // Menghapus tanda baca dan karakter selain huruf atau angka
        text = text.replaceAll("[^a-zA-Z0-9]", " ");
        // Mengecek apakah kata atau kalimat tersebut adalah palindrome
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}