/**
 * This function prints all pairs of numbers from 0 to a given number.
 * @param {number} n - The number up to which pairs will be printed.
 * @returns {void} - This function does not return a value.
 */
function printAllPairs(n){
    // Loop to iterate over numbers from 0 to n
    for (let i = 0; i < n; i++) { // Time complexity: O(n)
        // Nested loop to iterate over numbers from 0 to n for each iteration of the outer loop
        for (let j = 0; j < n; j++) { // Time complexity: O(n)
            console.log(i, j); // Print the pair (i, j)
        }
    }
}