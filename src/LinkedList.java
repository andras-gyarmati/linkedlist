public class LinkedList {
    private ListElement head;

    public LinkedList() {
        //empty on purpose
    }

    public void add(ListElement newListElement) {
        if (null == head) {
            head = newListElement;
        } else {
            ListElement currentElement = head;
            while (currentElement.hasNext()) {
                currentElement = currentElement.getNext();
            }
            currentElement.setNext(newListElement);
        }
    }

    public ListElement get(int index) {
        if (null != head) {
            int i = 0;
            ListElement currentElement = head;
            while (i < index && currentElement.hasNext()) {
                currentElement = currentElement.getNext();
                i++;
            }
            if(i == index) {
                return currentElement;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public int size(){
        if (null != head) {
            int i = 1;
            ListElement currentElement = head;
            while (currentElement.hasNext()) {
                currentElement = currentElement.getNext();
                i++;
            }
            return i;
        }
        return 0;
    }
}
