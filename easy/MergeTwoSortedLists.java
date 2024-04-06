import java.util.List;



public class MergeTwoSortedLists {

  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  public static void main(String[] args) {
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
    System.out.println(mergeTwoLists(list1, list2));
  }



  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedList;

    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }

    if(list1.val > list2.val){
      mergedList = new ListNode(list2.val);
      mergedList.next = mergeTwoLists(list1, list2.next);
      return mergedList;
    } else {
      mergedList = new ListNode(list1.val);
      mergedList.next = mergeTwoLists(list1.next, list2);
      return mergedList;
    }


  }
}

