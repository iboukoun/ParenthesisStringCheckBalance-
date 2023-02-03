package Blessing;

import java.util.ArrayDeque;

public class BalanceCheck {
    public static void main(String[]args){
        String strg = "((()))()(((())(()()()))((((())))()()))";
        if(checkParentesBalance(strg)){
            System.out.println("string ="+strg+ "\nis balance");
        }else {System.out.println("string = " +strg + "is not balance");}
    }
    static boolean checkParentesBalance(String str){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char []s = str.toCharArray();
        for (char cha : s){
            if(cha=='('){
                stack .add(cha);
            }else {
                if (!stack.isEmpty() && stack.peek()=='('&& cha==')'){
            stack.pop();
            }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
