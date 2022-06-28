package main.java.fileSystem;

import java.util.List;

public class Directory extends Files {

    private final int size = 1;

    private Files parent;

    public Directory(String name) {
        super(name);
    }

    public Directory(String name, Files file) {
        super(name);
        this.parent = file;
        file.getContent().add(this);
    }

    @Override
    public int getSize() {
        int size = this.size;
        for (Files data : getContent()) {
            if (data instanceof Directory) {
                if (data.getContent().isEmpty()) {
                    size += data.getSize();
                    continue;
                } else {
                    size += data.getSize();
                }
            } else if (data instanceof TextFile) {
                size += data.getSize();
            }
        }
        return size;
    }

    @Override
    public String getPath() {
        if (this.parent == null) {
            return this.getName();
        }
        return this.parent.getPath() + "/" + this.getName();
    }

    public Files getParent() {
        return parent;
    }

    @Override
    public void moveTo(Directory to) {
        to.getContent().add(this);
        this.parent.getContent().remove(this);
        for (Files data : this.parent.getContent()) {
            if (data == this) {
                this.getContent().remove(this);
            }
        }
        this.parent = to;
    }
}
