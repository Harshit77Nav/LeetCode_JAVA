// 989. Add to Array-Form of Integer

let num = [1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3], k = 516;
let bigIntK = BigInt(k);
let sum = 0n;

let temp = BigInt(num.join(""))
sum = temp + bigIntK;
console.log(sum.toString().split("").map(Number));

//[1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9]