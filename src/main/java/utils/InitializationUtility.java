package utils;

import java.util.HashMap;

import constants.WordsList;

public class InitializationUtility
{
	public HashMap<String[], String> initWordsMap(HashMap<String[], String> wordsMap)
	{
		wordsMap.put(WordsList.list1, WordsList.PREDICTION);
		wordsMap.put(WordsList.list2, WordsList.SIGN);
		wordsMap.put(WordsList.list3, WordsList.NEGATIVESIGN);
		wordsMap.put(WordsList.list4, WordsList.ANGRY);
		wordsMap.put(WordsList.list5, WordsList.BOOKISH);
		wordsMap.put(WordsList.list6, WordsList.TEACHER);
		wordsMap.put(WordsList.list7, WordsList.STUDENT);
		wordsMap.put(WordsList.list8, WordsList.SKILLFUL);
		wordsMap.put(WordsList.list9, WordsList.TWISTS);
		wordsMap.put(WordsList.list10, WordsList.INCLINATION);
		wordsMap.put(WordsList.list11, WordsList.SLOW);
		wordsMap.put(WordsList.list12, WordsList.HORRIFYING);
		wordsMap.put(WordsList.list13, WordsList.BEAUTIFUL);
		wordsMap.put(WordsList.list14, WordsList.SEPARATE);
		wordsMap.put(WordsList.list15, WordsList.CONNECTED);
		wordsMap.put(WordsList.list16, WordsList.TALENTED);
		wordsMap.put(WordsList.list17, WordsList.FOOLISH);
		wordsMap.put(WordsList.list18, WordsList.AVOID);
		wordsMap.put(WordsList.list19, WordsList.TAKEAPART);
		wordsMap.put(WordsList.list20, WordsList.AWKWARD);
		wordsMap.put(WordsList.list21, WordsList.CHANGES);

		return wordsMap;
	}
}
