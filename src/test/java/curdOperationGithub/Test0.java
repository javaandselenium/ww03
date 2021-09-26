package curdOperationGithub;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Test0 {
	@Test
	public void getOperatio() {
		when()
		.get("https://api.github.com/repos/javaandselenium/wsao1advance")
		.then().log().all();
		
	}

}
