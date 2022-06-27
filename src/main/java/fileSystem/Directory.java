package main.java.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem {

    private final int size = 1;
    private List<FileSystem> content;

    public Directory(String name) {
        super(name);
        content = new ArrayList<>();
    }

    @Override
    public FileSystem getElement(int index) {
        return content.get(index);
    }


    public void addElement(FileSystem types) {
        types.setPath(getPath());
        content.add(types);
    }

    @Override
    public List<FileSystem> getContent() {
        return this.content;
    }

    @Override
    public int getSize() {
        int size = this.size;
        for (FileSystem data : content) {
            if (data instanceof Directory) {
                if (data.getContent().isEmpty()) {
                    size += data.getSize();
                    continue;
                } else {
                    size += data.getSize();
                }
            } else if (data instanceof File) {
                size += data.getSize();
            }
        }
        return size;
    }
}
