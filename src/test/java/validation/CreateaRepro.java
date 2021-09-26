package validation;

import static org.junit.Assert.assertThat;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateaRepro {
	@Test
	public void create() {
		JSONObject jobj=new JSONObject();
		jobj.put("name","qwerty9045");
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(jobj.toJSONString())
		.when()
		.post("https://api.github.com/user/repos")
		.then().log().all()
		.assertThat().header("Server","GitHub.com")
		.assertThat().header("X-RateLimit-Resource","core23453453454");
		
	}
	

}
