
package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import utils.InitializationUtility;
import utils.Traversal;

import com.google.gson.Gson;

@Path("/getWordAndAnswer")
public class getWordAndAnswer 
{

	public static final String TRUE = "true";
	public static final String FALSE = "false";
	
	private static final String CORRECT = "correct";
	private static final String INCORRECT = "incorrect";
	private static final String NO_ANSWER = "no answer";
	
	private String ANSWER = NO_ANSWER;
		
	public static final Traversal util = new Traversal();
	public static final InitializationUtility initUtil = new InitializationUtility();
	
	private HashMap<String[], String> wordsMap = new HashMap<String[], String>();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getWordAndAnswer() 
	{
		String answer = NO_ANSWER;
		
		wordsMap = initUtil.initWordsMap(wordsMap);
		Map<String, String> wordAndAnswerMap = new HashMap<String, String>(); 
				
		for (String[] key : wordsMap.keySet())
		{
			for(String word : key)
			{
				answer = wordsMap.get(key);
				wordAndAnswerMap.put(word, answer);
			}
		}
		
		Gson gson = new Gson(); 
		String wordAndAnswerMapJson = gson.toJson(wordAndAnswerMap); 
		
		return wordAndAnswerMapJson;
	}
	
	/**
	 * checks meaning of a word with those defined.
	 * Returns correct if it's a successful match otherwise returns
	 * incorrect.
	 * 
	 * @param word
	 * @param answer
	 * @return
	 */
	@GET
	@Path("/checkAnswer")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public String matchCredentials(@QueryParam("word") String word, @QueryParam("answer") String answer) 
	{
		wordsMap = initUtil.initWordsMap(wordsMap);
		ANSWER = util.getAnswer(wordsMap, word);
		if(!ANSWER.equalsIgnoreCase(NO_ANSWER) && ANSWER.equalsIgnoreCase(answer))
		{
			return CORRECT;
		}
		return INCORRECT;
	}
	
}
