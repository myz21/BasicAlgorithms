
// Name Surname: Muhammed Yıldız
// Student ID : 23050151035
// Video Link : https://youtu.be/ulGJyhwluFw

/*
Brief explanation of your design
 */
public class Homework1 {

    public class SinglyLinkedList {

        class Song {

            String title;
            String artist;
            int duration;

            public Song(String title, String artist, int duration) {
                this.title = title;
                this.artist = artist;
                this.duration = duration;
            }

            public String toString() {
                return title + " - " + artist + " (" + duration + " s)";
            }
        }

        class Node {

            public Song data;
            public Node next;

            public Node(Song data) {
                this.data = data;
                this.next = null;
            }
        }

        public Node head;

        public SinglyLinkedList(){
            this.head = head;
        }

        public void addSong(String title, String artist, int duration) {
            Song newSong = new Song(title, artist, duration);
            Node newNode = new Node(newSong);
            newNode.next = null;

            Node temp = this.head;

            if(head == null){
                head = newNode;
                return;
            }
            if(temp != null){
                while (temp.next != null) {
                    temp = temp.next;
                }
            }

            temp.next = newNode;

        }

        public void displayPlaylist() {
            Node currentNode = this.head;
            System.out.println("Playlist: ");
            while (currentNode != null) {
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println("");
        }

        public Node removeSong(String title) {
            Node current = head;

            if (head.data.title.equals(title)) {
                Node deleted = head;
                head = head.next;
                System.out.println(deleted.data+" removed succesfully.");
                return deleted;
            }

            //traversing the list to find the song
            while (current.next != null && !current.next.data.title.equals(title)) {
                current = current.next;
            }
            if (current.next == null) {
                System.out.println("There is no song titled as " + title);
                return null;
            }
            if (current.next.data.title.equals(title)) {
                current.next = current.next.next;
                System.out.println(title+" removed succesfully.");
                return current.next;
            } else {
                return null;
            }
        }

    }

    public class DoublyLinkedList {

        class Song {

            String title;
            String artist;
            int duration;

            public Song(String title, String artist, int duration) {
                this.title = title;
                this.artist = artist;
                this.duration = duration;
            }

            public String toString() {
                return title + " - " + artist + " (" + duration + " s)";
            }
        }

        class Node {

            public Song data;
            public Node next;
            public Node prev; //previous node

            public Node(Song data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }

        public Node head;
        private Node currentSong;

        public DoublyLinkedList(){
            this.head = head;
            this.currentSong = null;
        }

        public void addSong(String title, String artist, int duration) {

            //we creating a new song 
            Song newSong = new Song(title, artist, duration);
            Node newNode = new Node(newSong);
            newNode.next = null;

            //initializing the head 
            Node temp = this.head;

            if (head == null) {
                head = newNode;
                return;
            }

            //if the list is not empty
            if (temp != null) {
                while (temp.next != null) {
                    temp = temp.next;
                }
            }
            temp.next = newNode;
            newNode.prev = temp;

        }

        public Node removeSong(String title) {
           
            Node current = head;

            if(head.data.title.equals(title)){
                Node deleted = head;
                head = head.next;
                System.out.println(deleted.data+" removed succesfully.");
                return deleted;
            }
            //traverse
            while (current.next != null && !current.next.data.title.equals(title)) { 
                current.prev = current;
                current = current.next;
            }

            if (current.next == null) {
                System.out.println("there's no song titled as "+title);
            } 
            if (current.next.data.title.equals(title)) {
                current.next = current.next.next;
                //prev of that being current instead of current.next
                current.next.prev = current;
                System.out.println(title+" removed susccesfully.");
                return current.next;
            } else {
                return null;
            }
         
        }

        public void displayPlaylist() {
            Node currentNode = this.head;
            System.out.println("Playlist: ");
            while (currentNode != null) {
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println("");
        }

        public void moveSong(String title, int newPos) {

            Node current = head, prev = null, movingSong = null;
            int index = 0;

            int length = 0;
            Node temp = head;
            while(temp != null){
                length++;
                temp = temp.next;
            }

            if(newPos < 0 || newPos > length){
                System.out.println("Invalid position.");
                return;
            }
            Node movingNode = removeSong(title);

            if (movingNode == null) {
                System.out.println("Song not found, cannot move.");
                return;
            }

            //move start of the list
            if(newPos == 0){
                movingNode.next = head;
                if (head != null){
                    head.prev = movingNode;
                }
                head = movingNode;
                System.out.println(movingNode.data+" removed from old position, moved to new position.");
                return;    
            }

            while(current.next != null && index < newPos -1){
                prev = current;
                current = current.next;
                index++;
            }
            //move end of the list
            if(current.next == null){
                current.next = movingNode;
                movingNode.prev = current;
                movingNode.next = null;
                System.out.println(movingNode.data + " moved to the last position.");
                return;
            }

            movingNode.next = current.next;
            movingNode.prev = current;
            if(current.next != null){
                current.next.prev = movingNode;
            }
            current.next = movingNode;
            System.out.println(movingNode.data+" removed from old position, moved to new position: "+newPos);
        
        }
        
        boolean isPlaying = false;

        public void startPlaying(){
            if (head !=null){
                currentSong = head;
                System.out.println("Now playing: " + currentSong.data);
                isPlaying = true;
                return;
            }
            else {
                System.out.println("The playlist is empty.");
            }
            return;
        }

        public void playNext(){
            if (!isPlaying) {
                System.out.println("Please start playing a song first.");
                return; // Do nothing if no song is currently playing
            }
            if(currentSong != null && currentSong.next != null){
                currentSong = currentSong.next;
                System.out.println("Now playing: "+currentSong.data);
            } else {
                System.out.println("This is the last song in the playlist. ");
            }
        } 
        
        public void playPrevious(){
            if (!isPlaying) {
                System.out.println("Please start playing a song first.");
                return; // Do nothing if no song is currently playing
            }
            if(currentSong != null && currentSong.prev != null){
                currentSong = currentSong.prev;
                System.out.println("Now playing: "+currentSong.data);
            } else {
                System.out.println("This is the first song in the playlist. ");
            }
        }

        public void reversePlaylist(){

            this.head.prev = null;

            if (head == null || head.next == null){
                System.out.println("Dont need to reversing because there is one or none song.");
                return;
            }

            Node temp = head;
            Node tempNode = null;

            while(temp != null){
                //swapping
                tempNode = temp.prev;
                temp.prev = temp.next;
                temp.next = tempNode;
                //traversing (we used prev for going through the list, because next and prev swapped)
                temp = temp.prev;
            }

      
            if( tempNode != null){
                head = tempNode.prev;
            }

            System.out.println("Playlist is reversed.");

        }

        public void searchSong(String title){
            if (head == null){
                System.out.println("There's no song");
                return;
            }
            if(head.data.title.equals(title)){
                System.out.println("The song "+head.data+" is found.");
                return;
            }
            Node temp = head;

            while (!temp.data.title.equals(title)) { 
                temp = temp.next;
                if(temp.next == null){
                    break;
                }
            }
            if (temp.data.title.equals(title)) {
                System.out.println("The song "+temp.data+" is found.");
                return;
            }
            else{
                System.out.println("Not found :(");
            }
        }
    }

 
}
