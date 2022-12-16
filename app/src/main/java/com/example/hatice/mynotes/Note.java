package com.example.hatice.mynotes;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Exclude;

public class Note {
    @Exclude
    private String id;
    private Timestamp date;

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    private String content;
}
