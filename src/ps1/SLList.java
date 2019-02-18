package ps1;
import java.util.HashSet;
import java.util.Set;

public class SLList
{
    Node header;
    static class Node
    {
        boolean elem;
        Node next;

        public Node()
        {
            elem = true;
            next = null;
        }
    }

    public SLList()
    {
        header = new Node();
    }

    boolean repOk()
    {
        Set<Node> visited = new HashSet<Node>();
        Node n = header;
        while (n != null) {
            if (!visited.add(n)) {
                return false;
            }
            n = n.next;
        }
        return true;
    }
    void add(boolean e) {
// precondition: this.repOk()
// postcondition: adds <e> in a new node at the beginning of the
// list; the rest of the list is unmodified
// your code goes here
    }
}

