package composite;

import java.util.List;
import java.util.Optional;

public class CompositeTest {
    // 組合設計模式：使用遞迴產生樹結構

    public static void main(String[] args) {
        var file1 = new File("file1.txt");
        var folder1 = new Folder("folder1");
        var file2 = new File("file2.txt");
        folder1.addNode(file2);

        var folder2 = new Folder("folder2");
        var file3 = new File("file3.txt");
        folder2.addNode(file3);
        folder1.addNode(folder2);

        var root = new Folder("root");
        root.addNode(file1);
        root.addNode(folder1);
//        displayDetail(root);
        displayDetail(root, 0);
    }

    private static void displayDetail(IFolder folder, int deep) {
        for (var i = 0; i < deep; i++) {
            System.out.print("|--");
        }
        folder.display();

        Optional<List<IFolder>> ocn = Optional.ofNullable(folder.getChildNode());
        ocn.ifPresent(l -> l.forEach(s -> displayDetail(s, deep + 1)));

//        List<IFolder> childNode = folder.getChildNode();
//        if (childNode != null) {
//            childNode.forEach(s -> displayDetail(s, deep + 1));
//        }
    }

    private static void displayDetail(IFolder folder) {
        folder.display();

        Optional<List<IFolder>> ocn = Optional.ofNullable(folder.getChildNode());
        ocn.ifPresent(s -> s.forEach(CompositeTest::displayDetail));
    }
}
