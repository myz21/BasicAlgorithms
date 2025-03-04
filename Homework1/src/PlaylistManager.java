// PlaylistManager.java

import java.util.Scanner;



public class PlaylistManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // You can choose to work with SinglyLinkedList or DoublyLinkedList
        // You need to develop them both.
       
        // For Part 1, uncomment the next line:
        Hw1.SinglyLinkedList playlist = new Hw1().new SinglyLinkedList();
        // For Part 2, uncomment the next line:
        //Hw1.DoublyLinkedList playlist = new Hw().new DoublyLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Display Playlist");
            System.out.println("4. Move Song (doubly linked list only)");
            System.out.println("5. Start to playing the Song (doubly linked list only)");
            System.out.println("6. Play Next Song (doubly linked list only)");
            System.out.println("7. Play Previous Song (doubly linked list only)");
            System.out.println("8. Reverse the playlist (doubly linked list only)");
            System.out.println("9. Search the song by its title (doubly linked list only)");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter duration (sec): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    playlist.addSong(title, artist, duration);
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    title = scanner.nextLine();
                    playlist.removeSong(title);
                    break;
                case 3:
                    playlist.displayPlaylist();
                    break;
                /*
                case 4:
                    // For doubly linked list only
                    System.out.print("Enter song title to move: ");
                    title = scanner.nextLine();
                    System.out.print("Enter new position: ");
                    int newPos = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    playlist.moveSong(title, newPos);
                    break;
                     
                case 5:
                    playlist.startPlaying();
                    break;    
                case 6:
                    playlist.playNext();
                    break;
                case 7:
                    playlist.playPrevious();
                    break;
                case 8:
                    playlist.reversePlaylist();
                    break;
                case 9:
                    // For doubly linked list only
                    System.out.print("Enter song title to search: ");
                    String titleSearch = scanner.nextLine();   
                    playlist.searchSong(titleSearch);    
                    break;    
                */    
                case 10:
                    System.out.println("Exiting.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

