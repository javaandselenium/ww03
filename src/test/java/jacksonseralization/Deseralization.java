package jacksonseralization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Deseralization {
	@Test
	public void demo() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		Project pobj = mapper.readValue(new File("./project.json"),Project.class);
		System.out.println(pobj.projectId);
		System.out.println(pobj.projectName);
		System.out.println(pobj.teamsize);
		System.out.println(pobj.status);
	}

}
