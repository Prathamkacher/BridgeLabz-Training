package com.json.iplandcensoranalyzer;

public class Censor {

    public static String maskTeam(String team) {
        int index = team.lastIndexOf(" ");
        return (index > 0) ? team.substring(0, index) + " ***" : "***";
    }

    public static void censorMatch(Match m) {
        m.team1 = maskTeam(m.team1);
        m.team2 = maskTeam(m.team2);
        m.winner = maskTeam(m.winner);
        m.player_of_match = "REDACTED";
    }
}
