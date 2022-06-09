package inheritance;

import inheritance.business.Restaurant;

import inheritance.business.Shop;
import inheritance.business.Theater;
import inheritance.review.RestReview;
import inheritance.review.Review;

import inheritance.review.TheaterReview;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class InheritanceTest {
        Restaurant newRestaurant = new Restaurant("Burger Joint", "$$");
        RestReview newReview = new RestReview("chuck", "awful burgers, ok service", 2);
        RestReview newReview2 = new RestReview("chuck", "It's fine, just fine", 4);

        @Test
        void restaurantConstructorReturnsNameAndPrice() {
            assertSame("Burger Joint", newRestaurant.getName());
            assertSame("$$", newRestaurant.getPrice());
        }

        @Test
        void restaurantToStringReturnsData() {
            assertEquals("Burger Joint $$ 0" ,newRestaurant.toString());
        }

        @Test
        void reviewConstructorReturnsInputs() {
            assertSame("chuck", newReview.getAuthor());
            assertSame("awful burgers, ok service", newReview.getText());
            assertEquals(2, newReview.getNumOfStars());
        }

        @Test
        void reviewToStringReturnsData() {
            assertEquals("author: chuck text: awful burgers, ok service numOfStars: 2", newReview.toString());
        }

        @Test
        void restaurantArrayListReturnsUpdated() {
            newRestaurant.addReview(newReview);
            Review checkReview = newRestaurant.getReviewList().get(0);
            assertEquals("author: chuck text: awful burgers, ok service numOfStars: 2", checkReview.toString());
        }

        @Test
        void restaurantNumOfStarsReturnsUpdatedStars() {
            newRestaurant.addReview(newReview);
            newRestaurant.addReview(newReview2);
            assertEquals(3, newRestaurant.getNumOfStars());
        }

        @Test
        void ShopClassConstructorAndReviewMethodsWork() {
            Shop newShop = new Shop("Lowes", "$$", "we sell hardware");
        }

        @Test
        void TheaterClassAddsAndRemovesMovies() {
            Theater newTheater = new Theater("Destinta");
            newTheater.addMovie("The Hateful 8");
            newTheater.addMovie("Mad Max: Fury Road");
            assertEquals("[The Hateful 8, Mad Max: Fury Road]", newTheater.getMovieList().toString());
            newTheater.removeMovie("The Hateful 8");
            assertEquals("[Mad Max: Fury Road]", newTheater.getMovieList().toString());
        }

        @Test
        void TheaterHoldsReviews() {
            Theater newTheater = new Theater("Destinta");
            TheaterReview review = new TheaterReview("Chuck","The Hateful 8","A Tarantino Agatha Christe movie", 5);
            TheaterReview review2 = new TheaterReview("Chuck","Mad Max: Fury Road","second best action movie ever", 4);
            newTheater.addReview(review);
            newTheater.addReview(review2);
            assertEquals("author: Chuck movie: The Hateful 8 text: A Tarantino Agatha Christe movie numOfStars: 5", newTheater.getReviewList().get(0).toString());
            assertEquals(4, newTheater.getNumOfStars());
        }
    }


