package main.java.fileSystem;

import java.util.List;

public class File extends SystemTypes {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }


    @Override
    public String getPath(SystemTypes node, String path) {
        for (SystemTypes data : node.getContent()) {
            if (data instanceof File) {
                if (data.getName() == this.getName()) {
                    path += "/" + data.getName();
                }
            } else if (data instanceof Directory) {
                if (data.getContent().isEmpty()) {
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
