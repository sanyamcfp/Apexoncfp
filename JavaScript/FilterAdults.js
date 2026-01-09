const users = [
    {name:"Alex", age: 17},
    {name:"Brian", age: 20},
    {name:"Catherine", age: 15},
    {name:"Diana", age: 22}
];

const adults = users.filter(user => user.age >=18);
console.log(adults);