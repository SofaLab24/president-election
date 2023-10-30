package com.vincentasg.napplication.controller;

import com.vincentasg.napplication.data.Voter;
import com.vincentasg.napplication.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voter")
public class VoterController {

    @Autowired
    private VoterService voterService;
    @GetMapping
    public List<Voter> findAll()
    {
        return voterService.findAll();
    }
    @GetMapping("/{id}")
    public Voter findById(@PathVariable String id)
    {
        return voterService.findById(id);
    }
    @PostMapping
    public Voter create(@RequestBody Voter voter)
    {
        return voterService.save(voter);
    }
    @PutMapping("/{id}")
    public Voter update(@RequestBody Voter voter)
    {
        return voterService.save(voter);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id)
    {
        voterService.deleteById(id);
    }
}
