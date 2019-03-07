package com.gblfy.springboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author gblfy
 * @ClassNme EsBlog
 * @Description TODO
 * @Date 2019/2/28 9:50
 * @version1.0
 */
@Document(indexName = "blog", type = "blog")//文档
public class EsBlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;//主键标识
    private String title;//标题
    private String summery;//摘要
    private String content;//内容

    @Override
    public String toString() {
        return String.format(
                "EsBlog[id='%s',title='%s',summery='%s',content='%s]", id, title, summery, content);
    }

    protected EsBlog() {//设为protected 防止直接使用
    }

    public EsBlog(String id, String title, String summery, String content) {
        this.id = id;
        this.title = title;
        this.summery = summery;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
