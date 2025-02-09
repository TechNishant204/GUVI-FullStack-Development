// variables and its types
// function and its types
// array and object
// MRF

/**
3 keywords to create variable:
Core JS:
var - Hoisted

ES6
let
const
*/
console.log(age) // undefined
var age // declaration
age = 20 // initialization
age = 21 // re-initilization

// Block scoped keyword
let name
name = "Vishnu"
name = "Vishnu Vardhan"

// Once initialization is made it cannot re-initialized with another value
const isMarried = true;
// 1isMarried = false

/**
Types of datatypes
1. Primittive - number, string, boolean
2. Non-Primitive - Array, Object
*/
const x = 10;
// x = 11; // Uncaught TypeError: Assignment to constant variable.

const arr = [1, 2, 3, 4, 5];
arr.push(6); // [1, 2, 3, 4, 5, 6]

// arr = [...arr, 7];

// functions
/**
1. Named function - Core JS - Hoisted
2. Anonymous fn - ES
3. Arrow fn - ES
4. IIFE - Core JS
*/

// named function
function test() {
	return 0;
}
// test();

// IIFE - Immidiately invoking function expression
//(function (a, b){
	//console.log(a, b)
// })(10, 20);

// Anonymous / Callback fn
// A fn without a name
/* 
Arrowed an fn
() => {

}

fn keyword an fn
function () {

} 
*/

var fn = function () {
console.log("Hey")
}
// fn();

// this keyword
// function a() {
//  console.log(this)
// }
// a()

// const b = () => {
// console.log(this)
// }
// b()
// console.log(data) // error
 const data = { 
 name: "Vishnu",
 age: 28,
getName: function () {
console.log(this)
},
getAge: () => {
console.log(this)
}
};

//data.getName()
// data.getAge()

// Array and Object
// Array as Datastructure
const arrs = [5, 7, 12, 2, 4, 1]; // Easy to search element
// arrs[5] = 10;
// console.log(arrs.length)
// Adding e to last
// arrs.push(10)
// console.log(arrs)
// Adding e to start
// arrs.unshift(0)
// console.log(arrs)

// Getting single element from the array
// console.log(arrs[1])
// console.log(arrs[2])

// Slicing
// Slicing will create a new array of selceted range and it wont modify the existing arr
/// Params: start = number & end = number + 1
console.log(arrs.slice(1, 4))
console.log(arrs)

// splicing
// Splicing will modify the exisiting array
// Params: start = number & end = number
console.log(arrs.splice(1, 3))
console.log(arrs)

// Concatinate two array
const f = [1, 2]
const g = [3, 4]

console.log("Concatinated arr = ", f.concat(g))
console.log(f.concat(10, 11))



// raise a mail for type conversion / type casting and type coercing
// type coercing
// console.log(+"-1"-0)
let j = 0;

function d() {
	let j = 1;
	// console.log(j) // 1
}
d()
// console.log(j)

// console.log([1, 2] + [3, 4])

// valueOf([])// valueOf([])
