// 28. Find the Index of the First Occurrence in a String

let haystack = "mississippi", needle = "issip";
let k = 0;
let index;
for(let i=0; i<haystack.length; i++){
    if(haystack[i] === needle[k]){
        let str = haystack.substring(i, i+needle.length);
        if(str === needle){
            console.log(i);
            break;
        }
    }
}
console.log(-1);

haystack.indexOf