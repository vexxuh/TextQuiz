/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textquiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Shayne Tuel
 */
public class StoreQuestions {
    
    /**
     * Stores the Letters Questions in a single file.
     * 
     * @param lettersQuestion 
     *      string array of given input     
     */
    public static void StoreLetters(String[] lettersQuestion){
        // set up a null PrintWriter so that writing to the file requires
        // no skill. It does not matter how the elements are added to the file
        // since the each question will be denoted with the appropreate
        // bracket structure.
        PrintWriter pw = null;
        
        // check to see if the following elements are to be saved in
        // just to be safe I made this for each of the
        // methods just for saftey and debugging purposes. 
        try{
            // create new file which will just be the name of the .txt doc
            File file = new File("LettersQuestions.txt");
            // create a new FileWriter so and give it the file and set edit to
            // true.
            FileWriter fw = new FileWriter(file,true);
            // then use pw, which was null, to make sure that the info is not
            // set incorreclty and given['
            pw = new PrintWriter(fw);
            // save the data using a loop from the given String[] that was
            // an @param in the given method header. 
            for(int i = 0; i < lettersQuestion.length; i++){
                String value = lettersQuestion[i];
                if(value.compareTo("|") == 0){
                    pw.print(value);
                } else {
                    pw.print(value + ",");
                }
            }
        } catch(IOException ioex){
            // just trace the stack to see where the conflicting error was
            ioex.printStackTrace();
        } finally {
            // once everything is said and done .close() the file so there is
            // no data leaks.
            if(pw != null) {
                pw.close();
            }
        }
        
    }
    
    /**
     * Stores the multiple choice questions in a single file
     * 
     * @param multipleChoiceQuestions
     *      String array of response for multiple choice questions
     */
    public static void StoreMultipleChoice(String[] multipleChoiceQuestions){
        // set up a null PrintWriter so that writing to the file requires
        // no skill. It does not matter how the elements are added to the file
        // since the each question will be denoted with the appropreate
        // bracket structure.
        PrintWriter pw = null;
        
        // check to see if the following elements are to be saved in
        // just to be safe I made this for each of the
        // methods just for saftey and debugging purposes. 
        try{
            // create new file which will just be the name of the .txt doc
            File file = new File("MultipleChoiceQuestions.txt");
            // create a new FileWriter so and give it the file and set edit to
            // true.
            FileWriter fw = new FileWriter(file,true);
            // then use pw, which was null, to make sure that the info is not
            // set incorreclty and given['
            pw = new PrintWriter(fw);
            // save the data using a loop from the given String[] that was
            // an @param in the given method header. 
            for(int i = 0; i < multipleChoiceQuestions.length; i++){
                String value = multipleChoiceQuestions[i];
                if(value.compareTo("<") == 0 || value.compareTo(">") == 0){
                    pw.print(value);
                } else {
                    pw.print(value + ",");
                }
            }
        } catch(IOException ioex){
            // just trace the stack to see where the conflicting error was
            ioex.printStackTrace();
        } finally {
            // once everything is said and done .close() the file so there is
            // no data leaks.
            if(pw != null) {
                pw.close();
            }
        }
        
    }
    
    /**
     * Stores the multiple choice questions in one.txt file
     * 
     * @param pictureQuestions 
     *      string array of values given for picture questions     
     */
    public static void StorePictureQuestions(String[] pictureQuestions){
        // set up a null PrintWriter so that writing to the file requires
        // no skill. It does not matter how the elements are added to the file
        // since the each question will be denoted with the appropreate
        // bracket structure.
        PrintWriter pw = null;
        
        // check to see if the following elements are to be saved in
        // just to be safe I made this for each of the
        // methods just for saftey and debugging purposes. 
        try{
            // create new file which will just be the name of the .txt doc
            File file = new File("PictureQuestions.txt");
            // create a new FileWriter so and give it the file and set edit to
            // true.
            FileWriter fw = new FileWriter(file,true);
            // then use pw, which was null, to make sure that the info is not
            // set incorreclty and given['
            pw = new PrintWriter(fw);
            // save the data using a loop from the given String[] that was
            // an @param in the given method header. 
            for(int i = 0; i < pictureQuestions.length; i++){
                String value = pictureQuestions[i];
                if(value.compareTo("[") == 0 || value.compareTo("]") == 0){
                    pw.print(value);
                } else {
                    pw.print(value + ",");
                }
            }
        } catch(IOException ioex){
            // just trace the stack to see where the conflicting error was
            ioex.printStackTrace();
        } finally {
            // once everything is said and done .close() the file so there is
            // no data leaks.
            if(pw != null) {
                pw.close();
            }
        }
    }
    
    /**
     * 
     * @param buzzInQuestions 
     */
    public static void StoreBuzzinIn(String[] buzzInQuestions){
        // set up a null PrintWriter so that writing to the file requires
        // no skill. It does not matter how the elements are added to the file
        // since the each question will be denoted with the appropreate
        // bracket structure.
        PrintWriter pw = null;
        
        // check to see if the following elements are to be saved in
        // just to be safe I made this for each of the
        // methods just for saftey and debugging purposes. 
        try{
            // create new file which will just be the name of the .txt doc
            File file = new File("BuzzInQuestions.txt");
            // create a new FileWriter so and give it the file and set edit to
            // true.
            FileWriter fw = new FileWriter(file,true);
            // then use pw, which was null, to make sure that the info is not
            // set incorreclty and given['
            pw = new PrintWriter(fw);
            // save the data using a loop from the given String[] that was
            // an @param in the given method header. 
            for(int i = 0; i < buzzInQuestions.length; i++){
                String value = buzzInQuestions[i];
                if(value.compareTo("{") == 0 || value.compareTo("}") == 0){
                    pw.print(value);
                } else {
                    pw.print(value + ",");
                }
            }
        } catch(IOException ioex){
            // just trace the stack to see where the conflicting error was
            ioex.printStackTrace();
        } finally {
            // once everything is said and done .close() the file so there is
            // no data leaks.
            if(pw != null) {
                pw.close();
            }
        }
    }
    
    /**
     * Stores Numbers Questions in a single file
     * @param numbersQuestions 
     *      string array of numbers questions to be stored
     */
    public static void StoreNumbersQuestions(String[] numbersQuestions){
        // set up a null PrintWriter so that writing to the file requires
        // no skill. It does not matter how the elements are added to the file
        // since the each question will be denoted with the appropreate
        // bracket structure.
        PrintWriter pw = null;
        
        // check to see if the following elements are to be saved in
        // just to be safe I made this for each of the
        // methods just for saftey and debugging purposes. 
        try{
            // create new file which will just be the name of the .txt doc
            File file = new File("NumbersQuestions.txt");
            // create a new FileWriter so and give it the file and set edit to
            // true.
            FileWriter fw = new FileWriter(file,true);
            // then use pw, which was null, to make sure that the info is not
            // set incorreclty and given['
            pw = new PrintWriter(fw);
            // save the data using a loop from the given String[] that was
            // an @param in the given method header. 
            for(int i = 0; i < numbersQuestions.length; i++){
                String value = numbersQuestions[i];
                if(value.compareTo("(") == 0 || value.compareTo(")") == 0){
                    pw.print(value);
                } else {
                    pw.print(value + ",");
                }
            }
        } catch(IOException ioex){
            // just trace the stack to see where the conflicting error was
            ioex.printStackTrace();
        } finally {
            // once everything is said and done .close() the file so there is
            // no data leaks.
            if(pw != null) {
                pw.close();
            }
        }
    }
}
