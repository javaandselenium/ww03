package curdOperationGithub;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test2 {
	@Test
	public void updateProject() {
		JSONObject j=new JSONObject();
		j.put("private",false);
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j.toJSONString())
		
		.when()
		.patch("https://api.github.com/repos/javaandselenium/www03weekendapi90")
		
		.then().log().all();
		
	}

}
