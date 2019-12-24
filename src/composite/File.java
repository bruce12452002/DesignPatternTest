package composite;

import java.util.List;

public class File implements IFolder {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("檔案名稱：" + fileName);
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
