# Word Frequency Max Heap

## Description
This project implements a **Max-Heap** using the standard **BUILD-MAX-HEAP (bottom-up)** procedure.

Each element in the heap is a `WordFreq` object that stores a survey phrase and its frequency.  
The frequency determines the priority in the heap (higher frequency = higher priority).

The program builds a max heap from a list of customer survey phrases and prints the heapified array.

---

## Data Used

| Phrase | Frequency |
|--------|-----------|
| happy | 400 |
| satisfied | 100 |
| neutral | 300 |
| would buy again | 200 |
| terrible | 160 |
| inconvenient | 900 |
| difficult to use | 100 |
| easy to use | 140 |
| would recommend to friends | 800 |
| visit the store | 700 |

---

## How It Works

1. Create `WordFreq` objects and store them in an array.
2. Use **bottom-up BUILD-MAX-HEAP** to construct a max heap.
3. The heap property ensures that each parent node has a frequency greater than or equal to its children.
4. Print the heapified array.
5. Verify the result using a function that checks if the array satisfies max-heap property.

---

## Key Methods

- `maxHeapify()` — Maintains max-heap property by pushing a node down.
- `buildMaxHeap()` — Builds heap using bottom-up method.
- `swap()` — Swaps two elements in the array.
- `isMaxHeap()` — Verifies the heap structure.

---

## Time Complexity

- `buildMaxHeap()` runs in **O(n)** time.

---

## Output Example

inconvenient: 900
would recommend to friends: 800
happy: 400
would buy again: 200
visit the store: 700
neutral: 300
difficult to use: 100
easy to use: 140
satisfied: 100
terrible: 160
Is max heap: true