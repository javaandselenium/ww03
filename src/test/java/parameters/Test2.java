package parameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void demo() {
		
		given()
		.param("q","www03")
		.param("order","asc")
		
		.when()
		.get("https://api.github.com/search/users")
		
		.then().log().all();
		
		
	}
}
