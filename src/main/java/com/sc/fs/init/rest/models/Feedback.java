package com.sc.fs.init.rest.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Feedback {
	private String productId;
	private int starRating;
	private String comment;
}
