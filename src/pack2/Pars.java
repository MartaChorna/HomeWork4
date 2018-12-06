package pack2;
import java.io.File;
import java.io.IOException;

import javax.xml.bind.DataBindingException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Pars {
	public static void main(String[] args) throws DataBindingException  {
		File jsonFile = new File("src/pack2/Folder/task4.json");
		
		
		ObjectMapper mapper= new ObjectMapper();
		try {
			
			MainParser mp= mapper.readValue(jsonFile, MainParser.class);
			
			System.out.println(mp.getEmail());
			
			
		} 
			
		
		catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}



}
