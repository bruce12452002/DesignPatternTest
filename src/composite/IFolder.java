package composite;

import java.util.List;

public interface IFolder {
    void display();

    boolean addNode(IFolder node);

    List<IFolder> getChildNode();
}
