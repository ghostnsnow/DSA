package tree.binarytree.base;

public class BinaryTreeArray<T> {

    private T[] nodes;
    private int lastUsedIndex;

    public BinaryTreeArray(int size) {

        nodes = (T[]) new Object[size];
        lastUsedIndex = 0;//not using the 1st index helps in calculation. Index of left child = 2*parentIndex & Index of right child = 2*parentIndex + 1. parentIndex = childIndex/2.
    }

    public T[] getNodes() {
        return nodes;
    }

    public void setNodes(T[] nodes) {
        this.nodes = nodes;
    }

    public void resize() {

        T[] newArr = (T[]) new Object[nodes.length * 2];

        for (int i = 1; i < nodes.length; i++) {

            newArr[i] = nodes[i];
        }

        nodes = newArr;
    }

    public void insertElementInBT(T valueToInsert) {

        if (lastUsedIndex == nodes.length - 1) {

            resize();
        }

        nodes[++lastUsedIndex] = valueToInsert;
    }

    public void preOrderTraversal(int index) {

        if (index > lastUsedIndex) return;

        System.out.println(nodes[index]);
        int left = 2*index;
        preOrderTraversal(left);
        preOrderTraversal(left + 1);

        /*int left = 2*index;

        if (left < nodes.length) {

            if (null != nodes[left]) {

                preOrderTraversal(left);
            }

            if (null != nodes[left + 1]) {

                preOrderTraversal(left + 1);
            }
        }*/
    }

    public void inOrderTraversal(int index) {

        if (index > lastUsedIndex) return;

        int left = 2*index;
        inOrderTraversal(left);
        System.out.println(nodes[index]);
        inOrderTraversal(left + 1);

        /*int left = 2*index;

        if (left < nodes.length) {

            if (null != nodes[left]) {

                inOrderTraversal(left);
            }
        }

        System.out.println(nodes[index]);

        if (left + 1 < nodes.length) {

            if (null != nodes[left + 1]) {

                inOrderTraversal(left + 1);
            }
        }*/
    }

    public void postOrderTraversal(int index) {

        if (index > lastUsedIndex) return;

        int left = 2*index;
        postOrderTraversal(left);
        postOrderTraversal(left + 1);
        System.out.println(nodes[index]);

        /*int left = 2*index;

        if (left < nodes.length) {

            if (null != nodes[left]) {

                postOrderTraversal(left);
            }
        }

        if (left + 1 < nodes.length) {

            if (null != nodes[left + 1]) {

                postOrderTraversal(left + 1);
            }
        }

        System.out.println(nodes[index]);*/
    }

    public void levelOrderTraversal() {

        for (int i = 1; i < lastUsedIndex + 1; i++) {

            System.out.println(nodes[i]);
        }
    }

    public int searchElementInBT(T valueToSearch) {

        for (int i = 1; i < lastUsedIndex + 1; i++) {

            if (nodes[i].equals(valueToSearch)) {

                System.out.println("Node found at index : " + i);
                return i;
            }
        }

        System.out.println("Node not found in tree");
        return -1;
    }

    public void deleteElementInBT(T valueToDelete) {

        int index = searchElementInBT(valueToDelete);

        if (index != -1) {

            nodes[index] = nodes[lastUsedIndex];
            lastUsedIndex--;
        }
    }

    public void deleteBT() {

        nodes = null;
    }
}
