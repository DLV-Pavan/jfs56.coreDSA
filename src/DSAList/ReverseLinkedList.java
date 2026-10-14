package DSAList;

public class ReverseLinkedList {
	public ListNode reverseWithsp(ListNode head)
	{
		if(head==null)
		{
			return null;
		}
		if(head.next==null)
		{
			return head;
		}
		ListNode preNode=null;
		ListNode curNode=head;
		while(curNode!=null)
		{
			ListNode nextNode=curNode.next;
			curNode.next=preNode;
			preNode
		}
	}

}
