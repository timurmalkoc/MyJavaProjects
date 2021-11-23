package AbstractInterface;

import org.w3c.dom.NodeList;

public class MyLinkList implements INodeList {

    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
         return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        // if the list is empty set the first item
        if (this.root == null){
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                // item is greater, move right if possible
                if (currentItem.next() != null)
                    currentItem = currentItem.next();
                else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0){
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);


                } else {
                    // if node with previous is the root
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            }
            else{
                System.out.println(item.getValue() + " is already present, not added. ");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root==null)
            System.out.println("List is empty");
        while (root != null){
            System.out.println(root.getValue());
            root = root.next();

        }







    }
}
