package bigtwo;

public class BigTwoRules {

    private static boolean isPair(Card[] card) {
        return card.length == 2 && (card[0].getRank() == card[1].getRank());
    }

    private static boolean isThreeOfAKind(Card[] card) {
        return card.length == 3
                &&//
                (card[0].getRank() == card[1].getRank()
                && card[1].getRank() == card[2].getRank());
    }

    private static int convertRankToNumber(Card card) {
        switch (card.getRank()) {
            case 'A':
                return 1;

            case '2':
                return 2;

            case '3':
                return 3;

            case '4':
                return 4;

            case '5':
                return 5;

            case '6':
                return 6;

            case '7':
                return 7;

            case '8':
                return 8;

            case '9':
                return 9;

            case 'T':
                return 10;

            case 'J':
                return 11;

            case 'Q':
                return 12;

            case 'K':
                return 13;
            default:
                throw new IllegalArgumentException("Invaild Rank: " + card.getRank());
        }
    }
    //bubbleSort, MergeSort

    private static void bubbleSortCard(Card[] card) {
        int n = card.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (convertRankToNumber(card[j]) > convertRankToNumber(card[j + 1])) {
                    Card temp = card[j];
                    card[j] = card[j + 1];
                    card[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) { //loop j after
                break;
            }
        }

    }

    private static boolean isFlush(Card[] card) {//花
        if (card.length != 5) {
            return false;
        }

        if (isStraight(card) == true) {
            char suit1 = card[0].getSuit();
            char suit2 = card[1].getSuit();
            char suit3 = card[2].getSuit();
            char suit4 = card[3].getSuit();
            char suit5 = card[4].getSuit();

            return suit1 == suit2 && suit3 == suit4 && suit1 == suit5 && suit1 == suit4;
        }
        return false;

    }

    private static boolean isFullHouse(Card[] card) { //3same +2same
        if (card.length != 5) {
            return false;
        }
        bubbleSortCard(card);

        boolean condition1 = (card[0].getRank() == card[1].getRank()
                && card[1].getRank() == card[2].getRank()
                && //first 3 cards
                card[3].getRank() == card[4].getRank()); //last 2 cards

        boolean condition2 = (card[0].getRank() == card[1].getRank()
                && card[2].getRank() == card[3].getRank()
                && card[3].getRank() == card[4].getRank());

        return condition1 || condition2;
    }

    private static boolean isFourOfAKind(Card[] card) {
        return false;
    }

    private static boolean isStraight(Card[] card) {//蛇
        if (card.length != 5) {
            return false;
        }
        //sorting first
        bubbleSortCard(card);

        //special case: A,J,Q,K
        if (convertRankToNumber(card[0]) == 1
                && convertRankToNumber(card[1]) == 10
                && convertRankToNumber(card[2]) == 11
                && convertRankToNumber(card[3]) == 12
                && convertRankToNumber(card[4]) == 13) {
            return true;
        }

        for (int i = 0; i < 4; i++) {
            if (convertRankToNumber(card[i]) + 1 != convertRankToNumber(card[i + 1]))//3 ==4? (3+1) =4?
            {
                return false;
            }
        }
        return true;

    }

    private static boolean isStraightAndFlush(Card[] card) {
        return isStraight(card) && isFlush(card);
    }

    public static void main(String[] args) {
        Card[] straigCards = {
            new Card('A', '♠'),
            new Card('2', '♡'),
            new Card('3', '♡'),
            new Card('4', '♠'),
            new Card('5', '♠')
    };

    // Card[] flushCards5
}

}
