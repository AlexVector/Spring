package com.example.spring;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long postid;
    private String authorname;
    private String postdate;
    private String posttext;

    public Post(){}

    public Post(long postid, String authorname, String postdate, String posttext) {
        this.postid = postid;
        this.authorname = authorname;
        this.postdate = postdate;
        this.posttext = posttext;
    }

    public Post(String authorname, String postdate, String posttext) {
        this.authorname = authorname;
        this.postdate = postdate;
        this.posttext = posttext;
    }

    public long getPostid() {
        return postid;
    }

    public void setPostid(long postid) {
        this.postid = postid;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getPosttext() {
        return posttext;
    }

    public void setPosttext(String posttext) {
        this.posttext = posttext;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postid=" + postid +
                ", authorname='" + authorname + '\'' +
                ", postdate='" + postdate + '\'' +
                ", posttext='" + posttext + '\'' +
                '}';
    }
}
