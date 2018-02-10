package com.mylearnings.codility;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

    public static boolean isBalanced(String expression) {
        if ((expression.length() % 2) == 1) return false;
        else {
            Stack<Character> s = new Stack<>();
            for (char bracket : expression.toCharArray())
                switch (bracket) {
                    case '{': s.push('}'); break;
                    case '(': s.push(')'); break;
                    case '[': s.push(']'); break;
                    default :
                        if (s.isEmpty() || bracket != s.peek()) { return false;}
                        s.pop();
                }
            return s.isEmpty();
        }
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int t = 5;
        for (int a0 = 0; a0 < t; a0++) {
            //String expression = in.next();
            String exp = "{[(])}";
            System.out.println( (isBalanced(exp)) ? "YES" : "NO" );
        }
    }
}