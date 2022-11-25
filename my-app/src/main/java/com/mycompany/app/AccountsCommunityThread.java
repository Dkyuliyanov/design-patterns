package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class AccountsCommunityThread implements CommunityThreadInterface{
    protected String title;
    protected String titlePost;
    protected List<String> repliesList = new ArrayList<>();

    public AccountsCommunityThread(String title, String titlePost, List<String> repliesList) {
        this.title = title;
        this.titlePost = titlePost;
        this.repliesList = repliesList;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getTitlePost() {
        return this.titlePost;
    }

    @Override
    public List<String> getReplies() {
        return this.repliesList;
    }

    

}
