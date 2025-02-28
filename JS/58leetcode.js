// 58. Length of Last Word

let s = "   fly me   to   the moon  "

let arr = s.split(" ");

for(let i=arr.length-1; i>=0; i--){
    if(arr[i] != ""){
        console.log(arr[i].length);
        break;        
    }
}