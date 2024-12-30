/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* curr=head,*prev=NULL,*nextNode=NULL;
    while(curr != NULL){
        nextNode=curr -> next;
        curr -> next = prev;
        prev=curr;
        curr=nextNode;
    }
    return prev;
}
