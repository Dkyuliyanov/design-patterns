package factories;

import java.util.List;

interface CommunityThread {
    public String getTitle();
    public String getParentPost();
    public String getReplies();

}

class AccountsCommunityThread implements CommunityThread{

    protected String title;
    protected String parentPost;
    protected List<String> repliesList;

    public AccountsCommunityThread(String title, String parentPost, List<String> repliesList) {
        this.title = title;
        this.parentPost = parentPost;
        this.repliesList = repliesList;
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getParentPost() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getReplies() {
        // TODO Auto-generated method stub
        return null;
    }
    
}

