package com.qa.morsecode;

public class Runner {

	public static void main(String[] args) {
	//	MorseTranslator translator = new MorseTranslator();
      //  System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));

        EnglishToMorse translatorEnglish = new EnglishToMorse();
        System.out.println(translatorEnglish.translate(null));
        

	}

}
