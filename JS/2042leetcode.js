// 2042. Check if Numbers Are Ascending in a Sentence

let s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
let strArr = s.split(" ");
let max = -1;
let iteration = 0;
for(let i=0; i<strArr.length; i++){
    if(parseInt(strArr[i]) > -1){
        if (parseInt(strArr[i]) > max){
            max = parseInt(strArr[i]);
        } else{
            break;
        }
    }
    iteration++;
}

if(iteration == strArr.length){
    console.log(true);   
} else {
    console.log(false);
}
