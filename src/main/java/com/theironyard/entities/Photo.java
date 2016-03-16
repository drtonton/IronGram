package com.theironyard.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by noellemachin on 3/15/16.
 */
@Entity
@Table(name="photos")
public class Photo {

    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    User sender;

    @ManyToOne
    User recipient;

    @Column(nullable = false)
    String filename;

    @Column(nullable = false)
    LocalDateTime time;

    @Column(nullable = false)
    int exist;

    public Photo(User sender, User recipient, String filename, LocalDateTime time, int exist) {
        this.sender = sender;
        this.recipient = recipient;
        this.filename = filename;
        this.time = time;
        this.exist = exist;
    }

    public Photo() {
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getExist() {
        return exist;
    }
}
