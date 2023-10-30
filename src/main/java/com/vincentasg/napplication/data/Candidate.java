package com.vincentasg.napplication.data;
import org.springframework.data.annotation.Id;

public class Candidate {
    @Id
    private String id;
    private String name;
    private String agenda;
    private int listNumber;

    public Candidate(String name, String agenda, int listNumber) {
        this.name = name;
        this.agenda = agenda;
        this.listNumber = listNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAgenda() {
        return agenda;
    }

    public int getListNumber() {
        return listNumber;
    }
}
