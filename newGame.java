public class newGame {

    public static void main(String[] args) {
        Game game1 = new Game("RTS", "Beyond ALL Reason", false, "PC");
        System.out.println(game1);

        game1.setHasCoverArt(true);
        game1.setGenre("Real-time strategy");
        System.out.println("After updating game1:");
        game1.printGame();

        Game game2 = new Game("FPS", "Escape from Tarkov", false, "PC");
        System.out.println(game2);
    }
}