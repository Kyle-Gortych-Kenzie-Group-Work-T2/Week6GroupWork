package com.kenzie.book;

import java.util.List;

public class Product {
    private List<String> customerReviews;
    private String goodReadsReview;
    private String bookishReview;

    public Product(List<String> customerReviews, String goodReadsReview, String bookishReview) {
        this.customerReviews = customerReviews;
        this.goodReadsReview = goodReadsReview;
        this.bookishReview = bookishReview;
    }

    public List<String> getCustomerReviews() {
        return customerReviews;
    }

    public String getGoodReadsReview() {
        return goodReadsReview;
    }

    public String getBookishReview() {
        return bookishReview;
    }
}
