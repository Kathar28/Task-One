package main.java.fileSystem;

public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory dir1 = new Directory("dir1", root);
        Directory dir2 = new Directory("dir2", root);
        TextFile file1 = new TextFile("file1.txt", dir1, "Hello");
        TextFile file2 = new TextFile("file2.txt", dir1);

        System.out.println(dir1.getPath());
        System.out.println(dir1.getSize());

        System.out.println(file1.getPath());

        file1.moveTo(dir2);
        System.out.println(dir1.getSize());

        System.out.println(file1.getPath());

        Directory dir3 = new Directory("dir3", dir1);
        Directory dir4 = new Directory("dir4", dir3);

        System.out.println(dir4.getPath());

        dir4.moveTo(dir2);

        System.out.println(dir4.getPath());
    }
}