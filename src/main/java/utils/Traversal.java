package utils;

import java.util.HashMap;
import java.util.Set;

public class Traversal
{
	private int LENGTH = 0;
	private static final String TRUE = "true";
	private static final String FALSE = "false";
	private String ANSWER = "no answer";
	
	private String checkWordInList(String[] wordsList, String newWord)
	{
		LENGTH = wordsList.length;
		for(String word : wordsList)
		{
			if(word.equalsIgnoreCase(newWord))
			{
				return TRUE;
			}
		}
		return FALSE;
	}
	
	public String getAnswer(HashMap<String[], String> wordsMap, String newWord)
	{
		Set<String[]> listOfWordLists = wordsMap.keySet();
		for(String[] list : listOfWordLists)
		{
			if(checkWordInList(list, newWord).equalsIgnoreCase(TRUE))
			{
				ANSWER = wordsMap.get(list);
			}
		}
		return ANSWER;
	}

}
