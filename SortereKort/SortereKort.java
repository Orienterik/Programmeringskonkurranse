import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortereKort {

    public static void main(String[] args) throws FileNotFoundException {
        int[] cards;
        try (Scanner scanner = new Scanner(new File("inputEksempel1"))) {
            cards = new int[scanner.nextInt()];
            for (int i = 0; i < cards.length; i++) {
                // Shift cards from 1-13 interval to 0-12 interval
                cards[i] = scanner.nextInt() - 1;
            }
        }

        int[] longestIncreasingSequenceEndingWith = new int[13];
        for (int card : cards) {

            // Find longest sequence that ends with a card that is lower or equal to the
            // next card
            int longestSequenceThatCanBeExtended = 0;
            for (int c = 0; c <= card; c++) {
                if (longestIncreasingSequenceEndingWith[c] > longestSequenceThatCanBeExtended) {
                    longestSequenceThatCanBeExtended = longestIncreasingSequenceEndingWith[c];
                }
            }

            // Check if the new sequence created by extending previous sequence with the
            // next card is better than the previous sequence ending with the same value
            // card
            if (longestSequenceThatCanBeExtended + 1 > longestIncreasingSequenceEndingWith[card]) {
                longestIncreasingSequenceEndingWith[card] = longestSequenceThatCanBeExtended + 1;
            }
        }

        int longestIncreasingSequence = 0;
        for (int c = 0; c < longestIncreasingSequenceEndingWith.length; c++) {
            if (longestIncreasingSequenceEndingWith[c] > longestIncreasingSequence) {
                longestIncreasingSequence = longestIncreasingSequenceEndingWith[c];
            }
        }

        int cardsToMove = cards.length - longestIncreasingSequence;
        System.out.println(cardsToMove);
    }
}