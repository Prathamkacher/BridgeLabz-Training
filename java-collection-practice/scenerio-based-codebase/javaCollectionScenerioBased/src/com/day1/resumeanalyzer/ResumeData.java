package com.day_1.resumeanalyzer;

import java.util.List;

public class ResumeData {
    String email;
    String phone;
    List<String> matchedKeywords;
    int keywordCount;

    public ResumeData(String email, String phone, List<String> matchedKeywords) {
        this.email = email;
        this.phone = phone;
        this.matchedKeywords = matchedKeywords;
        this.keywordCount = matchedKeywords.size();
    }

    @Override
    public String toString() {
        return "Email: " + email +
               ", Phone: " + phone +
               ", Keywords: " + matchedKeywords +
               ", Match Count: " + keywordCount;
    }
}
