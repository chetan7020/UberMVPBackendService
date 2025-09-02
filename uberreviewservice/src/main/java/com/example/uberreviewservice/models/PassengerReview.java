package com.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
public class PassengerReview extends Review{
    private String passengerReviewContent;
    private String passengerRating;
}
