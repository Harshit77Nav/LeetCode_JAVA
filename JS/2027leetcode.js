// 2027. Minimum Moves to Convert String

let s = "OXOX"
let result = 0;
let i=0;
while(i<s.length){
    let flag = false;
    if(s[i] === "O"){
        i++;
        continue;
    }
    if(s[i] !== undefined && s[i] !== "O"){
        flag = true;
    }
    if(s[i+1] !== undefined && s[i+1] !== "O"){
        flag = true;
    }
    if (s[i + 2] !== undefined && s[i + 2] !== "O") {
        flag = true;
    }
    if(flag === true){
        result++;
    }
    i=i+3;
}
console.log(result);
