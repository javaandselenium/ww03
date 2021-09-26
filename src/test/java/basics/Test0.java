package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test0 {
	@Test
	public void demo() {
		Response resp = RestAssured.get("https://api.github.com/repos/javaandselenium/wsao1advance");
		//System.out.println(resp.asString());
		
		//json format
		//resp.prettyPrint();
		
		//capture all the response in the form of string and dispaly
		resp.then().log().all();
		
	}

}
