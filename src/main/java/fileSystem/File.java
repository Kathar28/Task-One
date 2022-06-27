package main.java.fileSystem;

public class File extends FileSystem {
    public File(String name, int size) {
        super(name, size);
    }

    @Override
    public void addElement(FileSystem type) {
        System.out.println("В файл ничего нельзя добавить");
    }
}
