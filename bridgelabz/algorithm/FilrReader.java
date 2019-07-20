package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilrReader {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\New Text Document.txt");
		FileReader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);
		String s;
		StringBuffer sb = new StringBuffer();
		while ((s = br.readLine()) != null) {
			sb.append(s);
		}
		
		String str = sb.toString();
		String array[] = str.split(",");
		for (String s1 : array) {
			// System.out.print(s1+" ");
		}
		Utility u = new Utility();
		String[] a1 = u.sortSTring(array);
		Utility.binarySearch("kishor", a1);
		br.close();
		
	}
}
