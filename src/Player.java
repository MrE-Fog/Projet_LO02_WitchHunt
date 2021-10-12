import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score;

    private final String name;

    private boolean witch;

    private boolean identityRevealed;

    public final List<CardState> hand = new ArrayList<>();

    Player(final String name) {
        this.name = name;
    }

    public void addCardToHand(RumourCard rumourCard) {
        this.hand.add(new CardState(rumourCard));
    }

    public void removeCardFromHand(RumourCard rumourCard) {
        this.hand.removeIf(cardState -> cardState.rumourCard == rumourCard);
    }

    public int getScore() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.score;
    }

    public void setScore(final int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.score = value;
    }

    public String getName() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.name;
    }

    public boolean isWitch() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.witch;
    }

    public void setWitch(final boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.witch = value;
    }

    public boolean isIdentityRevealed() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.identityRevealed;
    }

    public void setIdentityRevealed(final boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.identityRevealed = value;
    }

    public void accuse(final Player accusedPlayer) {
    }

    public void revealRumorCard(final RumourCard cardToReveal) {
    }

    public void revealIdentity() {
    }

}