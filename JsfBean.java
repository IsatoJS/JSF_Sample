package com.javaee;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class JsfBean implements Serializable{
	private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    // リクエスト受信時に呼ばれる初期化メソッド
    @PostConstruct
    public void init() {
        this.name = "World";
    }
    // submitボタンが押下されたときに呼ばれるメソッド
    public void action() {
        this.name = "Action";
    }
}
