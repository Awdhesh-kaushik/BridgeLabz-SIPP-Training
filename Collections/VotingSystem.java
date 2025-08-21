import java.util.*;

public class VotingSystem {
    private Map<String, Integer> votes = new HashMap<>();
    private Map<String, Integer> orderedVotes = new LinkedHashMap<>();

    // Cast a vote
    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, votes.get(candidate));
    }

    // Show results in sorted order
    public void showResults() {
        TreeMap<String, Integer> sorted = new TreeMap<>(votes);
        System.out.println("Results (Sorted): " + sorted);
    }

    public void showInsertionOrder() {
        System.out.println("Insertion Order: " + orderedVotes);
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.castVote("Alice");
        vs.castVote("Bob");
        vs.castVote("Alice");
        vs.castVote("Charlie");

        vs.showInsertionOrder();
        vs.showResults();
    }
}
