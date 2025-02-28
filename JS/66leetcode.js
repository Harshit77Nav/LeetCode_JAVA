//66. Plus One

let digits = [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3];

let result = BigInt(digits.join("")) + 1n;

let output = result.toString().split("").map(Number);
console.log(output);
