package com.mukesh;

public class StringSearch{
    public static void main(String[] args){
        String name = "Mukeshraj";
        char target = 'M';
        System.out.println(stringsearch(name, target));

        System.out.println(search2(name, 'R'));
    }

//    Another method

    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean stringsearch(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target== name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
