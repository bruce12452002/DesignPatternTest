package composite;

import java.util.List;

public interface IFolder {
    void display();

    boolean addNode();

    boolean delNode();

    List<IFolder> getChildNode();
}
