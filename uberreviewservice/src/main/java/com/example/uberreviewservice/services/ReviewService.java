package com.example.uberreviewservice.services;

import com.example.uberreviewservice.models.Review;
import com.example.uberreviewservice.repositories.IReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private final IReviewRepository reviewRepository;

    public ReviewService(IReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************************************");

//        Review r = Review
//                .builder()
//                .Content("Amazing Ride Quality")
//                .Rating(5.0)
//                .build();
//
//        reviewRepository.save(r);

        List<Review> reviewList = reviewRepository.findAll();

        for(Review review : reviewList){
            System.out.println(review.toString());
        }
    }
}
