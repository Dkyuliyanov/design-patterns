package com.mycompany.app;

import java.util.List;

public class CommunityThreadFactory {

    public static CommunityThreadInterface createCommunityThread(String title, String titlePost, List<String> repliesList) {
        return new AccountsCommunityThread(title, titlePost, repliesList);
    }
}
