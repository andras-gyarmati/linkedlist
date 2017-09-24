public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 7; i++) {
            list.add(new ListElement(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getData() + ", ");
        }
    }
}
