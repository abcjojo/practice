//package 笔试题.vipkid;
//
//i
//
///**
// * @program: exercise
// * @description:
// * @author: Jojo.Lee
// * @create: 2019-09-16 16:44
// **/
//class  ListNode  {
//    int  val;
//    ListNode  next;
//    ListNode(int  x)  {  val  =  x;  }
//}
//public class 列表相加 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ListNode head1 = null;
//        ListNode head2 = null;
//        ListNode temp1;
//        ListNode temp2;
//        int [] a1;
//        int [] a2;
//        while(sc.hasNext()){
//            String s1 = sc.nextLine();
//            String [] str1 = s1.split(" ");
//            a1 = new int [str1.length];
//            for(int i=0; i<str1.length;i++){
//                a1[i] = Integer.parseInt(str1[i]);
//            }
//
//            head1 = new ListNode(a1[0]);
//            temp1 = head1.next;
//            for(int i=1; i<str1.length;i++){
//                temp1 = new ListNode(a1[i]);
//                temp1 = temp1.next;
//            }
//            while(head1!=null){
//                System.out.println(head1.val);
//                head1 = head1.next;
//            }
//
//            String s2 = sc.nextLine();
//            String [] str2 = s2.split(" ");
//            a2 = new int [str2.length];
//            for(int i=0; i<str2.length;i++){
//                a2[i] = Integer.parseInt(str2[i]);
//            }
//        }
//
//
//
//        while(sc.hasNext()){
//            temp2 = new ListNode(sc.nextInt());
//            temp2 = temp2.next;
//        }
//
//        sc.close();
//        while(head1!=null && head2!=null){
//            System.out.println(head1.val+head2.val);
//            head1 = head1.next;
//            head2 = head2.next;
//        }
//
//        while(head2!=null){
//            System.out.println(head2.val);
//            head2 = head2.next;
//        }
//    }
//}
