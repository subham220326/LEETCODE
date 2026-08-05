<h2><a href="https://leetcode.com/problems/reverse-pairs">493. Reverse Pairs</a></h2><h3>Hard</h3><hr><p>Given an integer array <code>nums</code>, return <em>the number of <strong>reverse pairs</strong> in the array</em>.</p>

<p>A <strong>reverse pair</strong> is a pair <code>(i, j)</code> where:</p>

<ul>
	<li><code>0 &lt;= i &lt; j &lt; nums.length</code> and</li>
	<li><code>nums[i] &gt; 2 * nums[j]</code>.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,2,3,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The reverse pairs are:
(1, 4) --&gt; nums[1] = 3, nums[4] = 1, 3 &gt; 2 * 1
(3, 4) --&gt; nums[3] = 3, nums[4] = 1, 3 &gt; 2 * 1
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,4,3,5,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The reverse pairs are:
(1, 4) --&gt; nums[1] = 4, nums[4] = 1, 4 &gt; 2 * 1
(2, 4) --&gt; nums[2] = 3, nums[4] = 1, 3 &gt; 2 * 1
(3, 4) --&gt; nums[3] = 5, nums[4] = 1, 5 &gt; 2 * 1
</pre>
. Today: Reverse Pairs (Separated Logic)

Today, we cannot count and sort at the same time.
If we put L[i] > 2 * R[j] into our sorting loop, it would completely ruin the sorting algorithm (the array wouldn't end up sorted properly). If we left the sorting loop as L[i] > R[j], it wouldn't count the Reverse Pairs correctly.

The Solution: We must completely separate the counting from the merging.

If you look at today's mergeSort() function, you will see it happens in two distinct steps:

// 1. FIRST: Count the valid reverse pairs using a sliding window
count += countCrossPairs(nums, left, mid, right);

// 2. SECOND: Do a standard, completely normal merge sort step
merge(nums, left, mid, right);


By doing this, we can safely use the > 2 * nums[j] rule to count, and then use the standard > nums[j] rule to sort the arrays so they are ready for the next level of recursion.
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
