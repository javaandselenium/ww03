package parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test0 {
	@Test
	public void getOperation() {
		
		given()
		.pathParam("ownerName","javaandselenium")
		.pathParam("repoName","wec013java")
		
		.when()
		.get("https://api.github.com/repos/{ownerName}/{repoName}")
		
		.then().log().all();
		
	}

}
