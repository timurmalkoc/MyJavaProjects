package AbstractInterface;

public class MyListMAin {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList(null);
        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");


        for (String s:data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }

}
