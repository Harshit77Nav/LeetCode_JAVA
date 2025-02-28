// 1945. Sum of Digits of String After Convert

let s = "zbax", k = 2; 
let str = "";

for(let i=0; i<s.length; i++){
    str = str+`${s.charCodeAt(i)-96}`;
}

for(let i=0; i<k; i++){
    let sum = 0;
    for(let j=0; j<str.length; j++){
        sum = sum + parseInt(str[j]);
    }        
    str = sum.toString();
}
console.log(str);


