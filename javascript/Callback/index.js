 function GetCheese(callback){
    setTimeout(()=>{
        let cheese = '🧀';
        console.log("here is your cheese",cheese);
        callback(cheese);
    },1000);
 }

 function GetDough(cheese, callback){
    setTimeout(()=>{
        const dough = cheese + '🍩';
        console.log("here is your dough",dough);
        callback(dough);
    },1000);
 }

 function GetPizza(dough, callback){
    setTimeout(()=>{
        const pizza = dough + '🍕';
        console.log("here is your pizza",pizza);
        callback(pizza);
    },1000);
 }

// this is becoming a callback hell because we are nesting the functions inside each other and it is becoming difficult to read and understand the code
 GetCheese((cheese)=>{
    GetDough(cheese, (dough)=>{
        GetPizza(dough,(pizza)=>{
            console.log("get your pizza", pizza);
        })
    })
 })

 // hence the concept of promises was introduced to solve this problem

