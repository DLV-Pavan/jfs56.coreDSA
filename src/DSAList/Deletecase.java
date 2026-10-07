package DSAList;

public class Deletecase {
	public ListNode deleteAtBeg(ListNode head)
	{
		head=head.next;
		return head;
	}
	public ListNode deleteAtPos(ListNode head,int pos)
	{
		ListNode ptr=head;
		for(int i=0;i<pos-1;i++)
		{
			ptr=ptr.next;
		}
		ListNode nodeToBeDeleted=ptr.next;
		ListNode nextNode=nodeToBeDeleted.next;
		ptr.next=nextNode;
		return head;
	}
	public ListNode deleteAtEnd(ListNode head)
	{
		ListNode ptr=head;
		while(ptr.next.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=null;
		return head;
	}
	public void traverse(ListNode head)
	{
		ListNode ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.val+"->");
			ptr=ptr.next;
		}
	}
	
	
}
