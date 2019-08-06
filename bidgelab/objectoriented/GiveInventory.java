package com.bidgelab.objectoriented;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class GiveInventory {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{
	
	Scanner scanner=new Scanner(System.in);
	ArrayList<InventoryDetail> list=new ArrayList<InventoryDetail>();
	System.out.println("Enetr No of of inventory ");
	int types=scanner.nextInt();
	for(int i=1;i<=types;i++)
	{
		InventoryDetail detail=new InventoryDetail();
		System.out.println("Enter name of"+i+"st types of inventory");
		detail.setName(scanner.next());
		System.out.println("Enter the weight");
		detail.setWeight(scanner.nextFloat());
		System.out.println("Enter the price");
		detail.setPrice(scanner.nextInt());
		list.add(detail);	
	}
	AddToJSON add=new AddToJSON();
	String path="E:\\Programs\\BridgeLabz\\src\\com\\bidgelab\\objectoriented\\newinventory.json";
	add.addToJson(list,path);
	
	
	
	}
}