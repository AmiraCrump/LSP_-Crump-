package org.howard.edu.lsp.finalexam;
import java.util.HashMap;

public class NullMapException extends Exception
{
	public static void execption(HashMap<String, String>map1, HashMap <String, String> map2)
	
	if (map1.containsValue(null) || map2.containsValue(null))
	{
		throw new RunTimeExeption("One or both maps are null");
	}
}
}
