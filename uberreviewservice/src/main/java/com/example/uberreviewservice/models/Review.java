package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Table(name = "booking_review")
@Getter
@Setter
@ToString
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{
    @Column(nullable = false)
    private String Content;

    private Double Rating;
}
