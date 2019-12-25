package composite;

import java.util.List;

public class CompositeTest {
    // 組合設計模式：使用遞迴產生樹結構

    public static void main(String[] args) {
        var file1 = new File("file1.txt");
        var folder1 = new Folder("folder1");
        var file2 = new File("file2.txt");
        folder1.addNode(file2);

        var root = new Folder("root");
        root.addNode(file1);
        root.addNode(folder1);
        displayDetail(root);
    }

    private static void displayDetail(IFolder folder) {
        folder.display();

        List<IFolder> childNode = folder.getChildNode();
        if (childNode != null) {
            childNode.forEach(CompositeTest::displayDetail);
        }

    }
}
