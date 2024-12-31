/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        struct ListNode *th1=headA,*th2=headB;
        while(th1!=th2){
            th1=th1==NULL ? headB :th1-> next;
            th2=th2==NULL ? headA :th2-> next;
        }
        return th1;
    }
};
