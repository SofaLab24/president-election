package com.vincentasg.napplication.data;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Voter {
    private String id;
    private Region region;
    @DBRef
    private Vote vote;

    public Voter(String id, Region region) {
        this.id = id;
        this.region = region;
        this.vote = null;
    }

    public String getId() {
        return id;
    }

    public Region getRegion() {
        return region;
    }

    public Vote getVote() {
        return vote;
    }
    public void setVote(Vote vote)
    {
        this.vote = vote;
    }
}
