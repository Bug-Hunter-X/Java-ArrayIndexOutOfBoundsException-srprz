# Java ArrayIndexOutOfBoundsException Bug
This repository demonstrates a common Java programming error: the `IndexOutOfBoundsException`.  The bug.java file contains code that attempts to access an array element beyond its valid index range.  The bugSolution.java file provides the corrected code.

**Bug:** The `main` method attempts to access `arr[5]`, which is outside the bounds (0-4) of the array `arr`. 

**Solution:** The solution involves carefully checking array indices before accessing array elements, or using techniques like `try-catch` blocks to handle potential exceptions.