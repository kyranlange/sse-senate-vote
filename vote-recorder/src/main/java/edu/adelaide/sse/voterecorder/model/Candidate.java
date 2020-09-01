package edu.adelaide.sse.voterecorder.model;

import lombok.Data;

@Data
public class Candidate {

    private String name;
    private String party;

    // Is the candidate above or below the line?
    private Boolean above;
}
