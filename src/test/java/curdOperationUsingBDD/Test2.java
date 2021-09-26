package curdOperationUsingBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test2 {
	@Test
	public void patchOperation() {
		JSONObject j=new JSONObject();
		j.put("title","Apple800");
		
		given()
		.contentType(ContentType.JSON)
		.body(j.toJSONString())
		
		.when()
		.patch("http://localhost:3000/posts/9000000")
		.then().log().all();
		
		
		
	}

}
