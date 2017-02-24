package com.aouyu.apps.v2ex.bean;

/**
 * Created by fangxiaotian on 2017/2/24.
 */

public class HotTopic {

    /**
     * id : 342757
     * title : 全球最大的同性交友网站 Github 上不去了？
     * url : http://www.v2ex.com/t/342757
     * content : 是不是被墙了…… ``` $ ping -c4 github.com PING github.com (192.30.253.112): 56 data bytes Request timeout for icmp_seq 0 Request timeout for icmp_seq 1 Request timeout for icmp_seq 2 --- github.com ping statistics --- 4 packets transmitted, 0 packets received, 100.0% packet loss $ git clone git@github.com:sqlmapproject/sqlmap.git Cloning into 'sqlmap'... ssh: connect to host github.com port 22: Operation timed out fatal: Could not read from remote repository. Please make sure you have the correct access rights and the repository exists. ```
     * content_rendered : <p>是不是被墙了……</p> <pre><code>$ ping -c4 github.com PING github.com (192.30.253.112): 56 data bytes Request timeout for icmp_seq 0 Request timeout for icmp_seq 1 Request timeout for icmp_seq 2 --- github.com ping statistics --- 4 packets transmitted, 0 packets received, 100.0% packet loss $ git clone git@github.com:sqlmapproject/sqlmap.git Cloning into 'sqlmap'... ssh: connect to host github.com port 22: Operation timed out fatal: Could not read from remote repository. Please make sure you have the correct access rights and the repository exists. </code></pre>
     * replies : 156
     * member : Member
     * node : Node
     * created : 1487857944
     * last_modified : 1487858161
     * last_touched : 1487909235
     */

    private int id;
    private String title;
    private String url;
    private String content;
    private String content_rendered;
    private int replies;
    private Member member;
    private Node node;
    private int created;
    private int last_modified;
    private int last_touched;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_rendered() {
        return content_rendered;
    }

    public void setContent_rendered(String content_rendered) {
        this.content_rendered = content_rendered;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(int last_modified) {
        this.last_modified = last_modified;
    }

    public int getLast_touched() {
        return last_touched;
    }

    public void setLast_touched(int last_touched) {
        this.last_touched = last_touched;
    }

    @Override
    public String toString() {
        return "HotTopic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", content='" + content + '\'' +
                ", content_rendered='" + content_rendered + '\'' +
                ", replies=" + replies +
                ", member=" + member +
                ", node=" + node +
                ", created=" + created +
                ", last_modified=" + last_modified +
                ", last_touched=" + last_touched +
                '}';
    }
}
