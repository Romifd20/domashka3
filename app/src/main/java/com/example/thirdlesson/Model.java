package com.example.thirdlesson;

import android.widget.ImageView;
import android.widget.TextView;

public class Model {
    
    int imageView;
    String header, desc;


    public Model(int imageView, String header, String desc) {
        this.imageView = imageView;
        this.header = header;
        this.desc = desc;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
