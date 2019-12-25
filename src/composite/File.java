package composite;

import java.util.List;

public class File implements IFolder {
    private String name;

    public void display() {
        System.out.println("檔名：" + name);
    }

    public File(String name) {
        this.name = name;
    }

    @Override
    public boolean addNode(IFolder node) {
        return false;
    }

    @Override
    public List<IFolder> getChildNode() {
        return null;
    }
}
