package CardGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import application.Cards;

public class CardsLoader {
    public static LinkedList<Cards> readCardsFromFile() {
        LinkedList<Cards> deck = new LinkedList<>();
        try {
            File file = new File("Cards.csv");
            if (!file.exists()) {
                System.err.println("File not found: Cards.csv");
                return deck;
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            // Skip the header line
            String headerLine = reader.readLine();
            System.out.println("Header Line: " + headerLine);

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length >= 10) {
                    try {
                        String name = tokens[0].trim();
                        String position = tokens[1].trim().toUpperCase(); // Convert to uppercase
                        int pace = Integer.parseInt(tokens[2].trim());
                        int shooting = Integer.parseInt(tokens[3].trim());
                        int passing = Integer.parseInt(tokens[4].trim());
                        int dribbling = Integer.parseInt(tokens[5].trim());
                        int defending = Integer.parseInt(tokens[6].trim());
                        int physicality = Integer.parseInt(tokens[7].trim());
                        int overall = Integer.parseInt(tokens[8].trim());
                        String image = tokens[9].trim();

                        Cards card = new Cards(name, position, pace, shooting, passing, dribbling,
                                defending, physicality, overall, image);
                        deck.add(card);
                    } catch (NumberFormatException e) {
                        System.out.println("Error parsing numeric value in line: " + line);
                    }
                } else {
                    System.out.println("Invalid card data: " + line);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading cards file: " + e.getMessage());
        }

        return deck;
    }
}
