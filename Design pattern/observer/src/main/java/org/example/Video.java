package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.example.base.Subject;

@EqualsAndHashCode(callSuper = true)
@Getter
public class Video extends Subject {
    private String title;
    private String name;
    private String author;

    public void setTitle(String title) {
        this.title = title;
        this.dataChange();
    }

    public void setName(String name) {
        this.name = name;
        this.dataChange();
    }

    public void setAuthor(String author) {
        this.author = author;
        this.dataChange();
    }

    public void dataChange() {
        this.notifyObserves();
    }
}
