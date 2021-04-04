package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Box {

    protected String m_content;
    protected String m_owner;

    public Box(String m_content, String m_owner) {
        this.m_content = m_content;
        this.m_owner = m_owner;
    }
}

