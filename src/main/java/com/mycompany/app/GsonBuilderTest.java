package com.mycompany.app;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

public class GsonBuilderTest {

    public static void main(String[] args) {
        Gson gson = new Gson();
         ContentItemsValue contentItemsValue = new ContentItemsValue();
        contentItemsValue.setContent("hey now");
//        JsonArray jsonArray = new JsonArray();
       // jsonArray.add(gson.toJson(contentItemsValue));
        List<Object> list = new ArrayList<>();
        list.add(contentItemsValue);
        JsonArray jsonArray = gson.toJsonTree(list).getAsJsonArray();
        JsonObject jsonObject = new JsonObject();




        jsonObject.add("contentItems", jsonArray);


        System.out.println(jsonObject.toString());

//        System.out.println(gson.toJson(list));
    }

    public static class ContentItemsValue {

        private String content;
        private String id = "";
        private String created ="";
        private String updated ="";
        private String contenttype;
        private String language;
        private String parentid;
        private String reply;
        private String forward;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }

        public String getContenttype() {
            return contenttype;
        }

        public void setContenttype(String contenttype) {
            this.contenttype = contenttype;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getParentid() {
            return parentid;
        }

        public void setParentid(String parentid) {
            this.parentid = parentid;
        }

        public String getReply() {
            return reply;
        }

        public void setReply(String reply) {
            this.reply = reply;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }
    }

}


