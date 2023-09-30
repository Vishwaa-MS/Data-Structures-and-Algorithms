public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll2.createLL(2);
        ll.createLL(1);
        for(int i =1; i<=10; i++){
            ll.insertNode(i+=1);
            ll2.insertNode(i+=2);
        }
        ll.traverseLL();
        ll2.traverseLL();
        Question q = new Question();
        q.sumList(ll,ll2);
//        q.deleteDuplicate(ll);
//
//        q.firstNthValue(ll,7);
//        q.partition(ll, 7);
//ll.traverseLL();
    }
}