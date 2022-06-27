package main.java.fileSystem;

public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        root.add(new File("file0.txt", 150));
        root.add(new File("file1.txt", 250));
        root.add(new Directory("directory"));
        root.getElement(2).add(new File("file2.txt", 250));
        root.getElement(2).add(new File("file3.txt", 250));
        root.getElement(2).add(new Directory("directory1"));
        root.getElement(2).getElement(2).add(new File("file4.txt", 250));
        root.getElement(2).add(new Directory("directory2"));

        System.out.println(root.getPath());

        System.out.println(root.getSize());

        System.out.println(root.getElement(2).getElement(2).getPath());

        System.out.println(root.getElement(2).getElement(2).getSize());

        System.out.println(root.getElement(2).getElement(2).getElement(0).getPath());

        System.out.println(root.getElement(2).getElement(2).getElement(0).getSize());
    }
}