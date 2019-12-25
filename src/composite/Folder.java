package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFolder {
    private String name;

    private List<IFolder> list = new ArrayList<>();

    public void display() {
        System.out.println("資料夾名：" + name);
    }

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public boolean addNode(IFolder node) {
        return list.add(node);
    }

    @Override
    public List<IFolder> getChildNode() {
        return list;
    }
}
