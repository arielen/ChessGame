import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player : players) {
            System.out.println(player);
        }
        HashMap<String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);
    }

    public ArrayList<Player> createPlayers() {
        Player whitePlayer = new Player("Jhon", "qweqwe@mail.ru", true, 2000, 20);
        Player blackPlayer = new Player("Jhuanna", "ajsdkjkasd@mail.ru", false, 3000, 30);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }

    public HashMap<String, Piece> createPieces() {
        King whiteKing = new King(new Spot("h", 7), "white_king", true);
        Rook whiteRock1 = new Rook(new Spot("a", 7), "white_rock1", true);
        Rook whiteRock2 = new Rook(new Spot("g", 7), "white_rock2", true);
        King blackKing = new King(new Spot("d", 8), "black_king", false);
        Knight blackKnight1 = new Knight(new Spot("d", 6), "black_knight1", false);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRock1.getId(), whiteRock1);
        pieceHashMap.put(whiteRock2.getId(), whiteRock2);
        pieceHashMap.put(blackKnight1.getId(), blackKnight1);
        return pieceHashMap;
    }

    public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap) {
        // move 1
        try {
            players.get(0).movePiece(hashMap.get("white_rock1"), new Spot("a", 8));
            players.get(1).movePiece(hashMap.get("black_knight1"), new Spot("c", 8));
        } catch (IllegalArgumentException err) {
            System.out.println("The move is incorrect, please try again!");
            //retry functionality
        }

    }
}
