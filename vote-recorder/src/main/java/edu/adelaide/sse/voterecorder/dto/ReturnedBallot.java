package edu.adelaide.sse.voterecorder.dto;

import lombok.Data;

/**
 * Detail that is returned to the voter to verify their vote.
 */
@Data
public class ReturnedBallot {

    private String text;
    private BallotSignature signature;
    private final String publicKey;

}
