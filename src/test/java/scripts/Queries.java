package scripts;

public class Queries {

	public static final String TOP_10_HORROR_MOVIES = "SELECT FILM.TITLE AS MOVIE_NAME, CATEGORY.NAME AS CATEGORY_NAME , LANGUAGE.NAME AS LANGUAGE_NAME FROM CATEGORY\r\n"
			+ "JOIN\r\n"
			+ "FILM_CATEGORY\r\n"
			+ "ON\r\n"
			+ "CATEGORY.CATEGORY_ID = FILM_CATEGORY.CATEGORY_ID\r\n"
			+ "JOIN\r\n"
			+ "FILM\r\n"
			+ "ON\r\n"
			+ "FILM_CATEGORY.FILM_ID = FILM.FILM_ID\r\n"
			+ "JOIN\r\n"
			+ "LANGUAGE\r\n"
			+ "ON\r\n"
			+ "FILM.LANGUAGE_ID = LANGUAGE.LANGUAGE_ID\r\n"
			+ "WHERE\r\n"
			+ "LANGUAGE.NAME = 'English'\r\n"
			+ "AND\r\n"
			+ "CATEGORY.NAME ='Horror'\r\n"
			+ "AND\r\n"
			+ "FILM.TITLE LIKE '%Devil'\r\n"
			+ "ORDER BY FILM.TITLE ASC\r\n"
			+ "LIMIT 10;";

}

