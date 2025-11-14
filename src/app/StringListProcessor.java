package app;

public class StringListProcessor {
    static int countUppercase(String s){

        char[] array = s.toCharArray();
        int count = 0;
        for(Character ch: array){
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        return count;
    }
}
