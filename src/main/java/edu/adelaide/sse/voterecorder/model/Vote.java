package edu.adelaide.sse.voterecorder.model;

import lombok.Data;

@Data
public class Vote {

    // The preference given to the candidate
    private Integer preference;

    // The Candidate
    private Candidate candidate;

}
