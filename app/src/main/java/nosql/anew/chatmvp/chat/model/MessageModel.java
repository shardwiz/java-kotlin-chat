package nosql.anew.chatmvp.chat.model;

import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;

import nosql.anew.chatmvp.chat.presenter.ModelCallBacks;

/**
 * Created by saksham on 26/6/17.
 */

public class MessageModel {
    private ArrayList<ChatPojo> mMessages;

    public void addMessages(DataSnapshot dataSnapshot, ModelCallBacks callBacks){
        if (mMessages==null){
            mMessages= new ArrayList<>();
        }
        ChatPojo chatPojo=new ChatPojo(dataSnapshot);
        mMessages.add(chatPojo);
        callBacks.onModelUpdated(mMessages);
    }
}
