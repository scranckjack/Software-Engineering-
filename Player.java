package leader_board;

import java.util.HashMap;
import java.util.Map;

interface Player {
    String getUsername();
}

public class PlayerRecord {
    private Map<String, Integer> records;

    public PlayerRecord(LeaderBoard leaderBoard) {
        this.records = new HashMap<>();
    }

    public void setPlayerRecord(Player player, int score) {
        records.put(player.getUsername(), score);
    }

    public int getPlayerScore(String username) {
        return records.get(username);
    }

    public Map<String, Integer> getRecords() {
        return records;
    }
}
