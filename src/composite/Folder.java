package composite;

import java.util.List;

public class Folder implements IFolder {
    private String nodeName;

    public Folder(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public void display() {
        System.out.println("節點名稱：" + nodeName);
    }

    @Override
    public boolean addNode() {
        return false;
    }

    @Override
    public boolean delNode() {
        return false;
    }

    @Override
    public List<IFolder> getChildNode() {
        return null;
    }
}
