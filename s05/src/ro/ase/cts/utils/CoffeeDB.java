package ro.ase.cts.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CoffeeDB {
	public static List<String> coffeeNames;
	
	public static void connectDB(String user, String pw) throws IOException {
		coffeeNames = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("coffee.txt"));
		String line = "";
		
		while((line = reader.readLine()) != null) {
			coffeeNames.add(line);
		}
		
	}
	
	public static String selectCoffeeByName(String name) {
		return coffeeNames.get(coffeeNames.indexOf(name));
	}
	
	public static String selectCoffeeByIndex(int index) {
		return coffeeNames.get(index);
	}
	
	public static void closeDB(String user, String pw) {
		coffeeNames.removeAll(coffeeNames);
	}
}
