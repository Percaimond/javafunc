package task2;


import java.util.*;


public class TokenScanner {
    public static boolean charEquals(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }
    public static List<String> scanner(String input) {
        List<String> results = new ArrayList<>();

        char[] candidates = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w',
                'x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W',
                'X','Y','Z'};
        char[] figures = {'1','2','3','4','5','6','7','8','9','0'};
        char[] skipCandidates = { '\n', '\r', '\t'};
        char[] sentenceCandidates = {';',',','*'};
        StringBuilder currentToken = new StringBuilder();
        char[] characterArray = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            characterArray[i] = input.charAt(i);
        }

        for(int k = 1; k < characterArray.length-1; k++){

        }
        for(int j = 0; j < characterArray.length; j++){
            char nextChar = characterArray[j];
            char lastChar;
            if(j==0){
                lastChar = characterArray[j];
            }
            else{
                lastChar = characterArray[j-1];
            }
            if((nextChar == ' ')||charEquals(nextChar,skipCandidates)){
                if(currentToken.length()==0) {
                    continue;
                }else{
                    results.add(String.valueOf(currentToken));
                    currentToken.setLength(0);
                }
            }else if(charEquals(nextChar,sentenceCandidates)){
                if(currentToken.length()==0) {
                    currentToken.append(nextChar);
                    results.add(String.valueOf(currentToken));
                    currentToken.setLength(0);
                }else{
                    results.add(String.valueOf(currentToken));
                    currentToken.setLength(0);
                    currentToken.append(nextChar);
                    results.add(String.valueOf(currentToken));
                    currentToken.setLength(0);
                }
            }else if(((charEquals(nextChar,figures))&&(charEquals(lastChar,candidates)))||
                    ((charEquals(nextChar,candidates))&&(charEquals(lastChar,figures)))) {
                results.add(String.valueOf(currentToken));
                currentToken.setLength(0);
                currentToken.append(nextChar);
            }else if(!((charEquals(nextChar,candidates))||((charEquals(nextChar,figures))))){
                return null;
            }else if(j==characterArray.length-1){
                currentToken.append(nextChar);
                results.add(String.valueOf(currentToken));
            }else{
                currentToken.append(nextChar);
            }
        }
        return results;
    }
    public static void main(String[] args){
        String testtingmesting = "u78787878uiuiuiuiui 7uu7uu7uu7uu7u\n7  hjfjh ff\n\n\n\n\n\n";
        System.out.println(scanner(testtingmesting));
    }
}
