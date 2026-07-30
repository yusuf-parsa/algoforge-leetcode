# AlgoForge LeetCode

A curated collection of my LeetCode solutions, documenting my progress in data structures, algorithms, and problem solving.

## Languages

- Java
- Python

## Repository structure

Solutions are organized by topic and language:

```text
solutions/
├── arrays/
├── backtracking/
├── binary-search/
├── bit-manipulation/
├── design/
├── dynamic-programming/
├── graphs/
├── heaps/
├── linked-lists/
├── math/
├── matrices/
├── sliding-window/
├── stacks-and-queues/
├── strings/
├── trees/
├── two-pointers/
└── other/
```

Within each topic, Python and Java solutions are kept in their respective language folders.

Each solution includes:

- Problem link
- Approach-focused code
- Time complexity
- Space complexity

## Progress

| # | Problem | Topic | Language | Time | Space |
|---:|---|---|---|---|---|
| 1 | [Two Sum](solutions/arrays/java/0001-two-sum.java) | Arrays / Hash Map | Java | O(n) | O(n) |
| 3 | [Longest Substring Without Repeating Characters](solutions/sliding-window/java/0003-longest-substring-without-repeating-characters.java) | Sliding Window / Hash Set | Java | O(n) | O(min(n, alphabet)) |
| 5 | [Longest Palindromic Substring](solutions/strings/java/0005-longest-palindromic-substring.java) | Strings / Expand Around Center | Java | O(n²) | O(1) |
| 7 | [Reverse Integer](solutions/math/java/0007-reverse-integer.java) | Math | Java | O(log \|x\|) | O(1) |
| 9 | [Palindrome Number](solutions/math/java/0009-palindrome-number.java) | Math | Java | O(log x) | O(1) |
| 11 | [Container With Most Water](solutions/two-pointers/java/0011-container-with-most-water.java) | Two Pointers | Java | O(n) | O(1) |
| 13 | [Roman to Integer](solutions/strings/java/0013-roman-to-integer.java) | Strings / Simulation | Java | O(n) | O(n) |
| 14 | [Longest Common Prefix](solutions/strings/java/0014-longest-common-prefix.java) | Strings | Java | O(n × m) | O(1) |
| 20 | [Valid Parentheses](solutions/stacks-and-queues/java/0020-valid-parentheses.java) | Stack | Java | O(n) | O(n) |
| 22 | [Generate Parentheses](solutions/backtracking/java/0022-generate-parentheses.java) | Backtracking | Java | O(4ⁿ / √n) | O(n) auxiliary |
| 26 | [Remove Duplicates from Sorted Array](solutions/arrays/java/0026-remove-duplicates-from-sorted-array.java) | Arrays / Ordered Set | Java | O(n log n) | O(n) |
| 27 | [Remove Element](solutions/arrays/java/0027-remove-element.java) | Arrays / Two Pointers | Java | O(n) | O(1) |
| 28 | [Find the Index of the First Occurrence in a String](solutions/strings/java/0028-find-the-index-of-the-first-occurrence-in-a-string.java) | Strings | Java | O(n × m) | O(1) |
| 31 | [Next Permutation](solutions/arrays/java/0031-next-permutation.java) | Arrays / Two Pointers | Java | O(n) | O(1) |
| 35 | [Search Insert Position](solutions/binary-search/java/0035-search-insert-position.java) | Binary Search | Java | O(log n) | O(1) |
| 41 | [First Missing Positive](solutions/arrays/java/0041-first-missing-positive.java) | Arrays / In-place Hashing | Java | O(n) | O(1) |
| 42 | [Trapping Rain Water](solutions/arrays/java/0042-trapping-rain-water.java) | Arrays / Prefix Maximum | Java | O(n) | O(n) |
| 49 | [Group Anagrams](solutions/strings/java/0049-group-anagrams.java) | Strings / Hash Map | Java | O(n × k) | O(n × k) |
| 54 | [Spiral Matrix](solutions/matrices/java/0054-spiral-matrix.java) | Matrix / Simulation | Java | O(m × n) | O(1) extra |
| 58 | [Length of Last Word](solutions/strings/java/0058-length-of-last-word.java) | Strings | Java | O(n) | O(n) |
| 66 | [Plus One](solutions/arrays/java/0066-plus-one.java) | Arrays / Math | Java | O(n) | O(1) extra |
| 83 | [Remove Duplicates from Sorted List](solutions/linked-lists/java/0083-remove-duplicates-from-sorted-list.java) | Linked List | Java | O(n) | O(1) |
| 88 | [Merge Sorted Array](solutions/arrays/java/0088-merge-sorted-array.java) | Arrays / Two Pointers | Java | O(m + n) | O(1) |
| 118 | [Pascal's Triangle](solutions/dynamic-programming/java/0118-pascals-triangle.java) | Dynamic Programming | Java | O(numRows²) | O(numRows) extra |
| 121 | [Best Time to Buy and Sell Stock](solutions/arrays/java/0121-best-time-to-buy-and-sell-stock.java) | Arrays / Greedy | Java | O(n) | O(1) |
| 125 | [Valid Palindrome](solutions/strings/java/0125-valid-palindrome.java) | Strings | Java | O(n²) | O(n) |
| 128 | [Longest Consecutive Sequence](solutions/arrays/java/0128-longest-consecutive-sequence.java) | Arrays / Hash Set | Java | O(n) average | O(n) |
| 136 | [Single Number](solutions/bit-manipulation/java/0136-single-number.java) | Bit Manipulation / XOR | Java | O(n) | O(1) |
| 141 | [Linked List Cycle](solutions/linked-lists/java/0141-linked-list-cycle.java) | Linked List / Floyd's Cycle Detection | Java | O(n) | O(1) |
| 169 | [Majority Element](solutions/arrays/java/0169-majority-element.java) | Arrays / Boyer–Moore | Java | O(n) | O(1) |
| 203 | [Remove Linked List Elements](solutions/linked-lists/java/0203-remove-linked-list-elements.java) | Linked List | Java | O(n) | O(1) |
| 205 | [Isomorphic Strings](solutions/strings/java/0205-isomorphic-strings.java) | Strings / Hash Map | Java | O(n) | O(k) |
| 217 | [Contains Duplicate](solutions/arrays/java/0217-contains-duplicate.java) | Arrays / Hash Set | Java | O(n) | O(n) |
| 219 | [Contains Duplicate II](solutions/arrays/java/0219-contains-duplicate-ii.java) | Sliding Window / Hash Set | Java | O(n) | O(min(n, k)) |
| 234 | [Palindrome Linked List](solutions/linked-lists/java/0234-palindrome-linked-list.java) | Linked List / Array | Java | O(n) | O(n) |
| 238 | [Product of Array Except Self](solutions/arrays/java/0238-product-of-array-except-self.java) | Arrays / Prefix-Postfix | Java | O(n) | O(1) extra |
| 242 | [Valid Anagram](solutions/strings/java/0242-valid-anagram.java) | Strings / Counting | Java | O(n) | O(1) |
| 268 | [Missing Number](solutions/arrays/java/0268-missing-number.java) | Arrays / Sorting | Java | O(n log n) | O(log n) |
| 344 | [Reverse String](solutions/strings/java/0344-reverse-string.java) | Strings / Two Pointers | Java | O(n) | O(1) |
| 345 | [Reverse Vowels of a String](solutions/strings/java/0345-reverse-vowels-of-a-string.java) | Strings / Two Pointers | Java | O(n) | O(n) |
| 347 | [Top K Frequent Elements](solutions/heaps/java/0347-top-k-frequent-elements.java) | Heap / Hash Map | Java | O(n log k) | O(n) |
| 392 | [Is Subsequence](solutions/strings/java/0392-is-subsequence.java) | Strings / Two Pointers | Java | O(\|t\|) | O(1) |
| 405 | [Convert a Number to Hexadecimal](solutions/bit-manipulation/java/0405-convert-a-number-to-hexadecimal.java) | Bit Manipulation | Java | O(1) | O(1) |
| 424 | [Longest Repeating Character Replacement](solutions/sliding-window/java/0424-longest-repeating-character-replacement.java) | Sliding Window | Java | O(n) | O(1) |
| 500 | [Keyboard Row](solutions/strings/java/0500-keyboard-row.java) | Strings | Java | O(c) | O(w) output |
| 507 | [Perfect Number](solutions/math/java/0507-perfect-number.java) | Math / Divisors | Java | O(n) | O(1) |
| 509 | [Fibonacci Number](solutions/dynamic-programming/java/0509-fibonacci-number.java) | Dynamic Programming / Recursion | Java | O(2ⁿ) | O(n) |
| 566 | [Reshape the Matrix](solutions/matrices/java/0566-reshape-the-matrix.java) | Matrix / Simulation | Java | O(m × n) | O(m × n) |
| 567 | [Permutation in String](solutions/sliding-window/java/0567-permutation-in-string.java) | Sliding Window / Counting | Java | O(\|s1\| + \|s2\|) | O(1) |
| 680 | [Valid Palindrome II](solutions/strings/java/0680-valid-palindrome-ii.java) | Strings / Two Pointers | Java | O(n) | O(1) |
| 705 | [Design HashSet](solutions/design/java/0705-design-hashset.java) | Design / ArrayList | Java | O(n) per operation | O(n) |
| 706 | [Design HashMap](solutions/design/java/0706-design-hashmap.java) | Design / Parallel Lists | Java | O(n) per operation | O(n) |
| 953 | [Verifying an Alien Dictionary](solutions/strings/java/0953-verifying-an-alien-dictionary.java) | Strings / Hash Map | Java | O(c) | O(1) |
| 1051 | [Height Checker](solutions/arrays/java/1051-height-checker.java) | Arrays / Sorting | Java | O(n log n) | O(n) |

**Solved: 54**

## License

This repository is available under the [MIT License](LICENSE).
