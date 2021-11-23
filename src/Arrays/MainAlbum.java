package Arrays;

import java.util.*;

public class MainAlbum {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("StormBringer",4.6);
        album.addSong("Love don't mean a thing",4.22);
        album.addSong("Holy man",4.3);
        album.addSong("Holy on",5.6);
        album.addSong("Lady double dealer",3.21);
        album.addSong("You can't do it right",6.23);
        album.addSong("High ball shooter",4.27);
        album.addSong("The gypsy",4.2);
        album.addSong("Solder of fortune",3.13);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("I put the finger on you",3.25);
        album.addSong("Lets go",3.45);
        album.addSong("Inject the venom",4.51);
        album.addSong("Snowballed",3.35);
        album.addSong("Evil walks",5.25);
        album.addSong("C.O.D",5.32);
        album.addSong("Breaking the rules",5.40);
        album.addSong("Night",5.30);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addPlayList("Holy man", playList);
        albums.get(0).addPlayList("You can't do it right", playList);
        albums.get(0).addPlayList("Speed king", playList); // does not exist
        albums.get(0).addPlayList(9, playList);
        albums.get(1).addPlayList(8, playList);
        albums.get(1).addPlayList(3, playList);
        albums.get(1).addPlayList(2, playList);
        albums.get(1).addPlayList(10, playList); // there is no track 24


        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.isEmpty()){
            System.out.println("No songs in playlist");
            return;
        }
        else{
            System.out.println("Now playing "+ listIterator.next().toString());
            }
        printMenu();
        while (!quit){
            System.out.println("Enter your new action ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){

                case 0:
                    System.out.println("List is complete");
                    quit = true;
                    break;

                case 1:
                    if (!forward){
                        if (listIterator.hasNext())
                            listIterator.next();
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next());
                    }
                    else{
                        System.out.println("Reached end of the list !!!");
                        forward=false;
                    }
                break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious())
                            listIterator.previous();
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous());
                    }
                    else {
                        System.out.println("Reached start of the list !!!");
                        forward=true;
                    }
                break;

                case 3:
                    if (forward){
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous());
                        forward = false;
                    }
                    else
                        System.out.println("Reached start of the list !!!");
                    } else
                    {
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next());
                        forward = true;
                    }
                    else
                        System.out.println("Reached end of the list !!!");
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (!playList.isEmpty()){
                        listIterator.remove();
                        if (listIterator.hasNext())
                            System.out.println("Now playing "+ listIterator.next());
                        else if (listIterator.hasPrevious())
                            System.out.println("Now playing "+ listIterator.previous());
                        else
                            System.out.println("List is empty");
                    }
                    break;
            }


        }

        }
        private static void printMenu(){
            System.out.println("Available options ==========");
            System.out.println("0 - to quit \n"+
                    "1 - play next song \n" +
                    "2 - play previous song \n" +
                    "3 - to replay the current \n"+
                    "4 - list song in the playlist \n"+
                    "5 - print available actions. \n" +
                    "6 - delete the song");
        }

        private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
            System.out.println("==========================");
            while (iterator.hasNext())
                System.out.println(iterator.next());
            System.out.println("===========================");
        }
}
