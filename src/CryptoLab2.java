import java.util.Scanner;
import java.util.InputMismatchException;

public class CryptoLab2 {
    static String decrypt(String input, int key) {
        char[] a = input.toCharArray();
        String plaintext = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                plaintext += ' ';
            } else {
                int inverse=Inverse(key);
                int pi = ((int) (a[i] - 97) * inverse) % 26;
                plaintext += (char) (pi + 97);
            }
        }
        return plaintext;
    }

    static int Inverse(int k){
        int ans=0;
        for(int i=0;i<26;i++){
            if(i%2==0 || i==13){
                continue;
            }
            if((k *i) % 26 == 1){
                ans=i;
                break;
            }
        }
        return ans;
    }

    static String encrypt(String input, int key) {
        char[] a = input.toCharArray();
        String ciphertext = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                ciphertext += ' ';
            } else {
                int ci = ((int) (a[i] - 97) * key) % 26;
                ciphertext += (char) (ci + 97);
            }
        }
        return ciphertext;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (true) {
            try {
                System.out.println("Press key 1 for Encryption");
                System.out.println("Press key 2 for Decryption");
                System.out.println("Press key 3 for Brute force");
                System.out.println("Press key 4 for Exit");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice <= 0 || choice > 4) {
                    System.out.println("Invalid option. Please enter a number between 1 and 4.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        String input = "";
                        int key = 0;
                        do {
                            System.out.print("Enter the plain text: ");
                            input = sc.nextLine();
                            if (input.matches("^[a-z ]+$")) {
                                break;
                            } else {
                                System.out.println(
                                        "Invalid input. Please enter only lowercase alphabetic letters and spaces.");
                            }
                        } while (true);
                        do {
                            System.out.print("Enter the key: ");
                            try {
                                key = sc.nextInt();
                                if (key >= 0 && key <= 25) {
                                    break;
                                } else {
                                    System.out.println("Invalid key. Enter a number between 0 and 25");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid key. Enter a valid number between 0 and 25");
                                sc.nextLine();
                            }
                        } while (true);
                        sc.nextLine();
                        String encryptedText = encrypt(input, key);
                        System.out.println("Your encrypted text: " + encryptedText.toUpperCase());
                        input = "";
                        System.out.println();
                        continue;
                    case 2:
                        do {
                            System.out.print("Enter the cipher text: ");
                            input = sc.nextLine();
                            if (input.matches("^[A-Z ]+$")) {
                                break;
                            } else {
                                System.out.println(
                                        "Invalid input. Please enter only uppercase alphabetic letters and spaces.");
                            }
                        } while (true);
                        do {
                            System.out.print("Enter the key: ");
                            try {
                                key = sc.nextInt();
                                if (key >= 0 && key <= 25) {
                                    break;
                                } else {
                                    System.out.println("Invalid key. Enter a number between 0 and 25");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid key. Enter a valid number between 0 and 25");
                                sc.nextLine();
                            }
                        } while (true);
                        sc.nextLine();
                        String decryptedText = decrypt(input.toLowerCase(), key);
                        System.out.println("Your decrypted text: " + decryptedText);
                        input = "";
                        System.out.println();
                        continue;
                    case 3:
                        System.out.print("Enter the plain text: ");
                        String plain = sc.nextLine();
                        System.out.print("Enter the cipher text: ");
                        String cipher = sc.nextLine();
                        int myKey = 0;
                        for (int i = 0; i < 26; i++) {
                            String decrypted = decrypt(cipher.toLowerCase(), i);
                            if (decrypted.equals(plain)) {
                                System.out.println("Decrypted text using Brute force: " + decrypted);
                                myKey = i;
                                break;
                            }
                        }
                        System.out.println("Your Key = " + myKey);
                        System.out.println();
                        continue;
                    case 4:
                        System.out.println("Exiting...");
                        exit = true;
                        break;
                }
                if (exit) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                continue;
            }
        }
        sc.close();
    }
}
