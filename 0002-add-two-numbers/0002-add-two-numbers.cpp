class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        string s1 = "", s2 = "";

        // Convert the first linked list into a reversed string
        while (l1) {
            s1 = to_string(l1->val) + s1;
            l1 = l1->next;
        }

        // Convert the second linked list into a reversed string
        while (l2) {
            s2 = to_string(l2->val) + s2;
            l2 = l2->next;
        }

        // Perform string-based addition
        string sumString = addStrings(s1, s2);

        // Convert the sum string into a linked list
        ListNode* dummy = new ListNode(0);
        ListNode* current = dummy;

        for (int i = sumString.size() - 1; i >= 0; i--) {
            current->next = new ListNode(sumString[i] - '0');
            current = current->next;
        }

        return dummy->next;
    }

private:
    // Helper function to add two strings representing numbers
    string addStrings(string num1, string num2) {
        string result = "";
        int carry = 0, i = num1.size() - 1, j = num2.size() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1[i--] - '0' : 0;
            int digit2 = (j >= 0) ? num2[j--] - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result += (sum % 10) + '0';
        }

        reverse(result.begin(), result.end());
        return result;
    }
};
