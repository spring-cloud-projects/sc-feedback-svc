package com.sc.fs.init.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sc.fs.init.rest.models.Feedback;

@Repository
public interface FeedbackServiceRepository extends MongoRepository<Feedback, String>{

}
