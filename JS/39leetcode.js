// 39. Combination Sum (medium)

let candidates = [2,3,6,7], target = 6;

let set = new Set(candidates);
let result = [];
for(let i=0; i<candidates.length; i++) {
    let temp = [];
    if(candidates[i] == target) {
        temp.push(candidates[i]);
        result.push(temp);
        temp = [];
    }
    if(target%candidates[i]==0){
        console.log(parseInt(target/candidates[i]));
    }
}

