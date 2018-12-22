package com.example.snl41_000.newsapp;

public class News {

    String mTitle;
    String mSectionName;
    String mWebPublicationDate;
    String mWebUrl;
    String mFirstName;
    String mLastName;


    public News(String mTitle, String mSectionName, String mWebPublicationDate, String mWebUrl) {
        this.mTitle = mTitle;
        this.mSectionName = mSectionName;
        this.mWebPublicationDate = mWebPublicationDate;
        this.mWebUrl = mWebUrl;
    }

    public News(String mTitle, String mSectionName, String mWebPublicationDate, String mWebUrl, String mFirstName) {
        this.mTitle = mTitle;
        this.mSectionName = mSectionName;
        this.mWebPublicationDate = mWebPublicationDate;
        this.mWebUrl = mWebUrl;
        this.mFirstName = mFirstName;
    //    this.mLastName = mLastName;
    }


    public String getmWebUrl() {
        return mWebUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSectionName() {
        return mSectionName;
    }

    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getmFirstName() {
        return mFirstName;
    }
    public String getmLastName() {
        return mLastName;
    }
}