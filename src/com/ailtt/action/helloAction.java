package com.ailtt.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/1/4.
 */
public class helloAction extends ActionSupport {

    private String name;
    @Override
    public String execute() throws Exception {
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
