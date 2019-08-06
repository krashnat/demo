package com.bidgelab.objectoriented;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockInformation {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ParseException
	{
		ArrayList<StockValue> list=new ArrayList<StockValue>();
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("Enter the no of stock");
		int stocktype=scanner.nextInt();
		for(int i=0;i<stocktype;i++)
		{
			StockValue value=new StockValue();
		System.out.println("Enter the name of stock");
		value.setName(scanner.next());
		System.out.println("Enter the no share ");
		value.setShares(scanner.nextInt());
		System.out.println("Enter the price for share");
		value.setPrice(scanner.nextInt());
		list.add(value);
		}
		StockToJson add=new StockToJson();
		String path="E:\\Programs\\BridgeLabz\\src\\com\\bidgelab\\objectoriented\\JsonStock.json";
		add.addToJson(list, path);
		JSONParser parser=new JSONParser();
		FileReader f=new FileReader("E:\\Programs\\BridgeLabz\\src\\com\\bidgelab\\objectoriented\\JsonStock.json");
		Object object=parser.parse(f);
		JSONArray array=(JSONArray)object;
		for (Object obj1 : array) 
		{
		
			JSONObject object2=(JSONObject)obj1;
			System.out.println("Stock"+"  "+"is"+"  "+object2.get("name"));
			System.out.println("Price of"+" "+object2.get("name")+" "+object2.get("price"));
			System.out.println("No of shares"+" "+object2.get("name")+" "+object2.get("shares"));
            Long value1=(long)object2.get("price");
            Long value2=(long)object2.get("shares");
            System.out.println("total value"+" "+value1*value2);
			
		}
		
		
		
		
	}
	

}
