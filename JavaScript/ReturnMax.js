const nums = [5,12,8,160,44];
const max = nums.reduce((a,b) => a > b ? a : b);
console.log(max);