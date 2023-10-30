package com.vincentasg.napplication.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Vote {
    @Id
    private String id;
    @DBRef
    private Candidate candidate;
    private Region region;

    public Vote(Candidate candidate, Region region) {
        this.candidate = candidate;
        this.region = region;
    }

    public String getId() {
        return id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public Region getRegion() {
        return region;
    }
}
