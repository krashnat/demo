package com.bidgelab.objectoriented;

import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class AddToJSON {
	
	ObjectMapper map=new ObjectMapper();
	
	
	public void addToJson(ArrayList<InventoryDetail> list,String path) throws JsonGenerationException, JsonMappingException, IOException
	{
		map.writeValue(new FileWriter(path), list);
	}


}
