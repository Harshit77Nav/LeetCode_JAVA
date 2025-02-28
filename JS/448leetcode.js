// 448. Find All Numbers Disappeared in an Array

let nums = [2,3,3,4];
nums.sort();
let n = nums.length;
let s = 1;
let index = 0;
let arr = [];
while(s<=n){
    if(s!=nums[index]){
        arr.push(s);
        if(s<=index){
            s++;
        } else{
            index++
        }
    } else if(s == nums[index] ){
        s++;
        index++;
    }
}
console.log(arr,nums);
