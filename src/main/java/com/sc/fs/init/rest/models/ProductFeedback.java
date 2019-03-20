package com.sc.fs.init.rest.models;

import java.util.List;

import lombok.Data;

@Data
public class ProductFeedback {
	private float averageRating;
	private List<Feedback> feedbacks;
}
