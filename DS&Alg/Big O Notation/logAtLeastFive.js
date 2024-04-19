/**
 * This function logs numbers starting from 1 up to at least 5 or up to a given number, whichever is greater.
 * @param {number} n - The number up to which numbers will be logged.
 * @returns {void} - This function does not return a value.
 */
function logAtLeastFive(n){
    // Loop to iterate over numbers starting from 1 up to the maximum of 5 and n
    for (let i = 1; i <= Math.max(5, n); i++){ // Time complexity: O(n)
        console.log(i); // Print the current number
    }
}