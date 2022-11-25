package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        String title = "Community thread title";
        String titlePost = "Community thread title post";

        List<String> repliesList = new ArrayList<>();
        repliesList.add("first reply");
        repliesList.add("second reply");
        repliesList.add("third reply");

        CommunityThreadInterface cmi = CommunityThreadFactory.createCommunityThread(title, titlePost, repliesList);

        System.out.println(cmi.getTitle());
        System.out.println(cmi.getTitlePost());
        cmi.getReplies().forEach(reply -> System.out.println(reply));          
        



        





    }
}
