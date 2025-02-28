//9. Palindrome Number

let x = 525251; 
let temp = x;
let x2 = 0;
while(temp>0){
    let a = temp%10;
    x2 = (x2*10) + a;
    temp = parseInt(temp/10);
}

if(x === x2){
    console.log(true);
} else {
    console.log(false);
    
}
