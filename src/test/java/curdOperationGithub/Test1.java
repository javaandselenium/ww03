package curdOperationGithub;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test1 {
	@Test
	public void postOperation() {
		JSONObject j=new JSONObject();
		j.put("name","www03weekendapi90");
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j.toJSONString())
		
		.when()
		.post("https://api.github.com/user/repos")
		
		.then().log().all();
		
		
	}

}
