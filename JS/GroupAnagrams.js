// 49. Group Anagrams

let strs = ["eat","tea","tan","ate","nat","bat"];

let mymap = new Map();
for(let i=0; i<strs.length; i++) {
    let temp = strs[i].split("").sort().join("");
    if(mymap.has(temp)) {
        mymap.set(temp,mymap.get(temp)+" "+strs[i]);
    } else {
        mymap.set(temp, strs[i]);
    }
}
let res = [];
for(let [key, value] of mymap) {
    let temp = value.split(" ");
    res.push(temp);
    
}
console.log(res);

