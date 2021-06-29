public class Player {

    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;

    public Player(String name, String email, boolean white, int rank, int age) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("The name should not be empty");
        } else {
            this.name = name;
        }

        if (email == null || email.isBlank() || email.isEmpty()) {
            throw new IllegalArgumentException("The email should not be empty");
        }
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("The email should contain '@' and '.'");
        } else {
            this.email = email;
        }

        this.white = white;

        if (rank < 100 || rank > 3000) {
            throw new IllegalArgumentException("The rank should be in range of 100 and 300");
        } else {
            this.rank = rank;
        }

        if (age < 18 || age > 80) {
            throw new IllegalArgumentException("The age should be in range of 18 and 80");
        } else {
            this.age = age;
        }

    }

    public void setRank(int rank) {
        if (rank < 100 || rank > 3000) {
            throw new IllegalArgumentException("The rank should be in range of 100 and 300");
        }
        this.rank = rank;
        System.out.println("The rank of " + name + " was changed to " + rank);
    }

    public void movePiece(Piece piece, Spot spot) {
        if (isWhite() != piece.isWhite()) {
            throw new IllegalArgumentException("Incorrect piece color. Try again");
        }

        piece.setSpot(spot);
        System.out.println("Piece " + piece.getName() + " is moved to: " + spot);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isWhite() {
        return white;
    }

    public int getRank() {
        return rank;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Chess Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}
