package app;

public class StringListProcessor {
    static int countUppercase(String text){
        int count = 0;
        for(Character ch: text.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        return count;
    }
}
