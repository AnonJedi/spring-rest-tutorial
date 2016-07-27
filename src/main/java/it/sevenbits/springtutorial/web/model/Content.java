package it.sevenbits.springtutorial.web.model;

public class Content {
    private Long id = null;
    private String content = null;

    public Content(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Content(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", content='" + content + '\'' +
            '}';
    }
}
