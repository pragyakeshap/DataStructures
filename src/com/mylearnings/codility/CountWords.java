package com.mylearnings.codility;

public class CountWords {
    public int solution(String S){
        int pre=0;
        int post=0;
        String[] sentences=S.split("(?<=[,.?!])");
        for(int i=0;i<sentences.length;i++){
            String[] words=sentences[i].split(".\\s+");
            post=words.length;
            //System.out.println(post);
            if(post<pre){
                post=pre;
            }
            else{
                pre=post;
            }

           System.out.println(sentences[i]);
        }



        return post;
    }

    public static void main(String[] args) {
        CountWords c=new CountWords();
     int op=c.solution("Lets count how many words are in this");
        System.out.println(op);
    }
}