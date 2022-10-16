class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if(head.next==null){
            return head;
        }else{
        Node last=head;
        Node seclast=null;
        while(last.next!=null){
            seclast=last;
            last=last.next;
        }
        seclast.next=null;
        last.next=head;
        head=last;
        }
        return head;
    }
}
