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

        //special case for ; , *
        //keywords select delete update where from big case
        //ignore \n \r \t
        //tokens
        //null if illegal identifier
        //a-z A-Z 1-9
        char[] candidates = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w',
                'x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W',
                'X','Y','Z','1','2','3','4','5','6','7','8','9','0'};

        char[] skipCandidates = { '\n', '\r', '\t'};
        char[] sentenceCandidates = {';',',','*'};
        StringBuilder currentToken = new StringBuilder();
        char[] characterArray = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            characterArray[i] = input.charAt(i);
        }
        //for (char c : characterArray) {
        //System.out.println(c);
        //}
        //fehlt edge case zwischen sentenceCandidates und letter und sentenceCandidates
        //und last iteration
        for(int j = 0; j<characterArray.length; j++){
            char nextChar = characterArray[j];
            if(nextChar == ' '){
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
            }else if(charEquals(nextChar,skipCandidates)) {
                continue;
            }else if(!(charEquals(nextChar,candidates))){
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
        String testtingmesting = "Ok, was\n, ist das ,funktionierend ; abcd;asdv ; *llllll";
        System.out.println(scanner(testtingmesting));
    }
}