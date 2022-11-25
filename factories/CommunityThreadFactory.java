package factories;

import java.util.List;

class ThreadFactory {
    /**
     * @param title
     * @param parentPost
     * @param repliesList
     * @return
     */
    public static CommunityThread createThread(String title, String parentPost, List<String> repliesList) {
        return new AccountsCommunityThread(title, parentPost, repliesList);
    }
}
