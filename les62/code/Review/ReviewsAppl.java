package Review;


import java.util.List;

public class ReviewsAppl {
    public static void main(String[] args) {
        //Создаем объект для хранения отзывов и рейтингов
        Ratings ratings = new RatingImpl(List.of(
                new Review(2, "User111", "Phone1", "Bad",5),
                new Review(3, "User222", "Phone2", "Ok",15),
                new Review(4, "User333", "Phone2", "Not bad",12),
                new Review(1, "User111", "Phone1", "Bad",2),
                new Review(5, "User333", "Phone2", "Good",26)
        ));

        double avgRating = ratings.getAvgRatingByProduct("Phone1");
        String product = "Phone1";
        System.out.println("\t"+"Средний рейтинг по продукту " + product+ ": " + avgRating);
        System.out.println("\t"+"Поиск по автору: ");
        ratings.getReviewsByAuthor("User333").forEach(System.out::println);
        System.out.println("==================");

        System.out.println("\t"+"Все отзывы (отсортированные по рейтингу):");
        ratings.getAllReviews();
        System.out.println("\t"+"Все отзывы (отсортированные по автору):");
        ratings.getAllProd();
        System.out.println("\t"+"Товар с наибольшим кол-м отзывов:");
        ratings.getAllProdMaxRev();
        System.out.println("Товар с найбольшим кол-м лайков");
        ratings.getReviewsMaxLikes().forEach(System.out::println);



//
    }
}