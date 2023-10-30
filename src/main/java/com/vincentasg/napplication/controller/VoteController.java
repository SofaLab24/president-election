package com.vincentasg.napplication.controller;

import com.vincentasg.napplication.data.Vote;
import com.vincentasg.napplication.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vote")
public class VoteController {

    @Autowired
    private VoteService voteService;
    @GetMapping
    public List<Vote> findAll()
    {
        return voteService.findAll();
    }
    @GetMapping("/{id}")
    public Vote findById(@PathVariable String id)
    {
        return voteService.findById(id);
    }
    @PostMapping
    public Vote create(@RequestBody Vote vote)
    {
        return voteService.save(vote);
    }
    @PutMapping("/{id}")
    public Vote update(@RequestBody Vote vote)
    {
        return voteService.save(vote);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id)
    {
        voteService.deleteById(id);
    }
}
