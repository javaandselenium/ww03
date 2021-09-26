package curdOperationUsingBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test1 {
	@Test
	public void postOperation() {
		JSONObject jobj=new JSONObject();
		jobj.put("title","Iphone900");
		jobj.put("id",9000000);
		
		
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj.toJSONString())
		
		.when()
		.post(" http://localhost:3000/posts")
		
		.then().log().all();
		
		
	}

}
