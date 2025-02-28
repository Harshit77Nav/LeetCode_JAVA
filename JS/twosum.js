let nums = [2,7,11,15], target = 9;

let map = new Map();
for(let i=0; i<nums.length; i++){
    let otherNum = target - nums[i];
    if(map.has(otherNum)){
        console.log([map.get(otherNum), i]);
    }
    map.set(nums[i],i);
}
console.log("end");
