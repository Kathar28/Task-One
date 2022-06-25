package main.java.fileSystem;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class SystemTypes {
    private String name;

    private String date;

    public String getName() {
        return name;
    }

    public SystemTypes(String name) {
        this.name = name;
        Date date = new Date();
        this.date = date.toString();
    }

    public SystemTypes get(int index) {
        return null;
    }

    public void add(SystemTypes types) {}

    public int getContentSize(SystemTypes node, int sum) {
        return 0;
    }

    public abstract String getPath(SystemTypes node, String path);

    public abstract int getSize();

    public List<SystemTypes> getContent() {
        return null;
    }


    public String getDate() {

        return this.date;
    }
}
