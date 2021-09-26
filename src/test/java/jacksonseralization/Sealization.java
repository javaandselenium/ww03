package jacksonseralization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.testng.annotations.Test;


import io.restassured.mapper.ObjectMapper;

public class Sealization {
	@Test
	public void demo() throws JsonGenerationException, JsonMappingException, IOException {
		Project pobj=new Project("APitest","GIT-100","200","5");
	org.codehaus.jackson.map.ObjectMapper mapper=new org.codehaus.jackson.map.ObjectMapper();
	
	mapper.writeValue(new File("./project.json"),pobj);
		
		
	}
		
		
	

}
