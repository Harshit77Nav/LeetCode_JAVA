// 3110. Score of a String

let s = "zaz";
let sum = 0;
for(let i=0; i<s.length-1; i++){
    sum = sum + Math.abs(s.charCodeAt(i)-s.charCodeAt(i+1));
}
console.log(sum);
