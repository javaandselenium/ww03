package parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test1 {
	@Test
	public void demo() {
		
		given()
		.queryParam("q","www03")
		.queryParam("order","asc")
		
		.when()
		.get("https://api.github.com/search/users")
		
		.then().log().all();
		
		
	}

}
