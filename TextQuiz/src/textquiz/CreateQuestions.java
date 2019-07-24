/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textquiz;

/**
 *
 * @author Shayne Tuel
 */
public class CreateQuestions {
    
   /**
    * Method requests just a question and its answer. The method will then
    * determine the first letter anyways without much thought to the user.
    * -> |...| letter symbol
    * 
    * @param question
    *    Question for letters round
    * @param ansValue
    *    The word that is the answer to the question
    * @return
    *   String array of the values that will be stored
    */
   public static String[] createLettersQuestions(String question, 
           String ansValue){
       String temp = ansValue;
       String letter = temp.substring(0, 1);
       String[] questionText = {"|",question, letter, ansValue, "|"};
       return questionText; 
   }
   
   /**
    * Method requests a question and 4 possible answers
    * -> <...> multiple choice symbol
    * @param question
    *   Question for the Multiple choice Round
    * @param ans1
    *   potential answer 4.
    * @param ans2
    *   potential answer 4.
    * @param ans3
    *   potential answer 4.
    * @param ans4
    *   potential answer 4.
    * @param correctChoice
    *   The correct answer to the question.
    * @return
    *   String array of the values that will be stored
    */
    public static String[] createMultQuestions(String question, String ans1,
           String ans2, String ans3, String ans4, String correctChoice){
       String[] questionText = {"<", question, ans1, ans2, ans3, ans4, ">"};
       return questionText;
   }
   
    /**
     * This method will create the picture round questions. The value 'placeHolder'
     * is just a temp value that will be replaced once I know what to do with
     * it.
     * -> [...] pic round symbol
     * 
     * @param question
     *     Question for the picture round
     * @param placeHolder
     *     This will be where the location or the image will be added
     * @return
     *    String array of the values that will be stored
     */
    public static String[] createPicQuestions(String question, String placeHolder){
        String[] questionText = {"[",question, placeHolder, "]"};
        return questionText;
    }
    
    
    /**
     * Method is used for Buzz in round. Only a question is needed
     * -> {...} Buzz in round symbol
     * @param question
     *    Question for the Buzz in Round
     * @return 
     *  String array of the value(s) that will be stored
     */
   public static String[] createBuzzQuestions(String question){
       String[] questionText = {"{",question, "}"};
       return questionText;
   }
   
   /**
    *-> (...) numbers round symbol 
    * @param question
    *      The question for the numbers round
    * @param ans
    *      An int will be entered
    * @return
    *      String array of the values that will be stored.
    */
   public static String[] createNumbersQuestions(String question, int ans){
       String[] questionText = {"(",question, Integer.toString(ans), ")"};
       return questionText;
   }
}