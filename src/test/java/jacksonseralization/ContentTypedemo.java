package jacksonseralization;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ContentTypedemo {
	@Test
	public void create() {
		Github g=new Github("poi908","demo repro");
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(g)
		.when()
		.post("https://api.github.com/user/repos")
		.then().log().all()
		.assertThat().header("Server","GitHub.com")
		.assertThat().header("X-RateLimit-Resource","core");
		
	}
	

}
