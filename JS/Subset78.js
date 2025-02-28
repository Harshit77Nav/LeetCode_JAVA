// 78. Subsets

let  nums = [1,2,3];

let result = [[]];
for(let i=0; i<nums.length; i++){
    let length = result.length;
    for(let j=0; j<length; j++){
        let temp = [...result[j],nums[i]];
        result.push(temp)
    }
}
console.log(result);
