package com.sample.user;

import javax.validation.constraints.Size;

public class CommandForm {

    @Size(max=80)
    private String stdid;

    @Size(min=1, max=140)
    private String text;

    public String getName() {
        return text;
    }

    public void setName(String stdid) {
        this.stdid = stdid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
	
}
