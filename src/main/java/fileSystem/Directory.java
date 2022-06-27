package main.java.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends SystemTypes {

    private int size;

    private List<SystemTypes> content;

    public Directory(String name) {
        super(name);
        this.size = 1;
        content = new ArrayList<>();
    }

    @Override
    public SystemTypes get(int index) {
        return content.get(index);
    }

    @Override
    public void add(SystemTypes types) {
        content.add(types);
    }

    @Override
    public List<SystemTypes> getContent() {
        return this.content;
    }

    @Override
    public int getContentSize(SystemTypes node, int sum) {
        for (SystemTypes data : node.getContent()) {
            if (data instanceof Directory) {
                sum = 1 + getContentSize(data, sum);
            } else if (data instanceof File) {
                sum += data.getSize();
            }
        }
        return sum;
    }

    @Override
    public String getPath(SystemTypes node, String path) {
        for (SystemTypes data : node.getContent()) {
            if (data instanceof Directory) {
                if (data.getName() == this.getName()) {
                    path += "/" + data.getName();
                    return path;
                } else if (((Directory) data).content.isEmpty()) {
                    continue;
                } else {
                    path += "/" + data.getName() + getPath(data, "");
                }
            }
        }
        return path;
    }

    @Override
    public int getSize() {
        return this.size;
    }

}
