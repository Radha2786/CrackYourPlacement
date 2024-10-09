function GetCheese(){
    return new Promise ((resolve,reject)=>{
        setTimeout(()=>{
            let cheese = '🧀';
            resolve(cheese);
        },1000);
    })
 }

 function MakeDough(cheese){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            const dough = cheese + '🍩';
            resolve(dough);
        },1000);
    })
 }

 function MakePizza(dough){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            const pizza = dough + '🍕';
            resolve(pizza);
        },1000);
    },1000);
 }

//  GetCheese().then((cheese)=>{
//     console.log("here is your cheese",cheese);
//     return MakeDough(cheese);
//  }).then((dough)=>{
//     console.log("here is your dough",dough);
//     return MakePizza(dough);
//  }).then((pizza)=>{
//     console.log("here is your pizza",pizza);
//  }).catch((error)=>{
//     console.log("error while making pizza",error);
//  }).finally(()=>{
//     console.log("done making pizza");
//  })

 // More Better way to write the above code is using async and await keyword 

    async function makePizza(){
        try{
            const cheese = await GetCheese();
            console.log("here is your cheese",cheese);
            const dough = await MakeDough(cheese);
            console.log("here is your dough",dough);
            const pizza = await MakePizza(dough);
            console.log("here is your pizza",pizza);
        }catch(error){
            console.log("error while making pizza",error);
        }
        console.log("done making pizza");
    }
    makePizza();