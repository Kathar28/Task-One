package main.java.fileSystem;

import java.util.List;

public abstract class FileSystem {
    private String name;
    private int size;
    private String path;

    public FileSystem(String name) {
        this.name = name;
        this.path = name;
    }

    public FileSystem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return this.size;
    }

    public FileSystem getElement(int index) {
        return null;
    }

    public abstract void addElement(FileSystem type) ;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path + "/" + getName();
    }

    public List<FileSystem> getContent() {
        return null;
    }
}
