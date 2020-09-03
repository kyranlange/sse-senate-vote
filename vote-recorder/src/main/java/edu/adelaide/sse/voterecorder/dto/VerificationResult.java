package edu.adelaide.sse.voterecorder.dto;

import lombok.Data;

import java.util.List;

@Data
public class VerificationResult {

    Boolean valid;
    List<String> verificationReason;

}
