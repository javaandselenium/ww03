package validation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Getarepro {
	@Test
	public void demo() {
		when()
		.get("https://api.github.com/repos/javaandselenium/wsao1advance")
	.then().log().all()
	.assertThat().body("[0].full_name",is("javaandselenium/wsao1advance"));
	
	}

}
