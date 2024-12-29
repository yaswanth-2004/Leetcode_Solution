class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        int start = -1, end = -1;

        // Find the first occurrence (start)
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                start = mid;
                r = mid -
                    1; // Keep searching to the left for the first occurrence
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        // If the target wasn't found at all, return [-1, -1]
        if (start == -1) {
            return {start, end};
        }

        // Find the last occurrence (end)
        l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                end = mid;
                l = mid +
                    1; // Keep searching to the right for the last occurrence
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return {start, end};
    }
};

