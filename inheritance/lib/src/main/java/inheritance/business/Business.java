package inheritance.business;

import inheritance.review.Review;

import java.util.ArrayList;

public abstract class Business {
    protected String name;
    protected String price;
    protected int numOfStars = 0;
    protected ArrayList<Review> reviewList = new ArrayList<>();


    public void addReview(Review input){
        reviewList.add(input);
        updateStars(input.getNumOfStars());
    }


    public void updateStars(int stars){
        if(numOfStars == 0){
            numOfStars = stars;
        }
        else {
            int num = 0;
            for(Review review : reviewList){
                num += review.getNumOfStars();
            }
            numOfStars = num/reviewList.size();
        }
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }
}