/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Kiranreddy
 */
public class Validation {
       
    // this will validate the name field
    public boolean validateName(JTextField ok){
        String enteredText = ok.getText();
        if(ok.getText().isEmpty()){
            return false;
        }
        else{
            Pattern namePattern = Pattern.compile("[A-Za-z\\s-.]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches()){
                return true;
            }
        }
        return false;
    }
    // this will validate the user  name
    // this is similar to name with available numbers
    public boolean validateUserName(JTextField ok){
        String enteredText = ok.getText();
        if(ok.getText().isEmpty()){
            return false;
        }
        else{
            Pattern namePattern = Pattern.compile("[A-Z0-9a-z\\s-.]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches()){
                return true;
            }
        }
        return false;
    }
    
    public boolean validateAddress(JTextField ok){
        return this.validateUserName(ok);
    }
    
    
    public boolean validatePhone(JTextField phone){
        
        String phoneNumber = phone.getText();
        String enteredPhoneNumber = (phoneNumber.replace("-", "").
                replace(".", "").replace(" ", "").replace("(", "").replace(")", "").
                replace("+", ""));
        
//        Pattern pattern = Pattern.compile("^[2-9][0-8]\\d[2-9]\\d{6}");
        Pattern pattern = Pattern.compile("^(1?)[2-9][0-8]\\d[2-9]\\d{6}");
        // ^(1?)[2-9][0-8]\d[2-9]\d{6}
        Matcher matcher = pattern.matcher(enteredPhoneNumber);

        if(matcher.matches()){
            if(enteredPhoneNumber.startsWith("1") && enteredPhoneNumber.length()==11){
                return true;
            }
            else if(enteredPhoneNumber.length() == 10){
                return true;
            }
        }
        return false;
    }
        
}
