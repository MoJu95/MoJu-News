package com.moju.mojunews;


public class News {
    String mTitle;
    String mAuthor;
    String mUrl;
    String mDate;
    String mSection;

    public News(String title, String author, String url, String date, String section) {
        this.mTitle = title;
        this.mAuthor = author;
        this.mUrl = url;
        this.mDate = date;
        this.mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }


    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }


    public String getDate() {
        return mDate;
    }


    public String getSection() {
        return mSection;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + mTitle + '\'' +
                ", author='" + mAuthor + '\'' +
                ", url='" + mUrl + '\'' +
                ", date='" + mDate + '\'' +
                ", section='" + mSection + '\'' +
                '}';
    }
}
