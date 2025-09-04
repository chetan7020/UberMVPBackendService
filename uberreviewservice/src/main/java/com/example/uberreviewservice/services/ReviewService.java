package com.example.uberreviewservice.services;

import com.example.uberreviewservice.models.Booking;
import com.example.uberreviewservice.models.Driver;
import com.example.uberreviewservice.models.Review;
import com.example.uberreviewservice.repositories.IBookingRepository;
import com.example.uberreviewservice.repositories.IDriverRepository;
import com.example.uberreviewservice.repositories.IReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private final IReviewRepository reviewRepository;
    private final IBookingRepository bookingRepository;
    private final IDriverRepository driverRepository;

    public ReviewService(IReviewRepository reviewRepository, IBookingRepository bookingRepository, IDriverRepository driverRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("**********************************************************");
//
//        Review r = Review
//                .builder()
//                .Content("Amazing Ride Quality")
//                .Rating(5.0)
//                .build();
//
//        Booking b = Booking
//                .builder()
//                .review(r)
//                .startTime(new Date())
//                .endTime(new Date())
//                .totalDistance(10L)
//                .build();

//        reviewRepository.save(r);
//        bookingRepository.save(b);

//        Optional<Booking> obj = bookingRepository.findById(2L);
//        if(obj.isPresent()){
//            bookingRepository.delete(obj.get());
//        }

//        List<Review> reviewList = reviewRepository.findAll();
//
//        for(Review review : reviewList){
//            System.out.println(review.toString());
//        }

        List<Driver> driverList = driverRepository.findAll();
    }
}
