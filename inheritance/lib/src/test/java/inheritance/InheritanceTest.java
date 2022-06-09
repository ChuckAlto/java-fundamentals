package inheritance;

import inheritance.business.Restaurant;

import inheritance.review.RestReview;
import inheritance.review.Review;

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

    }
