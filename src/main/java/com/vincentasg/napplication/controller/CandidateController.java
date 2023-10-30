package com.vincentasg.napplication.controller;

import com.vincentasg.napplication.data.Candidate;
import com.vincentasg.napplication.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;
    @GetMapping
    public List<Candidate> findAll()
    {
        return candidateService.findAll();
    }
    @GetMapping("/{id}")
    public Candidate findById(@PathVariable String id)
    {
        return candidateService.findById(id);
    }
    @PostMapping
    public Candidate create(@RequestBody Candidate candidate)
    {
        return candidateService.save(candidate);
    }
    @PutMapping("/{id}")
    public Candidate update(@RequestBody Candidate candidate)
    {
        return candidateService.save(candidate);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id)
    {
        candidateService.deleteById(id);
    }
}
