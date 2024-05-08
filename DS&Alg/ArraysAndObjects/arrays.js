// Define an array
let numbers = [3, 1, 4, 1, 5, 9, 2, 6];

// Accessing elements:
console.log(numbers[2]); // Accessing an element by index: Output: 4
// Time complexity: O(1)

// Searching for a value:
console.log(numbers.indexOf(5)); // Searching for the index of value 5: Output: 4
// Time complexity: O(n)

// Removing an element:
let removedElement = numbers.pop(); // Remove the last element: Output: 6
// Time complexity: O(1)

// Adding an element:
numbers.push(7); // Add an element to the end: [3, 1, 4, 1, 5, 9, 2, 7]
// Time complexity: O(1)

// Removing the first element:
let firstElement = numbers.shift(); // Remove the first element: Output: 3
// Time complexity: O(n)

// Adding an element to the beginning:
numbers.unshift(8); // Add an element to the beginning: [8, 1, 4, 1, 5, 9, 2, 7]
// Time complexity: O(n)

// Concatenating arrays:
let moreNumbers = [10, 11, 12];
let combinedArray = numbers.concat(moreNumbers); // Concatenate arrays: [8, 1, 4, 1, 5, 9, 2, 7, 10, 11, 12]
// Time complexity: O(n)

// Slicing an array:
let slicedArray = numbers.slice(2, 5); // Slice array from index 2 to index 4: [4, 1, 5]
// Time complexity: O(n)

// Splicing an array:
let splicedArray = numbers.splice(2, 3); // Remove 3 elements starting from index 2: [4, 1, 5]
// Time complexity: O(n)

// Sorting an array:
numbers.sort(); // Sort the array in ascending order: [1, 1, 2, 4, 5, 7, 8, 9]
// Time complexity: O(n log n)

// Filtering elements:
let filteredArray = numbers.filter(num => num > 5); // Filter elements greater than 5: [7, 8, 9]
// Time complexity: O(n)

// Reducing elements:
let sum = numbers.reduce((accumulator, currentValue) => accumulator + currentValue, 0); // Calculate sum: 37
// Time complexity: O(n)

// Mapping elements:
let doubledArray = numbers.map(num => num * 2); // Double each element: [2, 2, 4, 8, 10, 14, 16, 18]
// Time complexity: O(n)
