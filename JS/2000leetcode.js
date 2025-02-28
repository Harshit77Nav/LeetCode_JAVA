// 2000. Reverse Prefix of Word

let word = "abcd", ch = "z";
let result = "";
let flag = false;
for(let i=0; i<word.length; i++){
    if(word[i]!=ch && !flag){
        result = word[i] + result;
    } else if (word[i]==ch && !flag){
        result = word[i] + result; 
        flag = true;
    } else {
        result += word[i];
    }
}
if(flag){
    console.log(result);
} else {
    console.log(word);
}
