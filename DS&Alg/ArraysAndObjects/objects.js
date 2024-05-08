// Define an object named 'instructor' with properties firstname, isInstructor, and favoriteNumbers
let instructor = {
    firstname: "Kelly",                  // firstname property with value "Kelly"
    isInstructor: true,                  // isInstructor property with value true
    favoriteNumbers: [1,2,3,4]           // favoriteNumbers property containing an array [1,2,3,4]
};

// Print the keys of the 'instructor' object
console.log(Object.keys(instructor));    // Output: ["firstname", "isInstructor", "favoriteNumbers"]
// Time Complexity: O(n), where n is the number of properties in the object 'instructor'

// Print the key-value pairs of the 'instructor' object as arrays
console.log(Object.entries(instructor)); // Output: [["firstname", "Kelly"], ["isInstructor", true], ["favoriteNumbers", [1, 2, 3, 4]]]
// Time Complexity: O(n), where n is the number of properties in the object 'instructor'

// Check if the 'instructor' object has a property named "firstname"
console.log(instructor.hasOwnProperty("firstname"));  // Output: true
// Time Complexity: O(1)
