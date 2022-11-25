package com.mycompany.app.com.mycompany.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

import com.mycompany.app.CommunityThreadFactory;
import com.mycompany.app.CommunityThreadInterface;
import com.mycompany.app.Constants;

import org.hamcrest.*;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;



public class MainTest {

    CommunityThreadInterface cmi = CommunityThreadFactory.createCommunityThread(
        Constants.TITLE, Constants.TITLE_POST, Constants.REPLIES_LIST);

    
        

    @Test
    public void communityThreadCreation() {

        List<String> actual = Arrays.asList("first reply", "second reply", "third reply");
        List<String> expected = Constants.REPLIES_LIST;

        assertEquals("community thread title", cmi.getTitle());
        assertEquals("community thread title post", cmi.getTitlePost());
        assertThat(actual, IsEqual.equalTo(expected));
        
    }



   
}
