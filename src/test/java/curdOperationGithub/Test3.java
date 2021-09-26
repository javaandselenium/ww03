package curdOperationGithub;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test3 {
	@Test
	public void deleteReuest() {
		
		given()
		.auth().oauth2("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")
		
		.when()
		.delete("https://api.github.com/repos/javaandselenium/www03weekendapi90")
		
		.then().log().all();
	}

}
