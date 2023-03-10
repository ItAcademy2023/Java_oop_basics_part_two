package com.itacademy.eshop.product;

public class paymentReview {

        public String paymentAuthor;
        public int paymentRating;
        public String paymentComment;

        public paymentReview(String paymentAuthor, int paymentRating, String paymentComment) {
            this.paymentAuthor = paymentAuthor;
            this.paymentRating = paymentRating;
            this.paymentComment = paymentComment;
        }

        public String getPaymentAuthor() {
            return paymentAuthor;
        }

        public int getPaymentRating() {
            return paymentRating;
        }

        public String getPaymentComment() {
            return paymentComment;
        }

}
