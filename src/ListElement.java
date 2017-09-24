public class ListElement {
    private int data;
    private ListElement next;

    public ListElement() {
        //empty on purpose
    }

    public ListElement(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public boolean hasNext() {
        return null != next;
    }
}
