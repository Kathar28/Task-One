package main.java.fileSystem;

public class TextFile extends Files {

    private Files parent;

    private String text;

    public TextFile(String name, Files file) {
        super(name);
        this.parent = file;
        file.getContent().add(this);
        this.text = null;
    }

    public TextFile(String name, Files file, String text) {
        super(name);
        this.parent = file;
        file.getContent().add(this);
        this.text = text;
    }

    @Override
    public int getSize() {
        if (text == null) {
            return 0;
        } else {
            return text.length();
        }
    }

    @Override
    public String getPath() {
        return this.parent.getPath() + "/" + this.getName();
    }

    public Files getParent() {
        return parent;
    }

    @Override
    public void moveTo(Directory to) {
        to.getContent().add(this);
        this.parent.getContent().remove(this);
        this.parent = to;
    }
}
