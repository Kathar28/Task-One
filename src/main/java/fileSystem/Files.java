package main.java.fileSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Files {
    private String name;
    private int size;

    private List<Files> content = new ArrayList<>();

    public Files(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return this.size;
    }

    public abstract String getPath();

    public abstract void moveTo(Directory to);

    public List<Files> getContent() {
        return content;
    }
}
