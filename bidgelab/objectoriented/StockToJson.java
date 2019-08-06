package com.bidgelab.objectoriented;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class StockToJson {
ObjectMapper map=new ObjectMapper();
	
	
	public void addToJson(ArrayList<StockValue> list,String path) throws JsonGenerationException, JsonMappingException, IOException
	{
		map.writeValue(new FileWriter(path), list);
	}


}
