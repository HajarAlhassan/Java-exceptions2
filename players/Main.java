package players;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        System.out.println(getPlayerScore("players.txt"));
    }
    /////////////////////////////// First ///////////////////////////////////////////
//    public static int getPlayerScore(String playerFile){
//        Scanner contents=null;
//        try {
//            contents = new Scanner(new File(playerFile));
//            return Integer.parseInt(contents.nextLine());
//        } catch (FileNotFoundException noFile ) {
//            System.out.println("File not found, resetting score.");
//            return 0;
//        } finally {
//            try {
//                if (contents != null) {
//                    contents.close();
//                }
//            } catch (IOException io) {
//                System.out.println("Couldn't close the reader!" +io);
//            }
//        }
//    }

    ////////////////////////// Second //////////////////////
    public static int getPlayerScore(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile)) ) {
            return Integer.parseInt(contents.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("Player file not found! "+ e);
            return 0;
        } catch (IOException e) {
            System.out.println("Player file wouldn't load! "+e);
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("Player file was corrupted! "+ e);
            return 0;
        }
    }
    /////////////////////// Third  //////////////////////
//    public static int getPlayerScore(String playerFile) {
//        try (Scanner contents = new Scanner(new File(playerFile))) {
//            return Integer.parseInt(contents.nextLine());
//        } catch (IOException | NumberFormatException e) {
//            System.out.println("Failed to load score!" + e);
//            return 0;
//        }
//    }
    //////////////////////////////////////////////////
    public static List<Player> getPlayers() throws IOException {
        Path path = Paths.get("players.dat");
        List<String> players = Files.readAllLines(path);

        return players.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }

    public List<Player> loadAllPlayers(String playersFile) throws TimeoutException {
        try {
            throw new NullPointerException();
        } catch (Throwable t) {
            throw t;
        }
    }
}
