import java.util.Comparator;

public class SingLinkListNode {
    String word;
    private int count;
    private SingLinkListNode next;


    public SingLinkListNode(String word) {
        this.word = word;
        this.count = 1;
        this.next = null;
    }
    public String getWord() {
        return this.word;
    }
    public int getCount() {
        return count;
    }
    public void addCount() {
        this.count++;
    }
    public void subCount() {
        this.count--;
    }
    public SingLinkListNode getNext (){
        return(this.next);
    }
    public void setNext (SingLinkListNode c) {
        this.next = c;
    }
    public static Comparator<SingLinkListNode> NodeWordComparator = new Comparator<SingLinkListNode>() {


        public int compare(SingLinkListNode s1, SingLinkListNode s2) {
            String word1 = s1.getWord();
            String word2 = s2.getWord();

            return word1.compareTo(word2);

        }
    };
    public static Comparator<SingLinkListNode> wordCountComparator = new Comparator<SingLinkListNode>() {

        public int compare(SingLinkListNode o1, SingLinkListNode o2) {
            int node1 = o1.getCount();
            int node2 = o2.getCount();

            return node2 - node1;
        }
    };
    @Override public String toString() {
        return (word + " - " + count);
    }
}
