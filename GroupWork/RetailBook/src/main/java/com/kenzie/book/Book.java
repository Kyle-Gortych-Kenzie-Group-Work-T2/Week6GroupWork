package com.kenzie.book;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Book {
    private ProductInformation productInformation;
    private String author;
    private BigDecimal length;
private Product product;
    public Book(ProductInformation productInformation, String author, BigDecimal length) {
        this.productInformation = productInformation;
        this.author = author;
        this.length = length;
    }

    public String getAsin() {

        return this.productInformation.getAsin();
    }

    public String getTitle() {

        return this.productInformation.getDisplayName();
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDescription() {
        return this.productInformation.getDescription();
    }

    public Set<String> getImageUrls() {

        return this.productInformation.getImageUrls();
    }

    public BigDecimal getLength() {
        return this.length;
    }

    public double calculateSimilarity(Book other) {

        return this.productInformation.calculateSimilarity(other.productInformation);
    }
public String getGoodReadsReview(){
        return this.product.getGoodReadsReview();
}
public List<String> getCustomerReviews(){
        return this.product.getCustomerReviews();
}
public String getBookishReview(){
        return this.product.getBookishReview();
}

    @Override
    public int hashCode() {
        return Objects.hash(this.getAsin());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if(this==o){
            return true;
        }
        if(getClass()!=o.getClass()){
            return false;
        }
        Book that = (Book) o;
        return Objects.equals(this.getAsin(),that.getAsin());
    }
}
