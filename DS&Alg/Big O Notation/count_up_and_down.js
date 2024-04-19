/**
 * This function counts up from 0 to a given number, then counts down from the given number to 0.
 * @param {number} n - The number to count up to and down from.
 * @returns {void} - This function does not return a value.
 */
function countUpAndDown(n){
    console.log("Going Up!"); // Print a message indicating the start of counting up. Time complexity: O(1)

    // Loop to count up from 0 to n
    for (let i = 0; i < n; i++) { // Time complexity: O(n)
        console.log(i); // Print the current count
    }

    console.log("At the top!\nGoing down..."); // Print a message indicating the start of counting down. Time complexity: O(1)

    // Loop to count down from n to 0
    for (let i = n-1; i >= 0; i--) { // Time complexity: O(n)
        console.log(i); // Print the current count
    }

    console.log("Back down. Bye!"); // Print a message indicating the end of counting. Time complexity: O(1)
}
countUpAndDown(10);