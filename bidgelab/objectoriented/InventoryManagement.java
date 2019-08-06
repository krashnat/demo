package com.bidgelab.objectoriented;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryManagement {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser parser = new JSONParser();

		FileReader f = new FileReader("E:\\Programs\\BridgeLabz\\src\\com\\bidgelab\\objectoriented\\inventory.json");

		Object obj = parser.parse(f);

		JSONArray array1 = (JSONArray) obj;
		for (Object obj1 : array1) {
			long total = 0;
			JSONObject jsonObject1 = (JSONObject) obj1;
			System.err.println(jsonObject1.get("inventory"));
			JSONArray array2 = (JSONArray) jsonObject1.get("inventoryDetails");
			for (Object obj2 : array2) {
				JSONObject jsonObject2 = (JSONObject) obj2;
				System.out.println(jsonObject2.get("Name"));
				System.out.println(jsonObject2.get("amount"));
				System.out.println(jsonObject2.get("weight"));
				total = total + (long) jsonObject2.get("weight");
			}
			System.out.println(jsonObject1.get("inventory") + "    " + total);
		}

	}

}
