package ArrayPrograms;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length; // insert at end
    }
    public static void main(String[] args) {
        int[] numbers = {1,3,5,6};

        System.out.println(searchInsert(numbers, 5)); // 2
        System.out.println(searchInsert(numbers, 2)); // 1
        System.out.println(searchInsert(numbers, 7)); // 4
    }
}
/*✅ What Your Code Is Doing
for (int i = 0; i < nums.length; i++) {
    if (nums[i] >= target) {
        return i;
    }
}
return nums.length;
Logic:

Traverse array from left to right

As soon as:

element == target → return index

element > target → return index (insertion position)

If nothing found → insert at end

✔ Clean
✔ Easy to understand
✔ No extra space

🔎 Dry Run
Case 1: target = 5
1 < 5
3 < 5
5 >= 5 → return 2

Output: 2 ✔

Case 2: target = 2
1 < 2
3 >= 2 → return 1

Output: 1 ✔

Case 3: target = 7
1 < 7
3 < 7
5 < 7
6 < 7
Loop ends → return nums.length → 4

Output: 4 ✔*/